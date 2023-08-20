package interview.java_8_coding_questions.string;
//Given a String, find the first repeated character in it using Stream functions?
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstRepeated {

	public static void main(String[] args) {
		
		String inputStr = "AaetE";
		String filterStr = inputStr.trim().replaceAll("\\s+", "");

		//Java 8 way:
		Character firsRepeatedChar = filterStr.chars()
				.mapToObj(ch -> Character.toLowerCase(Character.valueOf((char) ch)))
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream()
				.filter(entry -> entry.getValue() > 1L)
				.map(Map.Entry::getKey).findFirst()
				.orElse('\0');
		
		System.out.println(firsRepeatedChar != '\0' ? "First Repeated Character is: " + firsRepeatedChar
				: "First Repeated Character is Not Found");
	}
}
