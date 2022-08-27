package interview.java_8_coding_questions;
//Q: sort the salary of employees in descending order whose deptId is 10.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SalaryDesc {

	public static void main(String[] args) {
		
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(1L, "finance", 11L, 40000.0));
		empList.add(new Employee(2L, "IT", 10L, 20000.0));
		empList.add(new Employee(3L, "R&D", 10L, 30000.0));

		List<Long> collect = empList.stream().map(Employee::getDeptId).collect(Collectors.toList());
		System.out.println("dept number List:" + collect);

		List<Double> filterList = empList.stream().filter(emp -> emp.getDeptId() == 10).map(Employee::getSalary)
				.collect(Collectors.toList());

		System.out.println("before reverse salaries:" + filterList);
		Collections.sort(filterList, Collections.reverseOrder());

		System.out.println("salaries of dept No:10 in decending order:" + filterList);
	}
}