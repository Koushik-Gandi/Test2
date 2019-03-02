package Test2;

import java.util.Scanner;

public class SavingsAccount {
	
	void calculateInterest(double amount) {
		double interest=6.5;
		double balance=(amount*interest)/100;
		System.out.println("SavingsAccount Interest :"+balance);
	}
	
	public static class FixedAccount extends SavingsAccount{
		
		void calculateInterest(double amount) {
			double interest=6.8;
			double balance=(amount*interest)/100;
			System.out.println("FixedAccount Interest :" +balance);
		}
		
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			double amount=sc.nextDouble();
			FixedAccount interest=new FixedAccount();
			interest.calculateInterest(amount);
			sc.close();
			
		}
	}
}
