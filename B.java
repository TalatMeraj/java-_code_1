package aap_java_Array_25;

public class B {
	public static void main(String[] args) {
		int[] mer= {1,1,2,3,3,4,4,5,6};
		int[] tal= new int[mer.length];
		int j=0;
		for(int i=0;i<mer.length-1;i++) {
			if(mer[i]!=mer[i+1]) {
				tal[j]=mer[i];
				j++;
			}
		}
		
		      tal [j] =mer[mer.length-1];
		for(int y : tal) {
			System.out.println(y);
		}
	}
}
		
