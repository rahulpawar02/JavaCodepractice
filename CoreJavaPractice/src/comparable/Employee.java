package comparable;

public class Employee implements Comparable<Employee>{ //here < > we need to mention the type of objects that this object may be compared to

	private int empId;
	private String name;
	private double salary;
	
	public Employee() {
		
	}
	
	public Employee(int empId, String name, double salary) {
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}
	
	//compareTo method.. only one method in Comparable interface that is compareTo(Object obj)
	// compareTo based on empId property	
//	@Override
//	public int compareTo(Employee empObj) {
//		return this.empId - empObj.empId;
//	}
	
	
// compareTo based on name property [ example for string data type ]
	@Override
	public int compareTo(Employee empObj) {
		return this.name.compareTo(empObj.name);
	}
		
	public int getId() {
		return empId;
	}
	
	public void setId(int empId) {
		this.empId = empId;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + "]";
	}
	
}
