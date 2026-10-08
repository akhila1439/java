package Methods;

public class Method1 {
	  static void Display(int n) {
		if(n>0)
			System.out.println("positive");
		else if(n<0)
			System.out.println("negative");
		else
			System.out.println("zero");
	}

	public static void main(String[] args) {
		
	Method1 m=new Method1();
	Display(5);

	}
}
