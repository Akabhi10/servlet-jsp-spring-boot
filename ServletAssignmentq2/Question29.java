package Wiproan;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Question29 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Register Number: ");
        String regNo = sc.nextLine();
		
		System.out.print("Enter Mobile Number: ");
        String mobileNo = sc.nextLine();
        
        try {
            if (regNo.length() != 9)
                throw new IllegalArgumentException();
            if (mobileNo.length() != 10)
                throw new IllegalArgumentException();
            if (!mobileNo.matches("\\d+"))
                throw new NumberFormatException();
            if (!regNo.matches("[a-zA-Z0-9]+"))
                throw new NoSuchElementException();
            
            System.out.println("valid");
        } catch (NumberFormatException e) {
            System.out.println("invalid");
        } catch (NoSuchElementException e) {
            System.out.println("invalid");
        } catch (IllegalArgumentException e) {
            System.out.println("invalid");
        }
        
        sc.close();
	}
}
