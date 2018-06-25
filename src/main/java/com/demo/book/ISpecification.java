package com.demo.book;

public interface ISpecification<T> {

    boolean IsSatisfiedBy(T t);
}
