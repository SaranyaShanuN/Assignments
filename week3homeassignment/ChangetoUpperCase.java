package week3.week3homeassignment;

public class ChangetoUpperCase {

	public static void main(String[] args) {
		String test = "changeme";
		char[] charArray = test.toCharArray();
		int length = charArray.length;
			
		for (int i=0; i<=length; i++)
				{
				if (i%2 == 1)
				{
//				System.out.print(" "+charArray[i]);
				charArray[i] = Character.toUpperCase(charArray[i]);
//				System.out.println(" "+charArray[i]);
				}
				}
		System.out.println(charArray);
	}

}