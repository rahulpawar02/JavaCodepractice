package generalCodingQuestions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicatejava8 {

	public static void main(String[] args) {
		
		List<Integer> list= Arrays.asList(10,20,20,30,40,50,10,60);
		Set<Integer> set = new HashSet<Integer>();
		
//	   list.stream().filter(e -> set.add(e)).forEach(e->System.out.println(e));
		
//		Using distinct()
		List<Integer> uniqueList = list.stream().distinct().collect(Collectors.toList());
		System.out.println("list" + uniqueList);
		
//		using removeIf() collection method.
		System.out.println("org list" + list); 
		list.removeIf(n -> !set.add(n));
		System.out.println("list 2" + list);
		 
		 
	}
}
