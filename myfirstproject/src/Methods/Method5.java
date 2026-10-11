package Methods;

public class Method5 {
	//Create a method hello() to print Hello World.
	
	void hello() {
		System.out.println("hello world");
	}
	//Create a method welcome() to print Welcome to Java.
	void welcome() {
		System.out.println("welcome to java");
	}
	//Create a method myName() to print your name.
	void myname() {
		System.out.println("akhila");
	}
	//Create a method studentDetails() to print student details.
	int rollnumber=1;
	String name="akhila";
	long phonumber=1234567898;
	void studentdetails() {
		System.out.println("rollnumber:"+rollnumber);
		System.out.println("student name:"+name);
		System.out.println("student phone number:"+phonumber);
	}
	//Create a method add() to add two fixed numbers.
	int a=10;
	long b=(int)20;
	void add() {
		 long sum= a+b;
        System.out.println("sum of two numbers:"+sum);
	}
	//Create a method subtract() to subtract two fixed numbers.
	int i=10;
	float i2=22f;
	void subtract() {
		float sub=i-i2;
		System.out.println("sub of two numbers:"+sub);	
	}
	//Create a method multiply() to multiply two fixed numbers.
	int a1=1;
	short a2=2;
	void multiplay() {
		int mul=a1*a2;
		System.out.println("multiplication:"+mul);
	}
	//Create a method evenOdd() to check whether a fixed number is even or odd.
	int i3=5;
	int i4=4;
	void evenodd() {
		int sum=i3+i4;
		if(sum%2==0) {
		System.out.println("even:"+sum);}
		else { 
			System.out.println("odd"+sum);
		}
	}
	//Create a method square() to print the square of a fixed number
	void square() {
		int square=5;
		System.out.println("square value:"+square*square);
	}
	//Create a method cube() to print the cube of a fixed number.
	void cube() {
		int cube=5;
		System.out.println("cube value:"+cube*cube*cube);
	}  
	//Create a method table() to print the 5 multiplication table.
	void table(){
		for(i=1;i<=10;i++) {
			System.out.println(i+"x5="+(5*i));	
		}
	}
	//Create a method printNumbers() to print numbers from 1 to 10.
	void printnumbers() {
		for(i=1;i<=10;i++) {
			System.out.println("numbers:"+i);
		}
	}
	//Create a method sum() to calculate the sum of numbers from 1 to 10.
	void sum() {
	int	sum=0;
		for(i=1;i<=10;i++) {
			sum =sum+i;
			System.out.println("sum numbers:"+sum);
		}
	}
	//Create a method largest() to print the largest of two fixed numbers.
	void largest() {
		int a=10;
		int b=20;
		if(a>b) {
			System.out.println("largest:"+a);
		}
		else {
			System.out.println("largest:"+b);
		}
		}
	//Create a method smallest() to print the smallest of two fixed numbers.
	void smallest() {
		int a=20;
		int b=40;
		if(a<b) {
			System.out.println("smallest value:"+a);
		}
		else {
			System.out.println("smallest value:"+b);
		}
	}
	//Create a method positiveNegative() to check a fixed number.
	void positivenegative() {
		int a=-2;
		if(a>0) {
			System.out.println("positive number");
		}
		else if (a<0){
			System.out.println("nagative number");
		}
		else {
			System.out.println("zero");
		}	
	}
	//Create a method rectangleArea() to calculate the area using fixed values.
	void rectanglearea() {
		int length=5;
		int breadth=3;
		int area=length*breadth;
			System.out.println("ractangle area:"+area);	
	}
	//Create a method employeeDetails() to print employee details.
	void employeedetails() {
		int id=222;
		String name="pavan";
		String location="hyd";
		System.out.println("employee id:"+id);
		System.out.println("employee name:"+name);
		System.out.println("employee location:"+location);
	}
	//Create a method displayMessage() to print a message about learning Java.
	void displaymessage() {
		System.out.println("learning java");
	}
	public static void main(String[] args) {
	Method5 m=new Method5();
	m.hello();
	m.welcome();
	m.myname();
	m.studentdetails();
	m.add();
	m.subtract();
	m.multiplay();
	m.evenodd();
	m.square();
	m.cube();
	m.table();
	m.printnumbers();
	m.sum();
	m.largest();
	m.smallest();
	m.positivenegative();
	m.rectanglearea();
	m.displaymessage();
	m.employeedetails();
		// TODO Auto-generated method stub

	}

}
