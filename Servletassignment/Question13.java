package Wiproan;
import java.util.Scanner;

class Worker {
    protected String name;
    protected double salaryRate;

    public Worker(String name, double salaryRate) {
        this.name = name;
        this.salaryRate = salaryRate;
    }

    public double pay(int hours) {
        return 0.0;
    }
}

class DailyWorker extends Worker {
    public DailyWorker(String name, double salaryRate) {
        super(name, salaryRate);
    }

    public double pay(int hours) {
        return salaryRate * hours;
    }
}

class SalariedWorker extends Worker {
    public SalariedWorker(String name, double salaryRate) {
        super(name, salaryRate);
    }

    public double pay(int hours) {
        return salaryRate * 40;
    }
}


public class Question13 {

	public static void main(String[] args) {
		DailyWorker dw = new DailyWorker("Akash", 500);
        SalariedWorker sw = new SalariedWorker("Ravi", 400);

        System.out.println("Daily Worker Pay (45 hrs): ₹" + dw.pay(45));
        System.out.println("Salaried Worker Pay (45 hrs): ₹" + sw.pay(45));

	}

}
