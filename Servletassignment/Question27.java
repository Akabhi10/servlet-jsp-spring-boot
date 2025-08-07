package Wiproan;

public class Question27 {

    enum Currency {
        TEN, TWENTY, FIFTY, HUNDRED, TWO_HUNDRED, FIVE_HUNDRED
    }

    public static void main(String[] args) {
        for (Currency c : Currency.values()) {
            System.out.println("Currency: " + c);
            switch (c) {
                case TEN:
                    System.out.println("Description: Smallest commonly used note.");
                    break;
                case TWENTY:
                    System.out.println("Description: Used for small purchases.");
                    break;
                case FIFTY:
                    System.out.println("Description: Handy for medium-sized transactions.");
                    break;
                case HUNDRED:
                    System.out.println("Description: Most widely accepted note.");
                    break;
                case TWO_HUNDRED:
                    System.out.println("Description: Introduced recently for efficient transactions.");
                    break;
                case FIVE_HUNDRED:
                    System.out.println("Description: High denomination note, used for big purchases.");
                    break;
            }
            System.out.println();
        }
    }
}

