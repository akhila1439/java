package myfirstproject;

public class TestDemo1 {
	protected void finalize() {
		System.out.println("stating finalize object ");
		
	}
	void display() {
		System.out.println("hi");
		TestDemo1 t =new TestDemo1();
	}

	public static void main(String[] args) {
		TestDemo1 t1 =new TestDemo1();
		t1=null;
		TestDemo1 t2=new TestDemo1();
		TestDemo1 t3=new TestDemo1();
		TestDemo1 t4=new TestDemo1();
		t2=t3;
		System.gc();
		t=null;
		
	



		// TODO Auto-generated method stub

	}

}
