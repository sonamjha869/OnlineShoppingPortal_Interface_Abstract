package com.online.portal;

public class Toy extends Shopping implements IOnlineShopping { // created class toy which extends 
	//abstract class shopping and implements marker interface Ionlineshopping

	@Override
	public void printCategoryName() { //overridden the method printcategoryname inherited from parent class
		System.out.println("Category name is toy"); // prints categoryname
		
	}

	@Override
	void printRate() { // overridden the method printrate inherited from parent class
		System.out.println("Rate of toy  : "+getRate()); // prints the value for rate variable
		
	}

}
