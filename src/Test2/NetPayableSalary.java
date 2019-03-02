package Test2;
import java.util.Scanner;

public class NetPayableSalary {

	public static void calculate() {
		double salary,hra,special,pf;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter basic salary :");
		salary=sc.nextDouble();
		hra=(salary*50)/100;
		special=(salary*75)/100;
		pf=(salary*12)/100;
		salary=salary+hra+special-pf;
		System.out.println("Net payable salary is :"+salary);
	}
	
	public static void main(String[] args) {
		calculate();
	}
	
}
 