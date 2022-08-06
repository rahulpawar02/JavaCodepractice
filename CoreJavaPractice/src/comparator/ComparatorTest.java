package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//if we want sort the objects based on multiple field or property then we use the comparator. 
public class ComparatorTest {

	public static void main(String[] args) {
		
		ArrayList<Employee> employeeList = new ArrayList<Employee>(); 
		
		employeeList.add(new Employee(2,"Yash",30000.00));
		employeeList.add(new Employee(1,"Aditya",40000.00));
		employeeList.add(new Employee(3,"Bhumi",30000.00));
		employeeList.add(new Employee(4,"Aditya",20000.00));

		ArrayList<Employee> employeeList2 = new ArrayList<>(employeeList);
		
		System.out.println("Before comparator:");
		employeeList.stream().forEach(obj -> System.out.println(obj));
		

		//A] using separate classes
		Collections.sort(employeeList, new sortBySalary());
		System.out.println("After comparator(salary based):");
		employeeList.stream().forEach(obj -> System.out.println(obj));
		
		Collections.sort(employeeList2, new sortByName());
		System.out.println("After comparator(Name based):");
		employeeList2.stream().forEach(obj -> System.out.println(obj));
		
		//B] using i] comparator comparing() method [good approach]
//		Collections.sort(employeeList, Comparator.comparing(Employee::getName));
//		System.out.println("after comparator");
//		employeeList.stream().forEach(obj -> System.out.println(obj));
		
			   // ii] comparator comparing() and thenComparing() method
//		Collections.sort(employeeList, Comparator.comparing(Employee::getName).thenComparing(Employee::getSalary));
//		System.out.println("after comparator");
//		employeeList.stream().forEach(obj -> System.out.println(obj));
		
		
	}

}

//separate class(for compare salary) with implemented Comparator interface 
class sortBySalary implements Comparator<Employee> {
	
	public int compare(Employee e1, Employee e2) {
		return (int) (e1.getSalary() - e2.getSalary());
	}
}

//separate class(for compare Name) with implemented Comparator interface 
class sortByName implements Comparator<Employee> {
	
	public int compare(Employee e1, Employee e2) {
		return e1.getName().compareTo(e2.getName());
	}
}
