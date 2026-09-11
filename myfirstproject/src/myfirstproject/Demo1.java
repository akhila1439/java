package myfirstproject;

public class Demo1 {
	class A{
		B b;
	}
	class B{
		A a;
	}
	public class Test {

	public static void main(String[] args) {
		
	}
		A obj1=new A();
		B obj2=new B();
		obj1.b=obj2;
		obj2.a=obj1;
		obj1=null;
		obj2=null;

		
		
		// TODO Auto-generated method stub
	
	}

}
