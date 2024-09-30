package javaProgramsPractice;

public class ToFindElementInArray {
	
	public static boolean contains(int [] arr , int item) {
		for(int n : arr) {
			if(item==n) {
				return true;
				
			}			
		}
		return false;
		
		
	}
	
	public static void main(String[] args) {
		int [] numbers= {2013,1889,1991,1997,1235,1988,1993,1992,2012,2016,2017};
		System.out.println(contains(numbers,2013));
		System.out.println(contains(numbers,1992));
	}

}
