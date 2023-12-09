package objectoperations.shallowcopy;

public class Employee implements Cloneable {

	private Long empId;
	private String empName;
	private Address EmpAddress;

	public Employee(Long empId, String empName, Address empAddresss) {
     	super();
		this.empId = empId;
		this.empName = empName;
		this.EmpAddress = empAddresss;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		// Shallow copy of the Person object
		return super.clone();
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
		return EmpAddress;
	}

	public void setEmpAddress(Address empAddress) {
		EmpAddress = empAddress;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", EmpAddress=" + EmpAddress + "]";
	}
}
