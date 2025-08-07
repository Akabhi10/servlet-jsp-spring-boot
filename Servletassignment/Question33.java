package Wiproan;

import java.util.Scanner;

class LowSalException extends Exception {
    public LowSalException(String message) {
        super(message);
    }
}

class Emp {
    private int empId;
    private String empName;
    private String designation;
    private double basic;
    private final double hra;

    public Emp(int empId, String empName, String designation, double basic) throws LowSalException {
        if (basic < 50000) {
            throw new LowSalException("Basic salary cannot be less than 50000.");
        }
        this.empId = empId;
        this.empName = empName;
        this.designation = designation;
        this.basic = basic;
        this.hra = calculateHRA();
    }

    private double calculateHRA() {
        if (designation.equalsIgnoreCase("Manager")) {
            return 0.10 * basic;
        } else if (designation.equalsIgnoreCase("TeamLeader")) {
            return 0.12 * basic;
        } else if (designation.equalsIgnoreCase("HR")) {
            return 0.05 * basic;
        } else {
            return 0.0;
        }
    }

    public void printDET() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Designation: " + designation);
        System.out.println("Basic Salary: " + basic);
        System.out.println("HRA: " + hra);
    }
}


public class Question33 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter Employee ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Employee Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Designation (Manager/TeamLeader/HR): ");
            String designation = sc.nextLine();

            System.out.print("Enter Basic Salary: ");
            double basic = sc.nextDouble();

            Emp emp = new Emp(id, name, designation, basic);
            emp.printDET();
        } catch (LowSalException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        sc.close();
    }
}
	
	


