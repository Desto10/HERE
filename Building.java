package com.hccs;
import java.util.Scanner;
// parent class, has what every building should have
public class Building {
	// private attributes 
private String siding;
private double squareFeet;
// getters and setter 
public String getSiding() {
	return siding;
}
public void setSiding(String siding){
	this.siding = siding;
	
}
public double getSquareFeet() {
	return squareFeet;
	
}
public void setsquareFeet(double SquareFeet) {
	this.squareFeet = SquareFeet;
	
}
// main method which creates one house and one commercial building 
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	// get house info from the user 
	House myHouse = new House();
	myHouse.getInput(input);
	// get commerical info from the user 
	Commercial myCommercial = new Commercial();
	myCommercial.getInput(input);
	// showing the totals 
	System.out.println(" RESULTS");
	System.out.println("House total square feet:" + myHouse.getSquareFeet());
	System.out.println("Commercial total square feet:" + myCommercial.getSquareFeet());
	
}
}
