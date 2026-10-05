package myfirstproject;

public class College {
	static String collegename="dnr";
	int rollno;
	String studentname;
	static {
		System.out.println("collegename:"+collegename);
	}
	{
		System.out.println("object is created");
	}
	static void display1() {
		System.out.println("collegename:"+collegename);
		
	}
	void display2(){
		System.out.println("student rollno:"+rollno);
		System.out.println("student name:"+studentname);
	}
	public static void main(String[] args) {
	     display1();
		College c=new College();
		c.rollno=1;
		c.studentname="anu";
		c.display2();
		College c1=new College();
		c1.rollno=2;
		c1.studentname="aishu";
		c1.display2();
		College c2=new College();
		c2.rollno=3;
		c2.studentname="akhi";
		c2.display2();
	}

}
