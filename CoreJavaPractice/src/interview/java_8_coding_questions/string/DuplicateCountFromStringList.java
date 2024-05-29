package interview.java_8_coding_questions.string;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
//How to find only duplicate elements with its count from the String ArrayList in Java8?
public class DuplicateCountFromStringList {

	public static void main(String[] args) {

		List<String> strList = Arrays.asList("AA", "BB", "AA", "CC", "BB", "LL", "BB");
		
		Map<String, Long> collectedMap = strList.stream().filter(ele -> Collections.frequency(strList, ele) > 1)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		System.out.println("collectedMap: " + collectedMap);
		
	}

}

/* Output:
 * collectedMap: {BB=3, AA=2}
 * 
 */