package Methods;

import java.util.Scanner;

public class StudentMarks {
	Scanner sc=new Scanner(System.in);

   void main(String[] args) {
	
	int first=sem1();
	int second=sem2();
	int third=sem3();
	int forth=sem4();
	System.out.println("total sem marks:"+(first+second+third+forth));

	}

	 int sem1() {
		
		System.out.println(" Enter  first sem marks:");
		int marks=sc.nextInt();
		return marks;
	}
	 int sem2() {
		 System.out.println("Enter sencond sem marks:");
		 int marks2=sc.nextInt();
		 return marks2;
	 }
	 int sem3() {
		 System.out.println("Enter third sem marks:");
		 int marks3=sc.nextInt();
		 return marks3;
	 }
	 int sem4() {
		
		 System.out.println("Enter forth sem marks:");
		 int marks4=sc.nextInt();
		 return marks4;
	 }
}
