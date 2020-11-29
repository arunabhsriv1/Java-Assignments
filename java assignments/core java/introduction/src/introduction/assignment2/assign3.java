package introduction.assignment2;

public class assign3 {

	public static void main(String[] args) {

		assign3_1 a=new assign3_1();
		System.out.println(a.a); //public variable accessible anywhere
		System.out.println(a.c);//protected being accessible in same package as well as sub class
		System.out.println(a.d);//default accessible in same package
		System.out.println(a.b);//private not being accessed in different class

	}

}
