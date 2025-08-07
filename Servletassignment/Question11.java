package Wiproan;
import java.util.Scanner;

public class Question11 {
    void add(int a, int b) {
        int result = a + b;
        System.out.println("Addition: " + result);
    }

    void diff(int a, int b) {
        int result = a - b;
        System.out.println("Difference: " + result);
    }

    void mul(int a, int b) {
        int result = a * b;
        System.out.println("Multiplication: " + result);
    }

    void div(int a, int b) {
        if (b != 0) {
            double result = (double) a / b;
            System.out.println("Division: " + result);
        } else {
            System.out.println("Division by zero is not allowed.");
        }
    }

    public static void main(String[] args) {
    	Question11 calc = new Question11();
        int x = 20, y = 5;

        calc.add(x, y);
        calc.diff(x, y);
        calc.mul(x, y);
        calc.div(x, y);
		
		


		
		
		
		
		
		
		
		
		
	}		
		
}