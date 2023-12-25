package com.decision_control_statement;

import java.util.Scanner;

class db{
	private static final String storedusername="yj";
	private static final String storedpassword="yj123";
	
	public static String getusername() {
		return storedusername;
	}
	public static String getpassword() {
		return storedpassword;
	}
}
public class nested_if {
	public static void login() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter username");
		String username =sc.next();
		if(username.equals(db.getusername())) {
			System.out.println("user name matches");
			System.out.println("enter password");
			String password =sc.next();
			if(password.equals(db.getpassword())) {
				System.out.println("user name password");
			}else {
				System.out.println("wrong password");
			}
		}else {
			System.out.println("user dont exist");
		}
	}
	
	
	
	public static void main(String[] args){
		nested_if.login();
	}
}
