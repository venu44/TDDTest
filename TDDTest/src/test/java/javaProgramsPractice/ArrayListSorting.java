package javaProgramsPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListSorting {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> numbers= new ArrayList<Integer>(Arrays.asList(1,2,4,6,7));
		
		
		if(numbers.size()>=2) {
			
			Collections.sort(numbers,Collections.reverseOrder());
			
		int reqnum= numbers.get(1);
		System.out.println("second highest number is "+ reqnum);
		System.out.println("insufficient numbers" + numbers);
		
			
		}
		else
			System.out.println("insufficient numbers" + numbers);
	}
		
	

}	
