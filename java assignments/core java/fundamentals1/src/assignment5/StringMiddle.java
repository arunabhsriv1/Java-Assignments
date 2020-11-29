package assignment5;

import java.util.Scanner;

public class StringMiddle {

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		
		String s;
		
		System.out.println("Enter a string whose middle element to be found : ");
		s=sc.nextLine();
		
		int l=s.length();
		
		if(l%2==0) {
			System.out.println(s.charAt(l/2));
		}
		else {
			int fac=(int)Math.floor(l/2);
			int fac1=(int)Math.ceil(l/2);
			System.out.println(s.charAt(fac));
			System.out.println(s.charAt(fac1));
	}
		
	}

}
