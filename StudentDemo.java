import java.util.Scanner;


class Subject {
	int subjectMarks;
	int credits;
	int grade;
}

class Student {
	Scanner s = new Scanner(System.in);
	Subject subject[] = new Subject[8];
	
	String name, usn;
	double sgpa;


	Student() 
	{
		for(int i=0; i<8; i++)
		{
			subject[i] = new Subject();
		}
	}

		
	void getStudentDetails() 
	{
		System.out.print("Enter student's name: ");
		name = s.nextLine();
		
		System.out.print("Enter student's usn : ");
		usn = s.nextLine();

	}

	void getMarks()
	{
		for(int i=0; i<8; i++)
		{
 			


			System.out.println("Subject "+i);
			System.out.print("Enter marks: ");
			subject[i].subjectMarks = s.nextInt();
			System.out.print("Enter credits: ");
			subject[i].credits = s.nextInt();
			
			int t = subject[i].subjectMarks/10;

			if(t<4) {
				t = 0;
			}
			t = t+1;

			if(t>10) {
				t = 10;
			}

			subject[i].credits = t;
		}

	}

	void computeSGPA() 
	{	
		int tg = 0;
		int tc = 0;

		for(int i=0; i<8; i++)
		{
			tc += subject[i].credits;
			tg += subject[i].grade * subject[i].credits;

		}

		sgpa = tg/(1*tc);
	}

}

public class StudentDemo {
	public static void main(String args[]) {
	
		Student s1 = new Student();
		s1.getStudentDetails();
		s1.getMarks();
		s1.computeSGPA();

	}
}








