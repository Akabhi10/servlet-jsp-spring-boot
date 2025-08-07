package Wiproan;
import java.util.Scanner;


public class Question15 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        int[] arr = new int[10];
        int[] count = new int[10];

        System.out.println("Enter 10 elements:");

        for (int i = 0; i < 10; i++) {
            arr[i] = input.nextInt();
            count[i] = -1;
        }

        for (int i = 0; i < 10; i++) {
            int freq = 1;
            for (int j = i + 1; j < 10; j++) {
                if (arr[i] == arr[j]) {
                    freq++;
                    count[j] = 0;
                }
            }
            if (count[i] != 0) {
                count[i] = freq;
            }
        }

        System.out.println("Occurrences of each element:");
        for (int i = 0; i < 10; i++) {
            if (count[i] != 0) {
                System.out.println(arr[i] + " occurs " + count[i] + " times");
            }
        }

        input.close();

	}

}
