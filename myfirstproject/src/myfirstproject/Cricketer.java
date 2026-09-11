package myfirstproject;

public class Cricketer {
	static int countryID;
	static String countryName;
	int jerseyNumber;
	String cricketerName;

	public static void main(String[] args) {
		System.out.println("Welcome to india cricket team");
		countryID=91;
		countryName="india";
		System.out.println("contryid:"+countryID);
		System.out.println("countyname:"+countryName);
		Cricketer msd=new Cricketer();
		msd.jerseyNumber=7;
		msd.cricketerName="mahendra singh dhoni";
		System.out.println("jerseynumber:"+msd.jerseyNumber);
		System.out.println("cricketername:"+msd.cricketerName);
		Cricketer hp=new Cricketer();
		countryID=99;
		countryName="uk";
		
		hp.jerseyNumber=33;
		hp.cricketerName="hardik padya";
		System.out.println("countryid:"+countryID);
		System.out.println("countryname:"+countryName);
		System.out.println("jerseynumber:"+hp.jerseyNumber);
		System.out.println("cricketername:"+hp.cricketerName);
		Cricketer vk =new Cricketer();
		System.out.println("countryid:"+countryID);
		System.out.println("countryname:"+countryName);
		vk.jerseyNumber=18;
		vk.cricketerName="virat kohli";
		System.out.println("jerseynumber:"+vk.jerseyNumber);
		System.out.println("cricketername:"+vk.cricketerName);
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
