package myfirstproject;

public class Std {
	int rollno=1;
	String name="anu";
	int marks=100;
   static String collegename="vishnu";
	
	static {
		System.out.println("college name:"+collegename);
	}
	{
		System.out.println("student object created");
	}
    void stddisplay() {
    	System.out.println("roll no:"+rollno);
    	System.out.println("student name:"+name);
    	System.out.println("student marks:"+marks);	
    	
		
	}

    static void displayCollegeDetails() {
    	
    System.out.println("College: ABC Engineering College"); 
    System.out.println("Location: Hyderabad");
    }	
	public static void main(String[] args) {
		displayCollegeDetails(); 
		Std s1=new Std();
		Std s2=new Std();
		s1.stddisplay();
	
		

	}

}
