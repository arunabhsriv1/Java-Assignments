package fundamentals1.assignment2;

import java.util.Scanner;

public class Assign3 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int num,num1,sum=0;
		
		System.out.println("Enter a no between 0-1000");
		num=sc.nextInt();
		num1=num;
		while(num1>0 && num1<=1000) {
			int ext=num1%10;
			sum=sum+ext;
			num1=num1/10;
		}
		System.out.println("Sum of the digits of expected no is "+sum);
	}
	
	

}
