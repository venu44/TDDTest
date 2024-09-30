package mapPrograms;

import java.util.HashMap;
import java.util.Map;

public class EntrySetExample {
	public static void main(String[] args) {
		
	
	
	HashMap<String,Integer> map=new HashMap<>();
	map.put("apple",10);
	map.put("orange", 9);
	map.put("mango", 8);
	map.put("chiku",7);
	map.put("sapota", 6);
	map.put("kargu", 5);
	
	
	for(Map.Entry<String,Integer> entry: map.entrySet()) {
		
		String fruit=entry.getKey();
		Integer price=entry.getValue();
		System.out.println("fruit is "+fruit+" and price is :"+price);
		
		
	}

}
}