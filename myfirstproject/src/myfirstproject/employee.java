package myfirstproject;

public class employee {
	static String CompanyName="vcube";
	static {
		System.out.println(CompanyName);
	}
	int empid;
	String empname;
	int salary;


	public static void main(String[] args) {
		employee s1=new employee();
		s1.empid=123;
		s1.empname="pavan";
		s1.salary=9000;
		System.out.println("employee id:"+s1.empid);
		System.out.println("employee name:"+s1.empname);
		System.out.println("employee salary:"+s1.salary);


		
		// TODO Auto-generated method stub

	}

}
