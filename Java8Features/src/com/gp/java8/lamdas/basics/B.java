package com.gp.java8.lamdas.basics;

public interface B extends A{//B no longer functional interface..B cannot define new methods if wants to be functional inface..
void myMethod();//B no more func interface regular interface only..if put@FunctionalInterface get error with this method..same as A method here is fine no issue
//1800 288 2020
}
