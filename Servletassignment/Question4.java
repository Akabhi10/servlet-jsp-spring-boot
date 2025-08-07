package Wiproan;
import java.util.Scanner;


public class Question4 {

	public static void main(String[] args) {
	       Scanner input = new Scanner(System.in);

	        String name, fieldOfInterest;
	        int rollNumber;

	        System.out.print("Enter your name: ");
	        name = input.nextLine();

	        System.out.print("Enter your roll number: ");
	        rollNumber = input.nextInt();
	        input.nextLine();

	        System.out.print("Enter your field of interest: ");
	        fieldOfInterest = input.nextLine();

	        System.out.println("Hey, my name is " + name + " and my roll number is " + rollNumber + ". My field of interest are " + fieldOfInterest + ".");
	        
	        input.close();

	}

}
