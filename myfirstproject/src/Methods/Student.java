package Methods;

public class Student {
	static int count=0;
	Student(){
		
	System.out.println("contructore called");
	count++;
	}
	 void main(String[] args) {
		Student s=new Student();
		Student s1=new Student();
		Student s2=new Student();
		System.out.println("number of objects:"+count);


		
		

	}

}
