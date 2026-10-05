package myfirstproject;

public class Datatype3 {
	 String studentname="anu";
	 int rollnumber=12;
	 String course="java";
	 int submarks=100;
	 int sub1marks=200;
	 int sub2marks=300;
	 
	 void display1() {
		 System.out.println("studentname:"+studentname);
		 System.out.println("rollnumber:"+rollnumber);
		 System.out.println("couse;"+course);
	 }
	 int total;
	 
	 void calculatetotal() {
		 total=submarks+sub1marks+sub2marks;
		 System.out.println("totalmarks:"+total);
		
	 }
	 int avg;
	 void calculateavarage() {
		 avg=submarks+sub1marks+sub2marks/3;
		 System.out.println("avgmarks:"+avg);
	 }

	public static void main(String[] args) {
		Datatype3 D=new Datatype3();
		D.display1();
		D.calculatetotal();
		D.calculateavarage();
	}

}
