package com.online.portal;

abstract class Shopping implements IShopping { // created a abstract class 
	//which implements normal interface Ishopping
	int rate;  // created variable rate
	int quantity; // created variable quantity
	abstract void printRate();// created  abstract method printrate
	public int getRate() {  //getter for variable name rate its returns the value of variable rate 
		return rate;
	}
	public void setRate(int rate) { //setter for variable name rate its sets the value of variable rate
		this.rate = rate;
	}
	public int getQuantity() { //getter for variable  name quantity  its returns the value of variable quantity
		return quantity; 
	}
	public void setQuantity(int quantity) { //setter for variable name quantity 
		//its sets the value of variable quantity
		this.quantity = quantity;
	}
}
