package myfirstproject;

public class TestDemo {
   
	static {
		System.out.println("static block loaded");
	}
	{
		System.out.println("instance block loaded");
	}

	public static void main(String[] args) {
		  TestDemo t=new TestDemo();
		 TestDemo t1=new TestDemo();
		System.out.println("main method stated");
		System.out.println("main method ended");
		// TODO Auto-generated method stub

	}

}
