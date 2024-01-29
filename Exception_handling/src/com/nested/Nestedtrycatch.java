package com.nested;

public class Nestedtrycatch {
public static void m2() {
try {
	System.out.println(12/4);
	try {
		String str = null;
		System.out.println(str.length());
	}catch(NullPointerException npe) {
		System.out.println("inner catch handled");
	}
}catch(Exception e) {
	System.out.println("outer catch handled");
	}
	}

	
	public static void main(String[] args) {
		m2();

	}

}
