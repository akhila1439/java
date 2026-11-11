package Methods;
import java .util.Scanner;
class BankAccount {
	double balance=10000;
	void deposit(double amount) {
	
		balance=balance+amount;
		checkBlance();
	}
	
	
	void withdraw(double amount) {
		if(amount<balance) {
			balance=balance-amount;
		}
		else {
			System.out.println("no money");
		}
		checkBlance();
	}
	
    void checkBlance() {
    	System.out.println("the currect balance is;"+balance);
    }
    
    
    
	void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		checkBlance();
		System.out.println("enter amount deposite:");
		double amt=sc.nextInt();
		   deposit(amt);

	    System.out.println("enter amount withdraw:");
	    double amt1=sc.nextInt();
	    withdraw(amt1);
	    

	}

}
