package myfirstproject;

public class Method1 {
	int bugid;
	String applicationname;
	String bugtitle;
	String severity;
	String priority;
	boolean status;
	String assigneddeveloper;
	
	void bugid() {
		System.out.println("bugid:"+bugid);
	}
	void applicationname() {
		System.out.println("applicationname:"+applicationname);
		
	}
	void bugtitle() {
		System.out.println("bugtitle:"+bugtitle);
	}
	void severity() {
		System.out.println("severity:"+severity);
	}
	void  priority() {
		System.out.println(" priority:"+ priority);
	}
	void status() {
		System.out.println("status:"+status);
	}
	void assigneddeveloper() {
		System.out.println("assigneddeveloper:"+assigneddeveloper);
	}
	
	

	public static void main(String[] args) {
		Method1 M=new Method1();
		M.bugid=123;
		M.applicationname="empportal";
		M.bugtitle="null value";
		M.severity="critical";
		M.priority="low";
		M.status=true;
		M. assigneddeveloper="pooja";
		M.bugid();
		M.applicationname();
		M.bugtitle();
		M.severity();
		M. priority();
		M.status();
		M.assigneddeveloper();
		
	}

}
