package Wiproan;

public class Question3 {

	public static void main(String[] args) {
		int totalStudents = 90;
        int totalBoys = 45;
        int gradeAStudents = totalStudents / 2;  
        int gradeABoys = 20;


        int gradeAGirls = gradeAStudents - gradeABoys;

        System.out.println("Total number of girls who got grade 'A': " + gradeAGirls);

	}

}
