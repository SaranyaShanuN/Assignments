package week1.homeassignment;

public class IsPrimeNumber {
	
	public static void main(String[] args) {
		int num = 13;
		 int prime =0;
		 for (int i=2; i<num; i++)
		 {
			 if (num % i ==0) {
				 System.out.println("Number "+num+ " is Not Prime number");
				 prime = 1;
				 break;	 
			 }
			 }
		 	if (prime ==0) {
		 	System.out.println("Number "+num+ " is Prime number");							 
			 }
		 }

}
