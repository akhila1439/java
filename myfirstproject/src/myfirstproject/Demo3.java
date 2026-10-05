package myfirstproject;

public class Demo3 {
	static int chocolate=15;
	static int cookie=10;
	int Totalcost=450;
	int chocolatecost=10*15;
	int cookiecost=5*10;
	
	int remainingammount=(Totalcost-(chocolatecost+cookiecost));

	public static void main(String[] args) {
		Demo3 d=new Demo3();
		
		System.out.println("remainingcost:"+d.remainingammount);
        
	}

}
