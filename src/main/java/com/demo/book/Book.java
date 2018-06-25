package com.demo.book;

public class Book{
    private String Id;

    public Book(String Id, String ISBN, String Title) {
        this.Id = Id;
        this.ISBN = ISBN;
        this.Title = Title;
    }

    public final String getId() {
        return Id;
    }

    public final void setId(String id){
        this.Id = id;
    }

    private String ISBN;

    public final String getISBN(){
        return ISBN;
    }

    public final void setISBN(String isbn){
        this.ISBN = isbn;
    }

    private String Title;

    public final String getTitle(){
        return Title;
    }

    public final void setTitle(String title){
        this.Title = title;
    }

    private Member LoanTo;

    public Member getLoanTo(){
        return LoanTo;
    }

    public void setLoanTo(Member loanTo){
        this.LoanTo = loanTo;
    }
}
