package objectoperations.shallowcopy;

public class ShallowCopyMain {

	public static void main(String[] args) throws CloneNotSupportedException {

		Address address = new Address("Pune", "MAH", 411027);
		Employee employee = new Employee(11L, "Aditya", address);
		Employee clonedEmployee = (Employee) employee.clone();

		clonedEmployee.getEmpAddress().setCity("Banglore");

		System.out.println("employee: " + employee);
		System.out.println("cloned employee: " + clonedEmployee);
	}
}

/*
 * Output:
 * 
 * Before setCity: 
 * employee: Employee [empId=11, empName=Aditya, EmpAddress=Address [city=Pune, state=MAH, pinCode=411027]]
 * cloned employee:  Employee [empId=11, empName=Aditya, EmpAddress=Address [city=Pune, state=MAH, pinCode=411027]]
 * 
 * After setCity:
 * employee: Employee [empId=11, empName=Aditya, EmpAddress=Address [city=Banglore, state=MAH, pinCode=411027]] 
 * cloned employee: Employee[empId=11, empName=Aditya, EmpAddress=Address [city=Banglore, state=MAH, pinCode=411027]]
 */

/*
 * In shallow cloning what happen, Object(Employee) contains the object reference of other class (Address), 
 * we have address class here not copy the properties of Address class only Copy the reference of this Address object, 
 * so any change in clone object then automatically refecting into original object, so avoid that we have to go for deep copy.
 */
