package interview.java_8_coding_questions;

import java.math.BigDecimal;

public class Employee {

	private Long id;
	private String name;
	private Long deptId;
	private String deptName;
	private BigDecimal salary;

	public Employee(Long id, String name, Long deptId , String deptName, BigDecimal salary) {
		super();
		this.id = id;
		this.name = name;
		this.deptId = deptId;
		this.deptName = deptName;
		this.salary = salary;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Long getDeptId() {
		return deptId;
	}
	
	public void setDeptId(Long deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", deptId=" + deptId + ", deptName=" + deptName + ", salary="
				+ salary + "]";
	}
}
