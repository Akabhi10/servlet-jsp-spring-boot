package Wiproan;

import java.util.*;

class BookStore {
    int bookId;
    String bookName;

    public BookStore(int bookId, String bookName) {
        this.bookId = bookId;
        this.bookName = bookName;
    }

    public void display() {
        System.out.println("Book ID: " + bookId + ", Book Name: " + bookName);
    }
}

class SortByBookName implements Comparator<BookStore> {
    public int compare(BookStore a, BookStore b) {
        return a.bookName.compareToIgnoreCase(b.bookName);
    }
}

class SortByBookId implements Comparator<BookStore> {
    public int compare(BookStore a, BookStore b) {
        return Integer.compare(a.bookId, b.bookId);
    }
}
public class Question41 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<BookStore> books = new ArrayList<>();

        System.out.print("Enter number of books: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter Book ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Book Name: ");
            String name = sc.nextLine();
            books.add(new BookStore(id, name));
        }

        Collections.sort(books, new SortByBookName());
        System.out.println("\nSorted by Book Name:");
        for (BookStore b : books) {
            b.display();
        }

        Collections.sort(books, new SortByBookId());
        System.out.println("\nSorted by Book ID:");
        for (BookStore b : books) {
            b.display();
        }

        sc.close();

}
}
