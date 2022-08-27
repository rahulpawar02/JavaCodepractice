package interview.java_8_coding_questions;

public class Employee {

	private Long id;
	private String name;
	private Long deptId;
	private Double salary;
	
	public Employee(Long id, String name, Long deptId, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.deptId = deptId;
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

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", deptId=" + deptId + ", salary=" + salary + "]";
	}
}
