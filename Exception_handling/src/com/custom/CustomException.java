package com.custom;

class ageverificationfailedException extends Exception{
	private String message;
	public ageverificationfailedException (String message) {
		this.message=message;
	}
	public String getExceptionMessage() {
		return this.message;
	}
}

public class CustomException {
public static void ageverification(int age) {
	if(age<18) {
		try {
		throw new ageverificationfailedException("Age verification failed");
		}catch(ageverificationfailedException ae) {
			System.out.println(ae.getExceptionMessage());
		}
	}else
	{
		System.out.println("welcome to voting");
	}
}
	public static void main(String[] args) {
		ageverification(17);

	}

}
