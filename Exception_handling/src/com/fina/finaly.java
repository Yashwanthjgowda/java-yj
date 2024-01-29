package com.fina;
//the code present inside finally block execute even if exception is not handled
//if return statement is present in finally block it will override other return statement
public class finaly {
public static void m1() {
	try {
		int a=10;
		System.out.println(a/0);
	}catch(NullPointerException e) {
		System.out.println("exception handled");
	}finally {
		System.out.println("finally block executed");
	}
}
	public static void main(String[] args) {
	m1();

	}

}
