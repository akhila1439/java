package myfirstproject;

public class Product {
	int id=2;
	String productname="soap";
	 int price=1000;
	 static String shopname="pavan";
	 static {
		 System.out.println("shop name:"+shopname);
	 }
	 {
		 System.out.println("product object is created");
	 }
	 void display() {
		 System.out.println("productid:"+id);
		 System.out.println("product name:"+productname);
		 System.out.println("price:"+price);
	 }
	 static void display2() {
		 System.out.println("shop details");
		 System.out.println("location:kphp");
	 }

	public static void main(String[] args) {
		display2() ;
		Product p =new Product();
		Product p1 =new Product();
		p.display();
		display2() ;

	}

}
