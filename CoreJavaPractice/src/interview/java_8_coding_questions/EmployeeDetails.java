package interview.java_8_coding_questions;
import java.math.BigDecimal;
//Q. create map with empId with there details object
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeDetails {

	public static void main(String[] args) {

		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(1L, "name1" ,10L,"finance", new BigDecimal("40000.00")));
		empList.add(new Employee(2L, "name2", 11L,"IT", new BigDecimal("20000.00")));
		empList.add(new Employee(3L, "name3", 12L, "R&D", new BigDecimal("30000.0")));
		empList.add(new Employee(4L, "name4" , 13L, "IT", new BigDecimal("50000.0)")));


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
		
		//find number of employee whose department is 'IT'
		List<Employee> collect = empList.stream().filter(emp -> emp.getDeptName().equalsIgnoreCase("IT")).collect(Collectors.toList());
		
		System.out.println("IT department emplist is:" + collect);
		
		//Department wise employee list
		 Map<String, List<Employee>> empDeptMap = empList.stream().collect(Collectors.groupingBy(Employee::getDeptName));
		System.out.println("--department wise emp------");
		
		empDeptMap.forEach( (k, v) -> {
			System.out.println( k + v);
		});
				
	}
	
}
