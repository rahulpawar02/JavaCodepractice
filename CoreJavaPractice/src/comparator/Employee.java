package comparator;

//we can't implement Comparator interface in model class, we have to create new class based on your required property. 
//example if you want to compare based on salary for that new class, if compare based on name for that new class and implements the comparator interface

public class Employee {
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

	
	public int getEmpId() {
		return empId;
	}
	
	public void setEmpId(int empId) {
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

