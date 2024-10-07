package aap_java_Array_25;

import java.util.Scanner;
//Armstrong Number:-input 153-->1*1*1+5*5*5+3*3*3=153.
public class G {
	public static void main(String[] args) {
		int n,arm=0,c,r;
		System.out.println("Enter no");
		Scanner sc= new Scanner(System.in);
		n=sc.nextInt();
		c=n;
		while(n>0) {
			r=n%10;
			arm=(r*r*r)+arm;
			n=n/10;
		}
		if(c==arm) {
			System.out.println("Armstrong Number");
		}else {
			System.out.println("Not Armstrong Number");
		}
	}
}
