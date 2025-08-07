package Wiproan;
import java.util.*;

class CD implements Comparable<CD> {
    String title;
    String singer;

    public CD(String title, String singer) {
        this.title = title;
        this.singer = singer;
    }

    @Override
    public int compareTo(CD other) {
        return this.singer.compareToIgnoreCase(other.singer);
    }

    public void display() {
        System.out.println("Title: " + title + ", Singer: " + singer);
    }
}

public class Question40 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        List<CD> cdList = new ArrayList<>();

	        System.out.print("Enter number of CDs: ");
	        int n = sc.nextInt();
	        sc.nextLine();

	        for (int i = 0; i < n; i++) {
	            System.out.print("Enter CD title: ");
	            String title = sc.nextLine();
	            System.out.print("Enter CD singer: ");
	            String singer = sc.nextLine();
	            cdList.add(new CD(title, singer));
	        }

	        Collections.sort(cdList);

	        System.out.println("\nCDs sorted by singer name:");
	        for (CD cd : cdList) {
	            cd.display();
	        }

	        sc.close();

	 }
}
