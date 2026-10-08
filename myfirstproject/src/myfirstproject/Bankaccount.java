package myfirstproject;

public class Bankaccount {
	 int balance =1000;
	
	void deposite() {
		balance=balance+500;
		System.out.println("total balance:"+balance);
		
	} 
	void withdraw() {
		balance=balance-300;
		System.out.println("remaining balance:"+balance);
	}

	public static void main(String[] args) {
	
		Bankaccount B=new Bankaccount();
		B.deposite();
		B.withdraw();
		System.out.println("balance:"+B.balance);
		// TODO Auto-generated method stub

	}

}
