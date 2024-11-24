package week3.week3homeassignment;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String input1 = "stois";
		// optss
		String input2 = "potss";
		// optss
		int length1 = input1.length();
		int length2= input2.length();
		
		if (length1 == length2 ) {
			System.out.println("Lengths match");			
			char[] charArray1 = input1.toCharArray();
			char[] charArray2 =input2.toCharArray();
			Arrays.sort(charArray1);
			Arrays.sort(charArray2);
			
			if (Arrays.equals(charArray1, charArray2))
			{
				System.out.println("Input is Anagram");
			}
			else
			{
				System.out.println("Input is not Anagram");
			}				
		}
		else
		{
			System.out.println("Lengths mismatch, therefore the strings are not an Anagram");
		}

	}

}