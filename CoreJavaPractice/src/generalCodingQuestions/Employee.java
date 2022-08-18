package generalCodingQuestions;

public class Employee {

	private long id;
	private long deptId;
	private double salary;

	public Employee(long id, long deptId, double salary) {
		super();
		this.id = id;
		this.deptId = deptId;
		this.salary = salary;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getDeptId() {
		return deptId;
	}

	public void setDeptId(long deptId) {
		this.deptId = deptId;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}
