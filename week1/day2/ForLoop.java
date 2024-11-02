package week1.day2;

public class ForLoop {

	public static void main(String[] args) {
   for (int i=0; i<=10; i++)
   {
	   if (i%2 == 0) {
			System.out.println("Number "+i+ " is Even");
		}
		else {
			System.out.println("Number "+i+ " is Odd");	
   }
   
	}
   for (int i=0; i<=10; i++)
   {
//	   System.out.println("Number is "+i);  
	   System.out.print(i+" ");  
   }
   
   
}
}