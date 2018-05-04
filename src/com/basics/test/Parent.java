package com.basics.test;

public class Parent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("I am in parent class");
		
		Child ch = new Child();
		
		ch.childDemo();  //Aggregation: HAS-A Relation
		
		GrandChild gc=new GrandChild(); //IS-A relation is achieved using inheritance
		
		gc.childDemo();
		
		Child ch1= new GrandChild();  //INTERFACE: WebDriver driver = new ChromeDriver();
		
		ch1.childDemo();
	}

}
