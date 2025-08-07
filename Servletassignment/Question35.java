package Wiproan;

import java.util.Scanner;

class InvalidEmployeeCode extends Exception {
    public InvalidEmployeeCode(String message) {
        super(message);
    }
}

class Employee {
    private String empCode;
    private String empName;
    private int age;

    public Employee(String empCode, String empName, int age) {
        this.empCode = empCode;
        this.empName = empName;
        this.age = age;
    }

    public void displayDetails() {
        System.out.println("\n--- Employee Details ---");
        System.out.println("Employee Code: " + empCode);
        System.out.println("Name: " + empName);
        System.out.println("Age: " + age);
    }
}


public class Question35 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        try {
	            System.out.print("Enter Employee Code: ");
	            String code = sc.nextLine();

	            if (!isValidCode(code)) {
	                throw new InvalidEmployeeCode("Invalid Employee Code! Code must start with 'EMP' followed by 3 digits (e.g., EMP101).");
	            }

	            System.out.print("Enter Employee Name: ");
	            String name = sc.nextLine();

	            System.out.print("Enter Employee Age: ");
	            int age = sc.nextInt();

	            Employee emp = new Employee(code, name, age);
	            emp.displayDetails();

	        } catch (InvalidEmployeeCode e) {
	            System.out.println("Error: " + e.getMessage());
	        }

	        sc.close();
	    }

	    private static boolean isValidCode(String code) {
	        return code.matches("EMP\\d{3}");

}
}
