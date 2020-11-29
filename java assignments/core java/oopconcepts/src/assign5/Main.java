package assign5;

public class Main {

	public static void main(String args[]) {
    	MyFunctionalInterface sum = (a, b) -> a + b;
        System.out.println("Result: "+sum.addMethod(12, 100));
    }
	
}
