package generalCodingQuestions;

import java.util.LinkedHashSet;
import java.util.stream.Collectors;

public class RemoveDuplicateCharacterInString {

	public static void main(String[] args) {

		String str ="HappyNewYear";
		
		String finalStr1 = removeDupChar_Approach_1(str);
		System.out.println(finalStr1);
		
		String finalStr2 = removeDupStr_Approach_2(str);
		System.out.println(finalStr2);
		
		String finalStr3 = removeDupStr_Approach_3_java_8(str);
		System.out.println(finalStr3);


	}
	
	public static String removeDupChar_Approach_1(String str) {	
		boolean seen[] = new boolean[256];
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i< str.length(); i++) {
			
			char c = str.charAt(i);
			if(!seen[c]) {
				sb.append(c);
				seen[c] = true;
			}
		}
		return sb.toString();
	}
	
	public static String removeDupStr_Approach_2(String str) {
		
		LinkedHashSet<Character> linkedset = new LinkedHashSet<>();

		StringBuilder sb = new StringBuilder();

//		for(int i=0; i< str.length(); i++) {
//			linkedset.add(str.charAt(i));
//		}

		for (char ch : str.toCharArray()) {
			linkedset.add(ch);
		}

		for (char ch : linkedset) {
			sb.append(ch);
		}

		return sb.toString();
	}

	public static String removeDupStr_Approach_3_java_8(String str) {
		
		return str.chars() // Convert the string to an IntStream
				  .distinct() // Remove duplicates
				  .mapToObj(c -> String.valueOf((char) c)) // Convert int to char and then to string
				  .collect(Collectors.joining()); // Collect into a string
	
	}
}
