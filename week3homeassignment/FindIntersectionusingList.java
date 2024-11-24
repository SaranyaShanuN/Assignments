package week3.week3homeassignment;

import java.util.LinkedList;
import java.util.List;

public class FindIntersectionusingList {

	public static void main(String[] args) {

		int[] num1 = {3, 2, 11, 4, 6, 7};
		int[] num2 = {1, 2, 8, 4, 9, 7};
		
		System.out.println("Numbers that are equal in both arrays are: ");
		
		for (int i=0; i<num1.length; i++)
				{
			for (int j=0; j<num2.length; j++)
			{
				if (num1[i] == num2[j]) {
					System.out.println(num1[i]+" ");
				}
			}
				}

	}

}
