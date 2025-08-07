package Wiproan;

import java.util.*;

public class Question26 {
    public static void main(String[] args) {
        int[] input = {2, 3, 54, 1, 6, 7, 7};
        Set<Integer> uniqueSet = new HashSet<>();

        for (int num : input) {
            uniqueSet.add(num);
        }

        int sum = 0;
        for (int num : uniqueSet) {
            if (num % 2 == 0) {
                sum += num;
            }
        }

        System.out.println("Sum of even numbers: " + sum);
    }
}