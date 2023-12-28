package com.strigdem;

public class str3demo {

	public static void main(String[] args) {
		String str = new String ("hello");
		String str1= new String("hello");// but java is going to convert it into literals;
		if(str.hashCode()==str1.hashCode()) {
			System.out.println("ponts to same object ");
		}else {
			System.out.println("ponts to different object ");
			
		}
		

	}

	}


