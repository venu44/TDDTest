package javaProgramsPractice;

import java.util.Arrays;

public class ArraySort {
	public static void main(String[] args) {
		
	
	int [] numbers= {10,52,36,5,55,45,62,89,74,55};
	int length = numbers.length;
	int temp;
	
	for(int i=0;i<length;i++) {
		for(int j=i+1;j<length;j++) {
			
			if(numbers[i]>numbers[j]) {
				temp=numbers[i];
				numbers[i]=numbers[j];
				numbers[j]=temp;
			}
			
		}
	}
	System.out.println("arrays are sorted as below");
	for(int n:numbers)
		System.out.print(n +" ");
	System.out.println("Arrays sort method"+Arrays.toString(numbers));

}
}