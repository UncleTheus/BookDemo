package com.demo.book;

import java.time.LocalDate;
import java.time.LocalDateTime;
;


public class Loan {

    public String Id;

    public LocalDateTime LoanDate;

    public LocalDateTime DateForReturn;

    public LocalDateTime ReturnDate;

    public Book Book;

    public Member Member;

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        this.Id = id;
    }

    public LocalDateTime getLoanDate() {
        return LoanDate;
    }

    public void setLoanDate(LocalDateTime loanDate) {
        this.LoanDate = loanDate;
    }

    public LocalDateTime getDateForReturn() {
        return DateForReturn;
    }

    public void setDateForReturn(LocalDateTime dateForReturn) {
        this.DateForReturn = dateForReturn;
    }

    public LocalDateTime getReturnDate() {
        return ReturnDate;
    }

    public void setReturnDate(LocalDateTime returnDate) {
        this.ReturnDate = returnDate;
    }

    public Book getBook() {
        return Book;
    }

    public void setBook(Book book) {
        this.Book = book;
    }

    public Member getMember() {
        return Member;
    }

    public void setMember(Member member) {
        this.Member = member;
    }

    public boolean HasNotBeenReturned(){
        return ReturnDate == null;
    }

    public void MarkAsReturned(){
        ReturnDate = LocalDateTime.now();
    }
}
