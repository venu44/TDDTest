package javaProgramsPractice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Randomtest {
	
	public static void main(String[] args) {
		
		String inputString="programming";
		
		Map<Character, Integer> CharFrequencyMap=new HashMap<Character,Integer>();
		
		
	for(char c: inputString.toCharArray()) {
		CharFrequencyMap.put(c, CharFrequencyMap.getOrDefault(c, 0)+1);
		
		
		
	}
	
	System.out.println("Character repetation in the string"+inputString+":");
	
	for(Map.Entry<Character, Integer> entry : CharFrequencyMap.entrySet()) {
		
		System.out.println("'"+entry.getKey()+"' :" + entry.getValue()+"times");
	}
}
}
	


