package Wiproan;

import java.util.Scanner;

public class Question24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] speeds = new double[5];
        double sum = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter speed of racer " + (i + 1) + ": ");
            speeds[i] = sc.nextDouble();
            sum += speeds[i];
        }

        double avg = sum / 5;
        System.out.println("Qualifying racers (speed > average " + avg + "):");

        for (int i = 0; i < 5; i++) {
            if (speeds[i] > avg) {
                System.out.println("Racer " + (i + 1) + ": " + speeds[i]);
            }
        }
        sc.close();
    }
}