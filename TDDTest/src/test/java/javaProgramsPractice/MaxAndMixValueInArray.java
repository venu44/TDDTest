package javaProgramsPractice;

public class MaxAndMixValueInArray {
	
	public static void main(String [] args) {
		int [] numbers= {10,20,56,31,25,89,80,52};
		int MaxValue=numbers[0];
		int MinValue=numbers[0];
		
		for(int i=0;i<numbers.length;i++) {
			if(numbers[i]<MinValue) {
				MinValue=numbers[i];
				
			}
			if(numbers[i]>MaxValue) {
				
				MaxValue=numbers[i];
			}
			
			
		}
		System.out.println("Max value in array is "+MaxValue+" and Minimum value in array is "+MinValue);
		
		
	}
	
	public void ArraySort() {
		
		int [] numbers= {10,52,36,5,55,45,62,89,74,55};
		int length=numbers.length;
		int temp;
		
		for(int i=0;i<length;i++) {
			for(int j=i+1;i<length;i++) {
				
				if(numbers[i]<numbers[j]) {
					temp=numbers[i];
					numbers[i]=numbers[j];
					numbers[j]=temp;
				}
				
			}
		}
		System.out.println("arrays are sorted as below");
		for(int n:numbers)
			System.out.print(n +" ");
		
	}

}
