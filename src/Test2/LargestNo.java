package Test2;

import java.util.Scanner;

public class LargestNo {
	    static int getNumber(int number, int digit)
	    {
	        char c = Integer.toString(digit).charAt(0);
	        for (int i = number; i > 0; --i)
	        {
	            if(Integer.toString(i).indexOf(c) == -1)
	            {
	            	return i;
	            }
	        }
	        return -1;
	    }
	 
	    public static void main(String[] args)
	    {
	    	int number,digit;
	    	Scanner sc=new Scanner(System.in);
	    	number=sc.nextInt();
	    	digit=sc.nextInt();
	        System.out.println(getNumber(number,digit));
	 
	        
	    }
}
	

