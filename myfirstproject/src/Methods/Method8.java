package Methods;
import java.util.Scanner;
public class Method8 {
	

	 void main(String[] args) {
	System.out.println("main method started");
	Scanner sc=new Scanner(System.in);
	
    System.out.println("enter salary:");
	double sal=sc.nextDouble();

	System.out.println("enter age:");
	int age=sc.nextInt();
	
	System.out.println("enter name:");
	sc.nextLine();
	String name=sc.nextLine();
	
	System.out.println("enter gender:");
	char gen=sc.next().charAt(0);

	employeesalary(sal);
	employeeage(age);
	employeename(name);
	employeegender(gen);

	
	}
    void employeesalary(double salary) {
    System.out.println("the current salary:"+salary);
    }
    void employeeage(int age) {
    	System.out.println("the current age:"+age);
    }
    void employeename(String name) {
    	System.out.println("enter current name:"+name);
    }
    void employeegender(char gender) {
    	System.out.println("employee gender:"+gender);
    }
    
}
