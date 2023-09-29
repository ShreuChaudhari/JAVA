
import java.util.*;

class Student{
    private String name;
    private int rollNo;
    private double cgpa;

    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public Student(String name, int rollNo, double cgpa) {
        this.name = name;
        this.rollNo = rollNo;
        this.cgpa = cgpa;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
    }

    public void displayInfo(boolean includeCgpa) {
        displayInfo(); // Reuse the previous method to display common info

        if (includeCgpa) {
            System.out.println("CGPA: " + cgpa);
        }
    }
}

class Main {
    public static void main(String[] args) {
      
        Student student1 = new Student("shreya", 04);
        Student student2 = new Student("Arya", 20, 6.8);

        System.out.println("Student 1:");
        student1.displayInfo();

        System.out.println("\nStudent 2:");
        student2.displayInfo();

        System.out.println("\nStudent 2 with CGPA:");
        student2.displayInfo(true);
    }
}

