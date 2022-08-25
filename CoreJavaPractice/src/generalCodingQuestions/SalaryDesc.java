package generalCodingQuestions;
//Q: sort the salary of employees in descending order whose deptId is 10.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SalaryDesc {

	public static void main(String[] args) {
		
		List<Employee> empList = new ArrayList<>();
			empList.add(new Employee(1,11,40000));
			empList.add(new Employee(2,10,20000));
			empList.add(new Employee(3,10,30000));
			
			List<Long> collect = empList.stream().map(Employee::getDeptId).collect(Collectors.toList());
			System.out.println("deptList:"+collect);
			
			List<Double> filterList = empList.stream().filter(emp -> emp.getDeptId() == 10).map(Employee::getSalary)
					.collect(Collectors.toList());
			
			System.out.println("before reverse deptList:"+filterList);
			Collections.sort(filterList, Collections.reverseOrder());
			
			System.out.println("deptList:"+filterList);
				
	}
}