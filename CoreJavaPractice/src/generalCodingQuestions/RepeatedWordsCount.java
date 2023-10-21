package generalCodingQuestions;

import java.util.LinkedHashMap;
import java.util.Map;

//find repeated word count with mentain the insertion order.
public class RepeatedWordsCount {

	public static void main(String[] args) {

		String str = "aaabb";
		Map<Character, Integer> repeatedCountMap = new LinkedHashMap<>();
		for (int i = 0; i < str.length(); i++) {
			if (repeatedCountMap.containsKey(str.charAt(i))) {
				repeatedCountMap.put(str.charAt(i), repeatedCountMap.get(str.charAt(i)) + 1);
			} else {
				repeatedCountMap.put(str.charAt(i), 1);
			}
		}
		System.out.println("result map is:" + repeatedCountMap);
	}
}
