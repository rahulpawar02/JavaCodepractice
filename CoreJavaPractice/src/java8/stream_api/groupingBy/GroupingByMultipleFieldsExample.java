package java8.stream_api.groupingBy;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByMultipleFieldsExample {

	public static void main(String[] args) {

		List<Employee> employeesList = new ArrayList<>();
		employeesList.add(new Employee(101, "Glady", "Manager", "Male", 2500000));
		employeesList.add(new Employee(102, "Vlad", "Software Engineer", "Female", 1500000));
		employeesList.add(new Employee(103, "Shine", "Lead Engineer", "Female", 2000000));
		employeesList.add(new Employee(102, "Vlad", "Software Engineer", "Female", 1500000));
		employeesList.add(new Employee(103, "Shine", "Lead Engineer", "Female", 2000000));
		employeesList.add(new Employee(104, "Nike", "Manager", "Female", 2500000));
		employeesList.add(new Employee(105, "Slagan", "Software Engineer", "Male", 1500000));
		employeesList.add(new Employee(106, "Murekan", "Software Engineer", "Male", 1500000));
		employeesList.add(new Employee(107, "Gagy", "Software Engineer", "Male", 1500000));

		// grouping by single field
		// grouping by salary

		Map<Long, List<Employee>> collect = employeesList.stream().collect(Collectors.groupingBy(Employee::getSalary));
		collect.forEach((salary, employees) -> {
			System.out.println(salary);
			System.out.println(employees);
		});

		// grouping by multiple field
		// grouping by designation and gender two properties and need to get the count.
		Map<String, Map<String, Long>> empGenderMap = employeesList.stream().collect(Collectors.groupingBy(
				Employee::getDesignation, Collectors.groupingBy(Employee::getGender, Collectors.counting())));

		// print multiple map using forEach
		empGenderMap.forEach((designation, nestedMap) -> {
			System.out.println(designation + ":");
			nestedMap.forEach((gender, count) -> {
				System.out.println(gender + " = " + count);
			});

		});

		System.out.println("empGenderMap: "+ empGenderMap);
		// suppose iterate and perform some operations
	}
}
