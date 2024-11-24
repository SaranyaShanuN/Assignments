package week3.week3homeassignment;

import java.util.Arrays;
import java.util.LinkedList; 
import java.util.List;

public class SecondLargestnumber {

	public static void main(String[] args) {

		int[] number = {3, 2, 11, 4, 6, 7};
		Arrays.sort(number);
		System.out.println("Second Largest number post Sorting is: "+number[4]);
	}
}
