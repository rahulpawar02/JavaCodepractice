package objectoperations.deepcopy;

public class Employee implements Cloneable {

	private Long empId;
	private String empName;
	private Address empAddress;

	public Employee(Long empId, String empName, Address empAddresss) {
    	super();
		this.empId = empId;
		this.empName = empName;
		this.empAddress = empAddresss;
	}

	//customized the clone method for deep copy
	@Override
	public Object clone() throws CloneNotSupportedException {
		Employee employee = (Employee) super.clone();
		// Deep copy the Address object
        employee.setEmpAddress((Address) empAddress.clone());
        return employee;
	}

	public Long getEmpId() {
		return empId;
	}

	public void setEmpId(Long empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Address getEmpAddress() {
		return empAddress;
	}

	public void setEmpAddress(Address empAddress) {
		this.empAddress = empAddress;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empAddress=" + empAddress + "]";
	}
}
