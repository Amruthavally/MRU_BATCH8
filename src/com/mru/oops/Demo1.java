package com.mru.oops;


public class Demo1 {

	public static void main(String[] args) {
		Test1 obj1 = new Test1();
		obj1.addition();
		
		int res1 = obj1.subtraction(100, 50);
		System.out.println("subtraction...."+res1);
		
      obj1.multiplication(100, 50);
      
      int res3 = obj1.division();
      System.out.println("division...."+res3);
      

	}

}
