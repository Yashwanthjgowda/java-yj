package com.nested;
//using return statement in try catch
public class example1 {
public static int m1() {
	try {
		int a=10;
		System.out.println(a/0);
	}catch(Exception e) {
			return -1;
		}
		return 0;
			
		}
	

	public static void main(String[] args) {
		int result = m1();
		System.out.println(result);

	}

}
