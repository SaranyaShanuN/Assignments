package week3.week3homeassignment;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {

		int[] missingnum = {1, 2, 3, 4, 10, 6, 8};
		Arrays.sort(missingnum);
		
		int i=1;
		System.out.println("Missing numbers are: ");
		while (i < missingnum.length)
		{
			if (missingnum [i] - missingnum[i-1] == 1)
					{
					}
			else
			{
				System.out.println(missingnum[i-1] + 1);
			}
			i++;
		}

	}

}
