package Wiproan;
import java.util.*;

class TeamMember {
    int id;
    String name;
    double salary;

    public TeamMember(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
    }
}

public class Question44 {
    public static void main(String[] args) {
        List<TeamMember> list = new ArrayList<>();

        list.add(new TeamMember(101, "Neha", 70000));
        list.add(new TeamMember(102, "Aman", 80000));
        list.add(new TeamMember(103, "Zoya", 60000));
        list.add(new TeamMember(104, "Rahul", 80000));
        list.add(new TeamMember(105, "Divya", 75000));

        System.out.println("Sorted by Salary (Descending):");
        list.sort((a, b) -> Double.compare(b.salary, a.salary));
        for (TeamMember tm : list) {
            tm.display();
        }

        System.out.println("\nSorted by Name (Alphabetically):");
        list.sort((a, b) -> a.name.compareToIgnoreCase(b.name));
        for (TeamMember tm : list) {
            tm.display();
        }
    }
}
