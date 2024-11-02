package week1.homeassignment;

public class Fibonacci {

	public static void main(String[] args) {
		int i =0;
		int j=1;
		int k;
		int l;
		System.out.print(i+" ");	
		System.out.print(j+" ");	
		for (l=2; l<=7; l++) {
			k=i+j;
			System.out.print(k+" ");
			i=j;
			j=k;
		}	

	}

}
