package java8.stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterTest {

	public static void main(String[] args) {

		List<String> langList = Arrays.asList("Java", "Kotlin", "python", "golang");

		// problem statement: find the given list java is present or not?

		// without filter or traditional ways
		for (String langName : langList) {
			if (langName.equals("Java")) {
				System.out.println("Yes, Java is available");
			}
		}

		// with filter list
		Stream<String> filteredLangList = langList.stream().filter(e -> e.equals("Java"));
//		filteredLangList.forEach(e -> System.out.println(e));
//		
//		//3 ways to print stream as follows
//		
		//1. forEach() method: this is terminal operation, you can't do anything after you call it. use it as function
//		filteredLangList.forEach(e -> System.out.println(e));
		
		//2. peek() this is intermediate operation
//		filteredLangList.peek(e->System.out.println(e));
		
		//3. println with collect, this is terminal operation, you can't do anything after you call it. use it as function
		System.out.println(filteredLangList.collect(Collectors.toList()));	
		
		// with filter list with method references
		Stream<String> filteredLangList2 = langList.stream().filter(FilterTest::isJava);
		filteredLangList2.forEach(e -> System.out.println("with method ref:"+e));
		
	}
	
	public static boolean isJava(String name) {
		return name.equals("Java");
	}
	
	

}
