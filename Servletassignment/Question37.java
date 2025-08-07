package Wiproan;
import java.io.*;
import java.util.Scanner;

public class Question37 {
	 public static void main(String[] args) {
	        File file = new File("batchmates.txt");
	        Scanner sc = new Scanner(System.in);

	        try {
	            
	            FileWriter writer = new FileWriter(file);
	            System.out.print("Enter number of batch mates: ");
	            int n = Integer.parseInt(sc.nextLine());

	            System.out.println("Enter names of your batch mates:");
	            for (int i = 0; i < n; i++) {
	                System.out.print("Name " + (i + 1) + ": ");
	                String name = sc.nextLine();
	                writer.write(name + "\n");
	            }

	            writer.close();
	            System.out.println("\nBatch mates' names written to file successfully.");

	            
	            System.out.println("\n--- Batch Mates List from File ---");
	            BufferedReader reader = new BufferedReader(new FileReader(file));
	            String line;

	            while ((line = reader.readLine()) != null) {
	                System.out.println(line);
	            }

	            reader.close();

	        } catch (IOException e) {
	            System.out.println("An error occurred while handling the file.");
	            e.printStackTrace();
	        }

	        sc.close();
	    }
	}



