package Methods;

public class Method7 {
	//Create a method evenOdd() to check whether a fixed number is even or odd.
	boolean evenOdd() {
	    int n = 10;
	    return n % 2 == 0;
	}

 void main(String[] args) {

	    if (evenOdd()) {
	        System.out.println("Even Number");
	    } else {
	        System.out.println("Odd Number");
	    }
	}}