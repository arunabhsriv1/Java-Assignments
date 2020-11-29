package fundamentals1.assignment3;

import java.util.Scanner;

public class Sequence {

	public static void main(String[] args) {
		
		String seqn="";
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the sequence to be edited ");
		int seq =sc.nextInt();
	
		while(seq>0) {
			int ext=seq%10;
			seqn=ext+" "+seqn;
			seq=seq/10;
		}
		
		System.out.println(seqn);
		
	}
	

}
