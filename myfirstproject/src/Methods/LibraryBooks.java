package Methods;

import java.util.Scanner;

public class LibraryBooks {
	double triangle(double b,double h) {
		double b1=0.5*b*h;
		return b1;
	}
	double circle(double r) {
		double i=Math.PI * r * r;
		 System.out.println(" the triangle area:"+i);
		return i;
	}
	double square(double s) {
		double squa=s*s;
		return squa; 
	
	}
	double ractangle(double t1,double b1) {
		double ract=t1*b1;
		return ract;
	}

     void main(String[] args) {
    	 Scanner sc= new Scanner(System.in);
    	 System.out.println("enter the base:");
    	 int b=sc.nextInt();
    	 System.out.println("enter the hight:");
    	 int h=sc.nextInt();
    	 triangle(b,h);
    	 
    	 
    	 
    	 System.out.println("enter the radius:");
    	 int r=sc.nextInt();
    	 double i =circle(r);
    	 System.out.println("the circle area:"+i);
    	 
    	 System.out.println("enter side:");
    	 double s=sc.nextInt();
    	 double t=square(s);
    	 System.out.println("the square :"+t);
    	    
    	 
    	 System.out.println("enter t1 value:");
    	 double t1=sc.nextDouble();
    	 System.out.println("enter h1 value:");
    	 double h1=sc.nextDouble();
    	 double ract=ractangle(t1,h1);
    	 System.out.println("the ractangle value:"+ract);
    	 
    	 
    	
	 
	 
	}

}
