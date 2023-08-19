package interview.java_8_coding_questions.string;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeated {

	public static void main(String[] args) {

		String inputStr = "AaetE";
		String filterStr = inputStr.trim().replaceAll("\\s+", "");

		// Traditional way:
		char firstNonRepChar1 = '\0';
		boolean foundNonRepChar = false;
		for (int i = 0; i < filterStr.length(); i++) {
			boolean isRepeated = false;
			for (int j = 0; j < filterStr.length(); j++) {
				if (i != j && Character.toLowerCase(filterStr.charAt(i)) == Character.toLowerCase(filterStr.charAt(j))) { //here, i != j to don't compare with same index values.
					isRepeated = true;
					break;
				}
			}
			if (!isRepeated) {
				firstNonRepChar1 = filterStr.charAt(i);
				foundNonRepChar = true;
				break;
			}
		}
		
		System.out.println(foundNonRepChar ? "first Non-repeated charater is: " + firstNonRepChar1
				: "first Non-repeated charater is not found.");	
		//Java 8 way:
		
		Character firstNonRepChar2 = filterStr.chars() // char() which return the stream of characters
				.mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s)))
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream()
				.filter(entry -> entry.getValue() == 1L) // filter out entries whose count is 1.
				.map(entry -> entry.getKey())
				.findFirst().orElse('\0'); // Provide default value '\0' if not found
		
		System.out.println(firstNonRepChar2 != '\0' ? "first Non-repeated charater is: " + firstNonRepChar2
				: "first Non-repeated charater is not found.");
	}
}
