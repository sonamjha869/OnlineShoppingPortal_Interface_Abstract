package com.online.portal;

public class TestExecution { //created a class testexecution
	public static void main(String...args) { //main method for execution of code
		ICalculate c = (int rate,int quantity)-> rate* quantity; // implementation of 
		//functional interface Icalculate using lambda expresession
		//lambda expression to define the calculateprise method
		//parameter passed and return type must be same as method definision in interface
		// lambda expression is used to represent the instance of functional interface Icalculate
		
		Toy t = new Toy(); // created object of toy class
		t.setRate(100); //called  setter to set the value of variable rate
		t.setQuantity(1); //called  setter to set the value of variable quantity
		t.printCategoryName(); // called method printcategoryname to print category of obj t
		t.printRate(); //called method printrate to print rate of obj t
		
		if(t instanceof IOnlineShopping) { //checked if obj t is instence of marker interface Ionlineshopping
			//this will return true as toy class has implemented marker interface Ionlineshopping
			
			System.out.println("TotalPrice of toy is : "+c.calculatePrice(t.rate, t.quantity));//calling
			//method calculateprice defined in functional interface  Icalculate to print total price
			
		}
		
		// same as toy class 
		Cloth cloth = new Cloth();
		cloth.setRate(10);
		cloth.setQuantity(2);
		cloth.printCategoryName();
		cloth.printRate();
		
		if(cloth instanceof IOnlineShopping) { // true
			System.out.println("TotalPrice of cloth is : "+c.calculatePrice(cloth.rate, cloth.quantity));
		}
	
		//same as toy class
	Electronic e = new Electronic();
		e.setRate(1000);
		e.setQuantity(1);
		e.printCategoryName();
		e.printRate();
		
		if(e instanceof IOnlineShopping) { // true
			System.out.println("TotalPrice of Electronic is : "+c.calculatePrice(e.rate, e.quantity));
		}
		
		//same as toy class except instanceof ionlineshopping will retuen false as sport class has 
		//not implemented marker interface Ionlineshopping
		Sport s = new Sport();
		s.setRate(200);
		s.setQuantity(1);
		s.printCategoryName();
		s.printRate();
		
		if(s instanceof IOnlineShopping) { // false
			System.out.println("TotalPrice of Sport is : "+c.calculatePrice(s.rate, s.quantity));
		}	
}
}