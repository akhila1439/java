package Methods;

public class Method2 {
	static void display(int a,int b,int c) {
		if(a>=b && a>=c)
			System.out.println(" largest:"+a);
		else if(b>=a && b>=c)
			System.out.println(" largest:"+b);
		else 
			System.out.println("largest:"+c);
	}

	public static void main(String[] args) {
		display(10,50,30);

	}

}
