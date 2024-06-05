package aap_java_Array_25;

public class A {
	public static void main(String[] args) {
		
	
		int [] x = {38,23,32,14,7};
		
		int temp;
		
		for(int j=0;j<x.length-1;j++) {
			for(int i=0;i<x.length-1;i++) {
				if(x[i]> x[i+1]) {
					temp=x[i+1];
					x[i+1]=x[i];
					x[i]=temp;
					
				}
			}
		}
    }
}

