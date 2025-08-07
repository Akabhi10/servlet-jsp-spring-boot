package Wiproan;
import java.util.Scanner;


public class Question16 {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
	        int[] marks = new int[3];
	        int i = 0;

	        while (i < 3) {
	            System.out.print("Enter the mark (0-100) for student " + (i + 1) + ": ");
	            int mark = input.nextInt();

	            if (mark >= 0 && mark <= 100) {
	                marks[i] = mark;
	                i++;
	            } else {
	                System.out.println("Invalid input, try again...");
	            }
	        }

	        double average = (marks[0] + marks[1] + marks[2]) / 3.0;
	        System.out.printf("The average is: %.2f\n", average);

	        input.close();

	}

}
