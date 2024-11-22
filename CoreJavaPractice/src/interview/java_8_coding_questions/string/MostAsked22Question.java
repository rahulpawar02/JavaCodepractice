package interview.java_8_coding_questions.string;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MostAsked22Question {

	public static void main(String[] args) {
		
	     List<Integer> numList = Arrays.asList(10,15,8,49,25,98,32, 10);

//		1. Given a list of integers, find out all the even numbers that exist in the list using Stream functions?
	     
	     Map<Boolean, List<Integer>> evenOddMap = numList.stream().collect(Collectors.partitioningBy(num -> num%2 == 0));     
	     List<Integer> evenNumList = evenOddMap.get(true);
	     System.out.println("even Number list: " + evenNumList);
	     
//	     2. Given a list of integers, find out all the numbers starting with 1 using Stream functions?
	     System.out.println("Number list starts with 1:");
	     numList.stream().filter(num -> num.toString().startsWith("1")).forEach(System.out::println);
	     
//	     3. How to find duplicate elements in a given integers list in java using Stream functions?
	     System.out.println("finded Duplicate Number");
	     Set<Integer> set = new HashSet<>();
	     numList.stream().filter( num -> !set.add(num)).forEach(System.out::println);
	     
//	     4. Given the list of integers, find the first element of the list using Stream functions?
	     numList.stream().findFirst().ifPresent(num -> System.out.println("First number in the list is: " + num));
	     	     
//	     5. Given a list of integers, find the total number of elements present in the list using Stream functions?
	     long count = numList.stream().count();
	     System.out.println("total number of element present in the list" + count);
	     
//	     6. Given a list of integers, find the maximum value element present in it using Stream functions?
	     Integer maxNum= numList.stream().max(Integer::compare).get();
	     System.out.println("Max Number is: " + maxNum);    
	     
//	     7. Given a String, find the first non-repeated character in it using Stream functions?
	     String str = "AaBbe";
	 
         Map<Character, Long> charCount = str.chars().mapToObj(c -> Character.toLowerCase(Character.valueOf((char) c)))
         			.collect(Collectors.groupingBy(o -> o, LinkedHashMap::new, Collectors.counting()));
         
         Character nonRepeatedFirstChar = charCount.entrySet().stream().filter(entry -> entry.getValue() == 1L).map(Map.Entry::getKey).findFirst().get();
         System.out.println("first Non repeated character is: " + nonRepeatedFirstChar);
         
//       8. Given a String, find the first repeated character in it using Stream functions?
       
         Character repeatedFirstChar = charCount.entrySet().stream().filter(entry -> entry.getValue() > 1).map(Map.Entry::getKey).findFirst().get();
         System.out.println("first Repeated character is: " + repeatedFirstChar);
         
//         9. Given a list of integers, sort all the values present in it using Stream functions?
         System.out.println("sort all numbers:");
         numList.stream().sorted().forEach(System.out::println);
         
//       10. Given a list of integers, sort all the values present in it in descending order using Stream functions?
         System.out.println("sort all numbers in Decending order:");
         numList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
         
//       11. Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
         
         int numArr[] = {10,15,8,49,25,98,32, 10};
         
          boolean result = containDuplicate(numArr);
          System.out.println("Is Number found twice:" + result);
          
//        12. How will you get the current date and time using Java 8 Date and Time API?
          System.out.println("current date is: "+ java.time.LocalDate.now());
          
//        13. Write a Java 8 program to concatenate two Streams?
          List<String> list1 = Arrays.asList("Java", "8");
          List<String> list2 = Arrays.asList("explained", "through", "programs");
          
          Stream<String> concatedStream = Stream.concat(list1.stream(), list2.stream());
          concatedStream.forEach(str2 -> System.out.println(str2 + " "));

//          16. How to use map to convert object into Uppercase in Java 8?
          
          
          
//          18. How to count each element/word from the String ArrayList in Java8?
          List<String> names = Arrays.asList("AA", "BB", "AA", "CC");
          Map<String,Long> namesCount = names
                                  .stream()
                                  .collect(
                                   Collectors.groupingBy(
                                    o->o, Collectors.counting()));
          System.out.println("names count" + namesCount);

          
//          22. Write a program to print the count of each character in a String?
          
          String str2 = "AaBbe";
          Map<Character, Long> charCount1 = str2.chars().mapToObj(c -> Character.toLowerCase(Character.valueOf((char) c)))
       			.collect(Collectors.groupingBy(o -> o, LinkedHashMap::new, Collectors.counting()));
          
          charCount1.forEach((k,v) -> {
            System.out.println("key: " + k + " count is: "+ v);
          });




	}
	
	public static boolean containDuplicate(int[] numArr) {
		
		Set<Integer> set = new HashSet<>();		
		return Arrays.stream(numArr).anyMatch(num -> !set.add(num));	
	}
}
