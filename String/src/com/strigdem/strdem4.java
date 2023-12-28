package com.strigdem;

public class strdem4 {

	public static void main(String[] args) {
		// length
		String str ="java";
		System.out.println(str.length());
		//to upper case
		System.out.println(str.toUpperCase());
        //to lower case
		System.out.println(str.toLowerCase());
		// concat
		String str2="world";
		System.out.println(str.concat(str2));
		
		//indexof
		System.out.println(str2.indexOf("w"));
		
		//charAT(index)
		System.out.println(str2.charAt(1));
		//substring(beginIndex,endIndex)
		String str3 ="encylopedia";
		System.out.println(str3.substring(1,4));
		//split(reg)
		String str4 = "java - is - a  -language";
		String[] arr =str4.split("-");
		for (int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
	}
	}
	

}
