package comparable;

import java.util.ArrayList;
import java.util.Collections;
//if we want sort the objects based on single field or property then we use the comparable. 
public class ComparableTest {

	public static void main(String[] args) {
		
		ArrayList<Employee> employeeList = new ArrayList<Employee>(); 
		
		employeeList.add(new Employee(2,"Yash",30000.00));
		employeeList.add(new Employee(1,"Aditya",40000.00));
		employeeList.add(new Employee(3,"Bhumi",20000.00));
		
		System.out.println("Before comparable:");
		employeeList.stream().forEach(obj -> System.out.println(obj));

		Collections.sort(employeeList);
		System.out.println("After comparable:");
		employeeList.stream().forEach(obj -> System.out.println(obj));
		
	}
}
