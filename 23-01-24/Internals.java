// CIE/Internals.java

package CIE;

import java.util.Scanner;

public class Internals extends Student {
    protected int marks[] = new int[5];

    public void inputCIEMarks() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter CIE Marks:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter marks for Course: " + (i+1) + ":");
            marks[i] = sc.nextInt();
        }
        sc.close();
    }
}

// CIE/Student.java
package CIE;

import java.util.Scanner;

public class Student {
    protected String usn = new String();
    protected String name = new String();
    protected int sem;

    public void inputStudentDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your usn: ");
        usn = sc.nextLine();
        System.out.print("Enter your name: ");
        name = sc.nextLine();
        System.out.print("Enter your semester: ");
        sem = sc.nextInt();
        sc.close();
    }

    public void displayStudentDetails() {
        System.out.println("USN: " + usn);
        System.out.println("Name: " + name);
        System.out.println("Semester: " + sem);
    }
}


// SEE/Externals.java
package SEE;

import CIE.Internals;
import java.util.Scanner;

public class Externals extends Internals {
    protected int marks[];
    protected int finalMarks[];

    public Externals() {
        marks = new int[5];
        finalMarks = new int[5];
    }

    public void inputSEEMarks() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter SEE marks:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Course " + (i + 1) + ":");
            marks[i] = sc.nextInt();
        }
        sc.close();
    }

    public void calculateFinalMarks() {
      for (int i = 0; i < 5; i++) {
            finalMarks[i] = (marks[i] / 2) + super.marks[i];
        }
    }

    public void displayFinalMarks() {
        displayStudentDetails();
        for (int i = 0; i < 5; i++) {
            System.out.println("Course " + (i + 1) + ":" + finalMarks[i]);
        }
    }
}
      
// Main.java   
import SEE.Externals;

public class Main {
    public static void main(String[] args) {
        int numOfStudents = 2;
        External[] finalMarks = new External[numOfStudents];

        for (int i = 0; i < numOfStudents; i++) {
            finalMarks[i] = new External();
            finalMarks[i].inputStudentDetails();
            finalMarks[i].inputCIEMarks();
            finalMarks[i].inputSEEMarks();
        }

        System.out.println("Displaying data:");
        for (int i = 0; i < numOfStudents; i++) {
            finalMarks[i].calculateFinalMarks();
            finalMarks[i].displayFinalMarks();
        }
    }
}
