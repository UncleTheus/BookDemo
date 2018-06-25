package com.demo.book;


public class HasReachMaxSpecification implements ISpecification<Member> {

    @Override
    public boolean IsSatisfiedBy(Member member) {
        int max = 3;
        boolean book = member.getLoans().stream().filter(Loan::HasNotBeenReturned).count() < max;
        if(!book){
            System.out.println(member.getName() + "已经借了" + max + "本书，不能再借！");
        }
        return book;
    }
}
