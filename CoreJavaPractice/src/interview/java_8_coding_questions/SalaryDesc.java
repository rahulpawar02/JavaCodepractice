package interview.java_8_coding_questions;
//Q: sort the salary of employees in descending order whose deptId is 10.

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SalaryDesc {

	public static void main(String[] args) {
		
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(1L, "name1" ,10L,"finance", new BigDecimal("40000.00")));
		empList.add(new Employee(2L, "name2", 11L,"IT", new BigDecimal("20000.00")));
		empList.add(new Employee(3L, "name3", 12L, "R&D", new BigDecimal("30000.0")));

		List<Long> collect = empList.stream().map(Employee::getDeptId).collect(Collectors.toList());
		System.out.println("dept number List:" + collect);

		List<BigDecimal> filterList = empList.stream().filter(emp -> emp.getDeptId() == 10).map(Employee::getSalary)
				.collect(Collectors.toList());

		System.out.println("before reverse salaries:" + filterList);
		Collections.sort(filterList, Collections.reverseOrder());

		System.out.println("salaries of dept No:10 in decending order:" + filterList);
		
		//Using stream: sort the employee based on salary 
		System.out.println("original list is:" + empList);
		
	     List<Employee> sortedEmployees = empList.stream()
	                .sorted((e1, e2) -> e1.getSalary().compareTo(e2.getSalary())) // Using compareTo() here
	                .collect(Collectors.toList());
	     
	     System.out.println("sorted emplist-1" + sortedEmployees );
	     
	     List<Employee> sortedEmployees2 = empList.stream()
	    	        .sorted(Comparator.comparing(Employee::getSalary))
	    	        .collect(Collectors.toList());
	     
	     System.out.println("sorted emplist-2" + sortedEmployees2);

	     
	     
	}
}