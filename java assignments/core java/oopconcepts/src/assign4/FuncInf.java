package assign4;


import java.util.function.IntBinaryOperator;

public class FuncInf {

   public static void main(String args[]) {
        // lambda expression
        IntBinaryOperator sum = (a, b) -> a + b;
        System.out.println("Result: " + sum.applyAsInt(12, 100));

    }
}