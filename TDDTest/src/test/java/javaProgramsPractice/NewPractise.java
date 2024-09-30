package javaProgramsPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class NewPractise {
	static String rev="";
	public static String reverseCharacter(String input){
		
		if(input==null || input.isEmpty()) {
			return input;
		}
		
		String[] words=input.split("//s+");
		StringBuilder  reversed= new StringBuilder();
		
		for (String word: words) {
			StringBuilder ReverseWord= new StringBuilder(word);
			ReverseWord.reverse();
			reversed.append(ReverseWord).append(" ");	
			
		}
	
	return reversed.toString();
	}
	public static void main(String[] args) {
		String test= "suresh is tester";
		System.out.println("given string is : " + test);
		System.out.println("reversedstring is : " + reverseCharacter(test));
		
		for(int i = test.length()-1; i >=0;i-- ) {
			
			rev=rev+test.charAt(i);
			
			
		}
		System.out.println(rev);
	}
}