package aap_java_Array_25;

import java.util.Scanner;
// WRITE A PROGRAM TO FIND PRIME NUMBER? Multiply by own and one another this is 7,3,5.

public class D {
	public  static void main (String args[]) {
		int n,count=0;
		System.out.println("Enter any NUmber");
		Scanner sc= new Scanner(System.in);
		n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println("Prime Number");
		}else {
			System.out.println("Not Prime Number");
		}
	}
}


