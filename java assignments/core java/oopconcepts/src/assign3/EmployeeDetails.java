package assign3;

import java.util.Scanner;

public class EmployeeDetails {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		int ch;
		Employee e=null;
		System.out.println("Enter what you want to do");
		System.out.println("1> Add new Employee");
		System.out.println("2> Display Employee");
		ch=sc.nextInt();
		
		switch(ch) {
		case 1:
			e=new Employee();
			System.out.println("Enter employee id ");
			e.setId(sc.nextInt());
			System.out.println("Enter Employee name ");
			e.setName(sc.nextLine());
			break;
		case 2:
			System.out.println(e);
			break;
		default:
			System.out.println("Enter the correct choices");
			break;
		}
		
	}

}
