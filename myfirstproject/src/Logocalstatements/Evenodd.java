package Logocalstatements;

import java.util.Arrays;
import java.util.Scanner;

public class Evenodd {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the value:");
	int n=sc.nextInt();
	int[]arr=new int[n];
	System.out.println("enter the element:");
	for(int i=0;i<n;i++) {
		arr[i]=sc.nextInt();
	}
	System.out.println(Arrays.toString(arr));
	int evencount=0;
	int oddcount=0;
	
	for(int i=0;i<n;i++) {
		if(arr[i]%2==0) {
			evencount++;
		}else {
				oddcount++;
		}
		
	}
    System.out.println("even number is:"+evencount);
    System.out.println("odd number is:"+oddcount);
	}

}
