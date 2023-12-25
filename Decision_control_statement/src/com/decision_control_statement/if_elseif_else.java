package com.decision_control_statement;

public class if_elseif_else {
	public static void checkmarks(int marks) {
		if(marks>=80) {
			System.out.println("distinction");
			}else if (marks>=60 && marks<80) {
				System.out.println("first class");
			}else if (marks>=40 && marks<60) {
				System.out.println("second class");
			}else {
				System.out.println("try again");
			}
	}
	public static void main(String[] args){
		if_elseif_else.checkmarks(100);
		if_elseif_else.checkmarks(80);
		if_elseif_else.checkmarks(60);
		if_elseif_else.checkmarks(40);
		if_elseif_else.checkmarks(10);
	}

}


