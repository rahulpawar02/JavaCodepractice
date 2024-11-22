package interview.java_8_coding_questions.string;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

//Given a String, find the first non-repeated character in it using Stream functions?
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
				.mapToObj(c -> Character.toLowerCase(Character.valueOf((char) c)))
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())) //it's return the map where keys are characters and values are the counts of each character
				.entrySet().stream()
				.filter(entry -> entry.getValue() == 1L) // filter out entries whose count is 1.
				.map(Map.Entry::getKey)
				.findFirst().orElse('\0'); // Provide default value '\0' if not found
		
		System.out.println(firstNonRepChar2 != '\0' ? "First Non-repeated Character is: " + firstNonRepChar2
				: "First Non-repeated Character is Not Found");
		
		
		
		
		Map<Character, Long> charCount = filterStr.chars()
				.mapToObj(c -> Character.toLowerCase(Character.valueOf((char) c)))
				.collect(Collectors.groupingBy(o -> o, LinkedHashMap::new, Collectors.counting()));
		
		Character firstNonRepChar3 = charCount.entrySet().stream().filter(entry -> entry.getValue() == 1).map(Map.Entry::getKey)
				.findFirst().get();
		
		System.out.println("combined: first non-repeated char is:" + firstNonRepChar3);
		
		Character firstRepChar = charCount.entrySet().stream().filter(entry -> entry.getValue() > 1).map(Map.Entry::getKey).findFirst().get();
		
		System.out.println("combined: first Repeated char is:" + firstRepChar);

		   
		   
//		   For example, to compute the set of last names of people in each city:
//		   Map<City, Set<String>> namesByCity
//		   = people.stream().collect(
//		     groupingBy(Person::getCity,
//		                mapping(Person::getLastName,
//		                        toSet())));


	}
}
