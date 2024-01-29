package com.thro;

class StudentNotFoundException extends Exception{
	private String message;
	public StudentNotFoundException(String message) {
		this.message=message;
	}
	public String getError() {
		return this.message;
	}
}


class Student{
	private int studentid;
	private String studentname;
	
	public Student(int studentid, String studentname) {
		super();
		this.studentid = studentid;
		this.studentname = studentname;
	}
	public int getStudentid() {
		return studentid;
	}
	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}
	public String getStudentname() {
		return studentname;
	}
	@Override
	public String toString() {
		return "Student [studentid=" + studentid + ", studentname=" + studentname + ", getStudentid()=" + getStudentid()
				+ ", getStudentname()=" + getStudentname() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
}
class studentutil{
	public static Student findstudentbyid(Student[] students, int id) throws StudentNotFoundException {
		boolean flag=false;
		for(int i=0;i<students.length;i++) {
			if(students[i].getStudentid()==id) {
				return students[i];
				
			}
		}
		throw new StudentNotFoundException("student doesnt exist");
	}

}



public class throwskeyword {

	public static void main(String[] args) {
		Student s1 = new Student(101,"harsh");
		Student s2 = new Student(102,"yo");
		Student s3 = new Student(103,"yoyo");
		Student s4 = new Student(104,"honey");
		Student s5 = new Student(105,"yo-honey");
		
		Student[] students= {s1,s2,s3,s4,s5};
		try {
		System.out.println(studentutil.findstudentbyid(students, 106));
		}catch (StudentNotFoundException e) {
			System.out.println(e.getError());
		}
	}

}
