import java.util.Scanner;

class Subject {
    String subjectMarks;
    int credits;
    int grade;
}

class Student {
    Scanner s = new Scanner(System.in);
    Subject[] subject = new Subject[8];
  
    String name, usn;
    double sgpa;
    
    Student() {
        for (int i = 0; i < 8; i++) {
            subject[i] = new Subject();
        }
    }

    void getStudentDetail() {
        System.out.print("Enter student name: ");
        name = s.nextLine();
        System.out.print("Enter student usn: ");
        usn = s.nextLine();
    }

    void getMarks() {
        for (int i = 0; i < 8; i++) {
            System.out.print("Subject" + (i + 1));
            System.out.print("Enter marks: ");
            subject[i].marks = s.nextInt();
            System.out.print("Enter credits: ");
            subject[i].credit = s.nextInt();

            int t = subject[i].subject/10;
            if(t < 4) 
              t = 0;
            t = t + 1;
            if(t > 10)
              t = 10;
            subject[i].credits = t;  
        }
    }

    void computeSGPA() {
        int tg = 0;
        double tc = 0;
        for (int i = 0; i < 8; i++) {
            tc += subject[i].credits;
            tg += subjects[i].grade * subjects[i].credit;
        }
        sgpa = tg / (tc * 1.0);
        System.out.println("Your SGPA is: " + sgpa);
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.getStudentDetail();
        s1.getMarks();
        s1.computeSGPA();
    }
}
