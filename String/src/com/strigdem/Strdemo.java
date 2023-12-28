package com.strigdem;
//why string class are immutable in nature
// str can be approached by two methods
// literals > String str ="java"; str which are created by using litreals are stored in heap memory inside special type of memory known as 
//heap memory in constant pool by string object;scp(string constant pool)
// scp=it will store only string object,it doesnt allow the duplicate objects
// -----------------------------------------------------------------
// new > String str = new String("java");
//usage of more memory and stores both in heap and constant pool
public class Strdemo {

	public static void main(java.lang.String[] args) {
		String str = "java" ;
		System.out.println("befaore modification");
		System.out.println(str);
		 str.concat("code");
		 System.out.println("after modification");
		 System.out.println(str);
	}

}
