package week1.day2;

public class FindOddNumbers {

	public static void main(String[] args) {
		System.out.println("-----Odd Numbers-----");
		  for (int i=1; i<=10; i++)
		   {
			   if (i%2 == 0) {
					continue;
				}
				else {
					System.out.print(+i+" ");	
		   }

	}

}
}
