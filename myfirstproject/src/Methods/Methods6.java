package Methods;



public class Methods6 {
	//Create a method add(int a, int b) to print the sum.
	 static void add(int a,int b) {
		int sum=a+b;
		System.out.println("sum of values:"+sum);
	}
	 //Create a method subtract(int a, int b) to print the difference.
	 static void subtraction(int a,int b) {
		 int sub=a-b;
		 System.out.println("sbtraction values:"+sub);
	 }
	 //Create a method multiply(int a, int b) to print the product.
	 static void multiplay( int a, int b) {
		int  multi=a*b;
		System.out.println("mutiplay values:"+multi);
	 }
	 //Create a method divide(int a, int b) to print the quotient.
	 static void divide(int a, int b) {
		 int div=a/b;
		 System.out.println("division values:"+div);
	 }
	 //Create a method square(int n) to print the square
	 static void square(int n) {
		 int square=n*n;
		 System.out.println("square value:"+square);
	 }
	 //Create a method cube(int n) to print the cube.
	 static void cube(int n) {
		 int cube=1;
		 for( int i=1;i<=3;i++) {
			cube=cube*n;
		 }
		 System.out.println("cube value:"+cube);
	 }
	 static void cube1 (int n) {
		System.out.println("cube value:"+n*n*n);
	 }
	 //Create a method evenOdd(int n) to check even or odd.
	 static void evenodd(int n) {
		 if(n>0) {
			 System.out.println("positive");
		 }
		 else if(n<0) {
			 System.out.println("negative");
		 }
		 else {
			 System.out.println("zero");
		 }
	 }
	 static void evenodd1(int n) {
		 if(n%2==0) {
			 System.out.println("positive");
		 }
		 else {
			 System.out.println("negative");
		 }
	 }
	 //Create a method positiveNegative(int n) to check the number's sign.
	 static void positivenegative(int n) {
			 if(n>0) {
				 System.out.println("positive");
			 }
			 else if(n<0) {
				 System.out.println("negative");
			 }
			 else {
				 System.out.println("zero");
			 }
		 }
	 //Create a method table(int n) to print the multiplication table.
	 static void table(int n) {
		 for( int i=1;i<=10;i++) {
			 System.out.println(i+"x"+n+"="+(n*i));
		 }
	 }
	 //Create a method printNumbers(int n) to print 1 to n.
	 static void printnumbers(int n) {
		 for(int i=1;i<=n;i++) {
			 System.out.println("printnumbers:"+i);
		 }
	 }
	 //Create a method sumNumbers(int n) to add numbers from 1 to n.
	 static void sumnumbers(int n) {
		 int sum=0;
		 for(int i=1;i<=n;i++) {
			 sum=sum+i;
			 System.out.println("sumnumbers:"+sum);
		 }
	 }
	 //Create a method factorial(int n) to print the factorial.
	 static void factorial(int n) {
		 int fact=1;
		 for(int i=1;i<=n;i++) {
			 fact=fact*i;
			 System.out.println("factorial:"+fact);
		 }
		 
	 }
	 //Create a method largest(int a, int b) to print the largest number.
	 static void largest(int a,int b) {
		 if(a>b) {
			 System.out.println("a is largest:"+a);
		 }
		 else{
			System.out.println("b is largest:"+b); 
		 }
	 }
	 //Create a method largestOfThree(int a, int b, int c) to print the largest number.
	 static void largest(int a, int b, int c) {
		 if(a>=b && a>=c) {
			 System.out.println("a is largest:"+a);
		 }
		 else if(b>=a && b>=c) {
			 System.out.println("a is largest:"+b);
		 }
		 else {
			 System.out.println("c is largest:"+c);
		 }
	 }
	 //reate a method rectangleArea(int l, int b) to print the area.
	 static void rectangle(int a,int b ) {
		int  ractangle=a*b;
		System.out.println("ractangle area:"+ractangle);
	 }
	 //Create a method simpleInterest(double p, double r) to calculate interest using fixed time.
	static void simpleinterest(int a,int b) {
		int  c=2;
		int si=(a*b*c)/100;
		System.out.println("simpleinterest:"+si);
	}
	 //Create a method greet(String name) to print a greeting.
	static void greet(String name) {
		System.out.println("hello"+name+"welcome.");
	}
	 //Create a method upperCase(String text) to print text in uppercase.
	static void uppercase(String name) {
		System.out.println("uppercase:"+name.toUpperCase());
	}
	 //Create a method vowelOrConsonant(char ch) to check a character.
	static void vowelOrConsonant(char ch) {
		
	}
	 //Create a method employeeSalary(double salary) to print the salary.
	static void employeesalary(double sal) {
		System.out.println("employeesalary:"+sal);
	}
	public static void main(String[] args) {
		add(10,10);
		subtraction(20,30);
		multiplay(2,3);
		divide(8,4);
		square(3);
		cube(3);
		cube1(3);
		evenodd(4);
		evenodd1(7);
		positivenegative(4);
		table(5);
		printnumbers(10);
		sumnumbers(10); 
		factorial(5);
		largest(56,78);
		largest(23,67,3);
		rectangle(3,5);
		simpleinterest(1000,5);
		greet("akhila");
		uppercase("akhila");
		employeesalary(34567);
		
			
		// TODO Auto-generated method stub

	}

}
