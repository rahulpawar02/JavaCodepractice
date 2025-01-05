package leetcode;

import java.util.LinkedHashMap;
import java.util.Map;;

public class Q_387_FirstUniqueCharacter_2 {

	public static void main(String[] args) {
		
		String str = "loveleetcode";
		
		Character ch = findFirstUniqueChar(str);
		System.out.println("first unique character is:" + ch);
       
	}
	
	public static Character findFirstUniqueChar(String str) {
		
		
		 Map<Character, Integer> map = new LinkedHashMap<>();
		 
		 for(char ch : str.toCharArray()) {
			 
			 if(map.containsKey(ch)) {				 
				 map.put(ch, map.get(ch) + 1);
			 } else {
				 map.put(ch, 0);
			 }
		 }
		 
		 
//		 map.forEach((k, v) -> {
//			 System.out.println("key: "+ k + " value: " + v);
//			 
//			 if(v == 0) {
//				 System.out.println("first unique character is:" + k);
//		         return k;
//			 }
//		 });
//		 
		for(Map.Entry<Character, Integer> map2 :  map.entrySet()) {
			
			if(map2.getValue() == 0) {
				return map2.getKey();
			}
		}
		return null;
		 
	}

}
