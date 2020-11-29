package misellaneous;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]= {},i,n;
		
		Account acc=new Account();
		
		System.out.println("Enter the no of elements to sort");
		n=sc.nextInt();
		
		for(i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		System.gc();
		System.out.println("Cleanup done");
	}
	
}
