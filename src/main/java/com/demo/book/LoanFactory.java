package com.demo.book;

import java.time.LocalDateTime;

public class LoanFactory {

    public static Loan CreateLoan(Book book,Member member){
        Loan loan = new Loan();
        loan.Book = book;
        loan.Member = member;
        loan.LoanDate = LocalDateTime.now();
        loan.DateForReturn = LocalDateTime.now().plusDays(10);
        return loan;
    }
}
