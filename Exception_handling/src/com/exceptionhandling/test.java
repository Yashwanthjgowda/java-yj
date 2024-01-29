package com.exceptionhandling;

import java.util.Scanner;

public class test {
public static void m1() {
	try {
	System.out.println("m1 starts execution");
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the first number");
	int num1=sc.nextInt();
	System.out.println("enter the second number");
	int num2=sc.nextInt();
	int result = num1/num2;
	System.out.println(result);
	}catch(ArithmeticException ae) {
		System.out.println("exception handled");
	}
	System.out.println("m1 ends execution");
	
	
}
	public static void main(String[] args) {
		test.m1();
	}

}
