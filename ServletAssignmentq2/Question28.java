package Wiproan;

import java.util.function.IntPredicate;

public class Question28 {
	
	 public static IntPredicate isOdd() {
	        return n -> n % 2 != 0;
	    }

	    public static IntPredicate isPrime() {
	        return n -> {
	            if (n <= 1) return false;
	            for (int i = 2; i <= Math.sqrt(n); i++) {
	                if (n % i == 0) return false;
	            }
	            return true;
	        };
	    }

	    public static IntPredicate isPalindrome() {
	        return n -> {
	            int original = n;
	            int reverse = 0;
	            while (n != 0) {
	                int digit = n % 10;
	                reverse = reverse * 10 + digit;
	                n /= 10;
	            }
	            return original == reverse;
	        };
	    }

	public static void main(String[] args) {
		
		 int number1 = 5;
	        int number2 = 7;
	        int number3 = 121;

	        System.out.println("Is " + number1 + " odd? " + isOdd().test(number1));
	        System.out.println("Is " + number2 + " prime? " + isPrime().test(number2));
	        System.out.println("Is " + number3 + " palindrome? " + isPalindrome().test(number3));
	    }
	
	}



