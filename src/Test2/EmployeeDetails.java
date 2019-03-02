package Test2;

import java.util.Scanner;
class InvalidUser extends Exception{
	InvalidUser(String string) {
		super();
	}
}
public class EmployeeDetails {
	static String name;
	static long phoneNo;
	static int age;
	static void info() throws InvalidUser{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name :");
		name=sc.next();
		System.out.println("Enter PhoneNo :");
		phoneNo=sc.nextLong();
		System.out.println("Enter Age :");
		age=sc.nextInt();
		
		if(age>20&&age<55)
			System.out.println("Valid User");
		else
			throw new InvalidUser("Invalid User");
		
		}
	
	public static void main(String[] args) throws Exception{
		
		info();
	}
		
}
