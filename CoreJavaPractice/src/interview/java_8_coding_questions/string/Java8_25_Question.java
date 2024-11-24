package interview.java_8_coding_questions.string;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8_25_Question {

	public static void main(String[] args) {
		List<Integer> nums= Arrays.asList(10, 12, 22, 5, 100, 13, 521, 22, 10);

//       1) Given the list of integers, find the first element of the list using Stream functions ?
         System.out.println("first element is:");
		 nums.stream().findFirst().ifPresent(System.out::println);
		 
//		 2) Given a list of integers, find the total number of elements present in the list using Stream functions ?
         System.out.println("total no of element is:");
         long elementCnt = nums.stream().count();
		 System.out.println(elementCnt);
		 
//		 3) Given a list of integers, find out all the even and odd numbers that exist in the list using Stream functions ?
         Map<Boolean, List<Integer>> numMap = nums.stream().collect(Collectors.partitioningBy( num -> num % 2 == 0));
         
         List<Integer> evenList = numMap.get(true);     
         System.out.println("event:" + evenList);
         
         List<Integer> oddList = numMap.get(false);
         System.out.println("odd:" + oddList);
		 
//		 4) Given a list of integers, find out all the numbers starting with 5 using Stream functions ?
         
         List<Integer> startNumbers = nums.stream().filter(num -> num.toString().startsWith("5")).collect(Collectors.toList());
         System.out.println("numbers starts with 5"+ startNumbers);
         
//		 5) How to find duplicate elements in a given integers list in java using Stream functions?
         System.out.println("find duplicate approach 1:");
         Set<Integer> set = new HashSet<>();
         nums.stream().filter( num -> !set.add(num)).forEach(System.out::println);
         
         System.out.println("find duplicate approach 2:");

         Set<Integer> findedDuplicates = nums.stream().filter(n -> Collections.frequency(nums, n) > 1).collect(Collectors.toSet());
         System.out.println(findedDuplicates);
         
//		 6) Given a list of integers, find the maximum and minimum value element present in it using Stream functions?	
         
         Optional<Integer> max = nums.stream().max(Integer::compareTo);
         System.out.println("max is:"+ max.orElse(null));
         
          Optional<Integer> min = nums.stream().min(Integer::compareTo);
         System.out.println("min is:"+ min.orElse(null));
         
//		 7) Given a list of integers, sort all the values present in it using Stream functions?
         System.out.println("sorted list is:");
         nums.stream().sorted().forEach(System.out::println);
                
//		 8) Given a list of integers, sort all the values present in it in descending order using Stream functions?
         System.out.println("sorted list in Descending order:");
         nums.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
         
         
//		 9) Check if an array contains duplicate values or not.
         
         int arr[] = {1,2,3,4,2};
         
         if(Arrays.stream(arr).distinct().count() != arr.length) {
        	 System.out.println("array contains duplicate values");
         } else {
        	 System.out.println("array contains unique values");

         }
         
//		 10) Java 8 program to perform square on list elements and filter numbers greater than 50.
//		 11) Write a Java 8 program to sort an array and then convert the sorted array into Stream?
         System.out.println("sorted Array is:");
         int arr2[] = {1,2,3,4,2};
         Arrays.sort(arr2);
         Arrays.stream(arr2).forEach(System.out::print);
         System.out.println();


//		 12) How to use map to convert words into Uppercase in Java 8?
         
         //in case of String
         String str=" i am rahul";
         
         str.chars().mapToObj(ch -> Character.toUpperCase(Character.valueOf((char) ch))).forEach(System.out::print);
         
         System.out.println();
         
         //in case of list of String
         
         List<String> nameList = Arrays.asList("aditya", "ajay");
         
         nameList.stream().map(name -> name.toUpperCase()).forEach(System.out::print);
         
         System.out.println();
         
         
//		 13) Write a Program to find the Maximum element in an array?
         System.out.print("Max element in array is:");
         int numbers[] = {1, 2, 3, 4};
         Arrays.stream(numbers).max().ifPresent(System.out::println);
         
//		 14) Write a Java 8 program to concatenate two Streams?
         
         Stream<Integer> s1  = Stream.of(1,2,3);
         Stream<Integer> s2 = Stream.of(4,5,6);
         
         Stream.concat(s1, s2).forEach(System.out::print);
         System.out.println();

//		 15) Write a program in stream to print 10 random numbers.
    	 System.out.println("Random 10 numbers:");     
         Random random = new Random();
         Stream.generate(random::nextInt).limit(10).forEach(System.out::println);
         
//		 16) Print date and time using Java 8 feature?
//       17) Then format it in dd-MM-yyyy format?
//       18) How to check if a list is empty in Java 8 using Optional, if not null iterate through the list and print the object?
//		 19) Given the array {10, 1, 20, 2, 100, 100, 100}, write Java code using Java Streams to determine the number of occurrences of a particular value.
//		 20) How to find only duplicate elements with their count from the String ArrayList in Java 8?
//		 21) Write a Program to give the sum of the salary of employees.
               
         List<Employee> empList = new ArrayList<Employee>();
         empList.add(new Employee("abc", new BigDecimal("1000")));
         empList.add(new Employee("pqr", new BigDecimal("2000")));
         
         BigDecimal sumOfSalary = empList.stream().map(Employee::getSalary).reduce(BigDecimal.ZERO, BigDecimal::add);
         System.out.println("sum of salary is:" + sumOfSalary);
         
         //if data type of salary is double then use: empList.stream().mapToDouble(Employee::getSalary).sum();


         
         
//		 22) Write a program to print the count of each character in a String using streams.
//		 23) How to convert a List of objects into a Map by considering duplicated keys and store them in sorted order?
//		 24) Given a String, find the first non-repeated character in it using Stream functions.
//		 25) Find the first unique character in a string using Java streams.

	}

}
