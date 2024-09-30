package javaProgramsPractice;

import java.util.Arrays;

public class IndexOfElementInArray {
	
	public static int findIndex(int [] arr,int t) {
		int len=arr.length;
		int i=0;
		while(i<len) {
			if(t==arr[i])
				return i;
			else i=i+1;
			
		}
		return -1;		
		
	}
	
	public static void main(String[] args) {
		int [] numbers= {20,25,6,5,4,56,85,45,21,36,54,78,9,4,56,44};
		System.out.println("index of the number 25 is "+ findIndex(numbers,25));
		System.out.println("index of the number 21 is "+ findIndex(numbers,21));
		/*
		 * System.out.println("array output without string"+ numbers);
		 * System.out.println("array output with string"+ Arrays.toString(numbers));
		 */
	}

}
