package myfirstproject;

public class Demo2 {
	static 
	{   
		Demo2 d=new Demo2();
		d.display4();
		d.display5();	
	}
	
    static void display1()
    {
    	System.out.println("method1 is called");
    }
    static void display2() {
    	display1();
    	System.out.println("method2 is called");
    }
    static void display3() {
    	display2();
    	System.out.println("method3 is called");
    }
    void display4() {
    	System.out.println("method4 is called");
    	display3();
    }
    void display5() {
    	System.out.println("method5 is called");
    }

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub

	}

}
