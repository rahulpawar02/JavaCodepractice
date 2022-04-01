package comparable;

import java.util.ArrayList;
import java.util.Collections;
//if we want sort the objects based on single field or property then we use the comparable. 
public class ComparableTest {

	public static void main(String[] args) {
		
		ArrayList<Employee> employeeList = new ArrayList<Employee>(); 
		
		employeeList.add(new Employee(2,"yash@gmail.com","5555"));
		employeeList.add(new Employee(1,"adi@gmail.com","6666"));
		employeeList.add(new Employee(3,"bond@gmail.com","4444"));
		
		
		System.out.println(employeeList);
		
		Collections.sort(employeeList);
		System.out.println(employeeList);
		
	}
}
