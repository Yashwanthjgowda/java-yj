package com.decision_control_statement;

public class break_continue {
public static void breakexample() {
	for(int i=1;i<=10;i++) {
		if(i==6)break;
		System.out.println(i);
	}
	System.out.println("-------------------");
}
     
public static void continuexample() {
	for(int a=1;a<=10;a++) {
		if(a==6)continue;
		System.out.println(a);
	}
}
	public static void main(String[] args) {
	breakexample();
	continuexample();

	}

}
