package Wiproan;
import java.util.Scanner;

public class Question30 {
	

	@FunctionalInterface
	interface Minimum {
	    double apply(double a, double b);
	}

	public static double minimum3(double a, double b, double c, Minimum min) {
        return min.apply(min.apply(a, b), c);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        System.out.print("Enter third number: ");
        double num3 = sc.nextDouble();

        // Method reference to Math.min
        Minimum minRef = Math::min;

        double result = minimum3(num1, num2, num3, minRef);
        System.out.println("The smallest number is: " + result);

        sc.close();
    }
}

