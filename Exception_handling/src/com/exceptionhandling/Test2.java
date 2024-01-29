package com.exceptionhandling;

public class Test2 {
  public static void m1() {
	  try {
		  String str =null;
		  System.out.println(str.length());
		  
	  }catch(NullPointerException ae) {
		  System.out.println("exception handaled");
	  }
	  System.out.println("m1()executed");
  }
	public static void main(String[] args) {
		Test2.m1();
	}

}
