package myfirstproject;

public class Create {
	static int count=0;
	{
		count++;
		System.out.println("Object Count : "+ count);
	}
	public static void main(String[] args) {
		Create c=new Create();
		Create c1=new Create();

	}

}
