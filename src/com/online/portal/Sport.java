package com.online.portal;

public class Sport extends Shopping { // created class  sport which extends abstract class shopping
	@Override
	public void printCategoryName() { //overridden the method printcategoryname inherited from parent class
		System.out.println("Category name is sport"); // prints categoryname
		
	}

	@Override
	void printRate() { // overridden the method printrate inherited from parent class
		System.out.println("Rate of sport : "+getRate()); // prints the value for rate variable
		
	}



}
