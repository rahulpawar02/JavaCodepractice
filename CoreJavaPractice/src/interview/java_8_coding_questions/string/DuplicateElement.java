package interview.java_8_coding_questions.string;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//How to find duplicate elements in a given integers list in java using Stream functions?
public class DuplicateElement {

	public static void main(String[] args) {
		
		List<Integer> arrList = Arrays.asList(10,2,2,4,6,7,9,7);
		Set<Integer> numberSet = new HashSet<>();
		arrList.stream().filter(ele -> !numberSet.add(ele)).forEach(System.out::println);
	}
}
