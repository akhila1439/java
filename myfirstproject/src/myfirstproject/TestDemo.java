package myfirstproject;

public class TestDemo {
    static TestDemo t=new TestDemo();
	static TestDemo t1=new TestDemo();
	static {
		System.out.println("static block loaded");
	}
	{
		System.out.println("instance block loaded");
	}

	public static void main(String[] args) {
		System.out.println("main method stated");
		System.out.println("main method ended");
		// TODO Auto-generated method stub

	}

}
