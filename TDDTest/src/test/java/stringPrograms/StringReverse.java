package stringPrograms;

public class StringReverse {
	static String rev="";
	public static String reverseCharacters(String input) {
		if(input==null || input.isEmpty()) {
			
			return input;
		}
		
		String [] words=input.split("\\s+");
		StringBuilder reversed=new StringBuilder();
		
		
		
		for (String word : words) {
			
			StringBuilder reversedWord= new StringBuilder(word);
		reversedWord.reverse();
			reversed.append(reversedWord).append(" ");
		 // reversed.append(new StringBuilder(word).reverse()).append(" ");
		
						
		}
		
	return reversed.toString();
	
	}
	public static void main(String[] args) {
		String str="suresh is tester";
		System.out.println("given string is :"+ str);
		String reversed= reverseCharacters(str);
		System.out.println("reversed caracters are : "+ reversed);
	
		for(int i=str.length()-1;i>=0;i--) {
			
			
			rev =rev+str.charAt(i);
		}
		System.out.println(rev);
	}
	}