package interview.java_8_coding_questions;
//Q. create map with empId with there details object
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeDetails {

	public static void main(String[] args) {

		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(1L, "finance", 11L, 40000.0));
		empList.add(new Employee(2L, "IT", 10L, 20000.0));
		empList.add(new Employee(3L, "R&D", 10L, 30000.0));

		// without java-8
		Map<Long, Employee> empDetails = new HashMap<>();
		for (Employee employee : empList) {
			empDetails.put(employee.getId(), employee);
		}

		for (Map.Entry<Long, Employee> empEntry : empDetails.entrySet()) {
			System.out.println(empEntry.getValue());
		}

		// with java-8
		System.out.println("----------using java-8--------------");
		Map<Long, Employee> empMap = empList.stream().collect(Collectors.toMap(Employee::getId, emp -> emp));

		for (Map.Entry<Long, Employee> empMapEntry : empMap.entrySet()) {
			System.out.println(empMapEntry.getValue());
		}
	}
}
