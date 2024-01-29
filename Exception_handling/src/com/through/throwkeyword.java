package com.through;

public class throwkeyword {
public static void onlinevoting(int age) {
	if(age<18) {
		throw new ArithmeticException();
	}else {
		System.out.println("welcome to vote");
	}
}
	public static void main(String[] args) {
		onlinevoting(19);

	}

}
