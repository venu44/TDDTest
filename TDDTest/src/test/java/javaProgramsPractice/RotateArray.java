package javaProgramsPractice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RotateArray {
	
	public static void main(String[] args) {
		int[] inputArray = {1, 2, 3, 4, 5, 6, 7, 8};
		int positions = 5; // Number of positions to rotate
		System.out.println("Original array is " + Arrays.toString(inputArray));
		
		// Rotate array to the right
		arrayRotateRight(inputArray, positions);
		System.out.println("Rotated array is " + Arrays.toString(inputArray));
	}
	
	public static void arrayRotateRight(int[] array, int positions) {
		int length = array.length;
		//positions = positions % length; // To handle cases where positions > length
		
		// Temporary array to store elements that will be moved to the beginning
		int[] temp = Arrays.copyOfRange(array, length - positions, length);
		
		// Shift elements to the right
		System.arraycopy(array, 0, array, positions, length - positions);
		
		// Copy the elements from temp to the beginning of the original array
		System.arraycopy(temp, 0, array, 0, positions);
	}
}
