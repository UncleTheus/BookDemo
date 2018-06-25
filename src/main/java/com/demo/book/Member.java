package com.demo.book;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Member {

    private String Id;

    public String Name;

    public Member(String Id,String Name){
        this.Id = Id;
        this.Name = Name;
    }

    public ArrayList<Loan> Loans = new ArrayList<Loan>();

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        this.Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public ArrayList<Loan> getLoans() {
        return Loans;
    }

    public void setLoans(ArrayList<Loan> loans) {
        this.Loans = loans;
    }

    public final void Return(Book book){
       Loan loan = FindCurrentLoanFor(book);
        if (loan != null){
            loan.MarkAsReturned();
            book.setLoanTo(null);
            System.out.println(getName()+"已成功归还"+book.getTitle()+"!");
        }

    }


    public boolean CanLoan(Book book){
        if (book.getLoanTo() != null){
            System.out.println(this.getName() + "尝试借" + book.getTitle() + "失败，书已借出");
            return false;
        }
        HasReachMaxSpecification hasReachMaxSpecification = new HasReachMaxSpecification();
        if (!hasReachMaxSpecification.IsSatisfiedBy(this)){
            return false;
        }
        LoanOnlyOneSpecification loanOnlyOneSpecification = new LoanOnlyOneSpecification(book);
        return loanOnlyOneSpecification.IsSatisfiedBy(this);
    }

    public final Loan loan(Book book){
        Loan loan = null;
        if (CanLoan(book)){
            loan = LoanFactory.CreateLoan(book,this);
            getLoans().add(loan);
            book.setLoanTo(this);
            System.out.println(getName()+"已成功借"+book.getTitle()+"!");
        }
        return loan;
    }

    public Loan FindCurrentLoanFor(Book book){
        Member loanTo = book.getLoanTo();
        if (loanTo == null || !loanTo.getId().equals(this.getId())){
            return null;
        }
        for (Loan loan : getLoans()) {
            if(loan.getBook().getId().equals(book.getId())
                    &&loan.HasNotBeenReturned()){
                return loan;
            }
        }
        return null;
    }
}
