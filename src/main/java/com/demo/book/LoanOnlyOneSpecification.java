package com.demo.book;

public class LoanOnlyOneSpecification implements ISpecification <Member>{

    @Override
    public boolean IsSatisfiedBy(Member member) {
        boolean book = member.getLoans().stream().noneMatch(loan -> loan.HasNotBeenReturned()
                &&loan.getBook().getISBN().equals(wantBook.getISBN()));
        if (!book){
            System.out.println(member.getName()+"已经借了"+wantBook.getTitle()+",不能再借"+"！");
        }
        return book;

    }

    private Book wantBook;

    public  LoanOnlyOneSpecification(Book wantBook){
        this.wantBook = wantBook;
    }


}
