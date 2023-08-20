package java8.stream_api.groupingBy;

import java.util.ArrayList;
//import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByMain {
	
	public static void  main (String args[]) {
		
		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student(1L,"mark", 10));
		studentList.add(new Student(2L,"alex", 23));
		studentList.add(new Student(3L,"Johnson",23));
		
		//groupingBy
		Map<Integer, List<Student>> studentAgeGrouping= studentList.stream().collect(Collectors.groupingBy(Student::getAge));
		
		//age wise create the group according to studentList.
		System.out.println(studentAgeGrouping);	
		
		
	//	Map<Integer, List<String>> namesName= new HashMap<>();
		
	}

}
