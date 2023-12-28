package com.strigdem;

public class test2strd {

	public static void main(String[] args) {
		String str ="hello";
		String str1="hello";
		if(str.hashCode()==str1.hashCode()) {
			System.out.println("ponts to same object ");
		}else {
			System.out.println("ponts to different object ");
			
		}
		

	}

}
