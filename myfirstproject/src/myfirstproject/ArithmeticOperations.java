package myfirstproject;



public class ArithmeticOperations {
	void add() {
		int i=10;
		int i2=20;
		System.out.println("addition values:"+(i+i2));
	}
	void sub() {
		int i3=10;
		int i4=20;
		System.out.println("subtraction values:"+(i3-i4));
	}
	void multi() {
		int i5=10;
		int i6=20;
		System.out.println("multiplication values:"+(i5*i6));
	}

	void div() {
		int i7=10;
		int i8=20;
		System.out.println("division values:"+(i7/i8));
	}
	public static void main (String args[]) {
		 ArithmeticOperations a=new  ArithmeticOperations()	;
		 a.add();
		 a.sub();
		 a.multi();
		 a.div();
		
	}
}
