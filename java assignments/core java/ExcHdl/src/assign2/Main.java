package assign2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double number;
		System.out.println("Enter the no whose sqrt to be found : ");
		number=sc.nextDouble();
		try {
		System.out.println(findSqrRoot(number));
		}
		catch(NegativeNumberException ne) {
			ne.printStackTrace();
		}
	}

	public static double findSqrRoot(double num) throws NegativeNumberException {
		
		if(num<0) {
			throw new NegativeNumberException("cannot find root of negative no");
		}
		return(Math.sqrt(num));
		
	}
	
}
