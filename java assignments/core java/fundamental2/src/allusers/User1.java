package allusers;

import utility.Calc;
import java.util.Scanner;

public class User1 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no whose sqrt to be found");
		double num=sc.nextDouble();
		Calc c=new Calc();
		System.out.println(c.findRoot(num));
		
	}

}
