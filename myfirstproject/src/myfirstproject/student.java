package myfirstproject;

public class student {
	static String CollageName="Vcube";
	String studentname;
	String studentid;
	int studentmarks;
	static {
		System.out.println(CollageName);
	}
	
	
	public static void main(String[] args) {
		
		
		student s1 = new student();
		s1.studentname="akhila";
		s1.studentid="a123";
		s1.studentmarks=90;
		System.out.println(s1.studentname);
		System.out.println(s1.studentid);
		System.out.println(s1.studentmarks);
		
		
		// TODO Auto-generated method stub

	}

}
