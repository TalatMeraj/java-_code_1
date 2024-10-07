package aap_java_Array_25;

import java.util.Scanner;
//Fibonacci Series 0 1 1 2 3 5--
public class F {
	public static void main(String[] args) {
	int n,a=0,b=1,c;
	System.out.println("Enter no");
	Scanner sc= new Scanner(System.in);
	n=sc.nextInt();
	for(int i=1;i<=n;i++) {
		System.out.println(a+" ");
		c=a+b;
		a=b;
		b=c;
	}
	}
}
	