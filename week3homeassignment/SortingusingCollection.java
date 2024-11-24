package week3.week3homeassignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortingusingCollection {

	public static void main(String[] args) {

		ArrayList<String> name = new ArrayList<String>();
		name.add("HCL");
		name.add("Wipro");
		name.add("Aspire Systems");
		name.add("CTS");
		
		Collections.sort(name, Collections.reverseOrder());
		System.out.println(name);
		
	}

}
