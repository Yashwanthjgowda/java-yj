package com.checkexception;
//checked exceptions need to be handled(mandatory)
//exception is a built in class

//custom exception
class DataNotFoundException extends Exception{
	
}
public class test {
    public static void getconnection() {
    	//Class.forName("com.mysql.jdbc.Driver");
    	//throw new DataNotFoundException();
    }
	public static void main(String[] args) {


	}

}
///examples of check exception