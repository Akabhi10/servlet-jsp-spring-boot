package Wiproan;
import java.sql.*;
import java.util.*;
import java.util.stream.*;

import java.sql.*;

public class Fetcher {
	
	static class Student {
        int id;
        String name;
        int age;
        String course;
        double marks;

        public Student(int id, String name, int age, String course, double marks) {
            this.id = id;
            this.name = name;
            this.age = age;
            this.course = course;
            this.marks = marks;
        }

        public String toString() {
            return id + "\t" + name + "\t" + age + "\t" + course + "\t" + marks;
        }

        public double getMarks() { return marks; }
        public String getName() { return name; }
        public String getCourse() { return course; }
    }

	
	
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/new_db";
        String username = "root"; 
        String password = "royalenfield"; 
        
        List<Student> studentList = new ArrayList<>();

        try {
            Connection conn = DriverManager.getConnection(url, username, password);
            String query = "SELECT * FROM Student";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            System.out.println("ID\tName\tAge\tCourse\tMarks");
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                String course = rs.getString("course");
                double marks = rs.getDouble("marks");

                System.out.println(id + "\t" + name + "\t" + age + "\t" + course + "\t" + marks);
            }

            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        }
        
        
    }
}
  // output

// ID	Name	Age	Course	Marks
// 1	Ravi	20	CS	85.0
// 2	Priya	21	IT	90.0




