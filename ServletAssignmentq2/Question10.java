package Wiproan;
import java.util.Scanner;

public class Question10 {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
	        System.out.print("Enter total number of eggs: ");
	        int eggs = input.nextInt();

	        int gross = eggs / 144;
	        eggs = eggs % 144;

	        int dozen = eggs / 12;
	        int leftover = eggs % 12;

	        System.out.println("Your number of eggs is " + gross + " gross, " + dozen + " dozen, and " + leftover);
	        
	        input.close();

	}

}
