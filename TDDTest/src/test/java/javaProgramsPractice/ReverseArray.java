package javaProgramsPractice;

import java.util.Arrays;

public class ReverseArray {
	
	public static void reverseArray(int[] arr){
		int temp;
		int start=0;
		int len=arr.length-1;
		while(start<len) {
			temp=arr[start];
			arr[start]=arr[len];
			arr[len]=temp;
			start++;
			len--;
			
		}
		System.out.println("array is 2nd step "+ Arrays.toString(arr));
	}
	public static void printArray(int arr[]) {
		System.out.println("array is "+ Arrays.toString(arr));
		
	}
	
	
	public static void main(String[] args) {
		int [] numbers= {1,2,3,4,5,6};
		printArray(numbers);
		reverseArray(numbers);
		printArray(numbers);
	}

}
