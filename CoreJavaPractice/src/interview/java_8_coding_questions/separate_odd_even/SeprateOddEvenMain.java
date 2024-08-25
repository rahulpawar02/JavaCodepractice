package interview.java_8_coding_questions.separate_odd_even;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SeprateOddEvenMain {

	public static void main(String[] args) {
		List<Integer> intList = Arrays.asList(1, 3, 4, 2, 5, 6, 7);
		
		Map<Boolean, List<Integer>> collectNumbers = intList.stream().collect(Collectors.partitioningBy( number -> number % 2 == 0));
		
		List<Integer> evenList = collectNumbers.get(true);
		List<Integer> oddList = collectNumbers.get(false);
		System.out.println("even List: " + evenList);
		System.out.println("odd List: " + oddList);		
	}
	
//	Note: duplicate element not consider in the return list
}


/*
  Output:
	even List: [4, 2, 6]
	odd List: [1, 3, 5, 7, 5]
*/