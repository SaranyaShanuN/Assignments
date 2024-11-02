package week1.day2;

import java.util.Arrays;

public class LearnArrays {

	public static void main(String[] args) {

		long[] phNo = {9876543210l,1234567890l,9786543210l,1235467890l};
		int length = phNo.length;
		System.out.println(length);
//		System.out.println(phNo[0]);
//		System.out.println(phNo[1]);
//		System.out.println(phNo[2]);
//		System.out.println(phNo[3]);
		Arrays.sort(phNo);
		for (int i = 0; i <phNo.length; i++ ) {
			System.out.println(phNo[i]);
		}
			
		
	}

}
