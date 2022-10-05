package com.online.portal;

@FunctionalInterface //annotated with functional interface annotation it ensure that we have exactly one method
public interface ICalculate { // created a functional interface with 1 method calculateprice 
	//which takes two parameter.
	int calculatePrice(int rate,int quantity);
}
