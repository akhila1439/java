package myfirstproject;

public class Institute {
	static String TrainerName1="srikanth";
	static String TrainerName2="vishwa";
	String EmployeeName;
	int Employeeid;
	String EmployeeDesignation;
	
	public static void main(String[] args) {
		Institute i1=new Institute();
		i1.EmployeeName="anu";
		Institute i2=new Institute();
		i2.Employeeid=123;
		Institute i3=new Institute();
		i3.EmployeeDesignation="developer";
		System.out.println("name of the employee:"+i1.EmployeeName);
		System.out.println("employeeid:"+i2.Employeeid);
		// TODO Auto-generated method stub
		System.out.println("designation:"+i3.EmployeeDesignation);
		System.out.println("trainer first name:"+TrainerName1);
		System.out.println("trainer second name:"+TrainerName2);

	}

}
