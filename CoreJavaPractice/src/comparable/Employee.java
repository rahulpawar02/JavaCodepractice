package comparable;

public class Employee implements Comparable<Employee>{ //here < > we need to mention the type of objects that this object may be compared to

	private int empId;
	private String name;
	private String phone;
	
	
	public Employee() {
		
	}
	
	public Employee(int empId, String name, String phone) {
		this.empId = empId;
		this.name = name;
		this.phone = phone;
	}
	
	//compareTo method.. only one method in Comparable interface that is compareTo(Object obj)
	// compareTo based on empId property	
	@Override
	public int compareTo(Employee empObj) {
		return this.empId - empObj.empId;
	}
	
// compareTo based on name property [ example for string data type ]
//	@Override
//	public int compareTo(Employee empObj) {
//		int cnt = name.compareTo(empObj.name);
//		return cnt;
//	}
		
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
	
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", phone=" + phone + "]";
	}

}
