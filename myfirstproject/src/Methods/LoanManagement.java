package Methods;

	import java.util.Scanner;

	public class LoanManagement {
		Scanner sc = new Scanner(System.in);
		String customerName;
		double LoanAmount;
		double interestRate;
		int totalTime;

		double calculateInterest(double LoanAmount, double totalTime, double interestRate) {
			double simple_interest = (LoanAmount* totalTime* interestRate) / 100;
			System.out.println("simple interest is:" + simple_interest);
			return simple_interest;
		}
		double calculateTotalAmount (double LoanAmount,double simple_interest) {
			double total_amount=LoanAmount+simple_interest;
			System.out.println("total amount is:" + total_amount);
			return total_amount;
		}

		void main(String[] args) {
			System.out.println("enter principal amount:");
			double P = sc.nextDouble();
			System.out.println("enter total time:");
			double T = sc.nextDouble();
			System.out.println("enter rate of interest");
			double R = sc.nextDouble();
			
			calculateInterest(P,T,R);
			
			
			System.out.println("enter loanamount:");
			double LoanAmount =sc.nextDouble();
			System.out.println("enter simple interset:");
			double simple_interest=sc.nextDouble();
			calculateTotalAmount(LoanAmount,simple_interest);
			

		}

	}


