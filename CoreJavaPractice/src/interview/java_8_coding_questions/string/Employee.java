package interview.java_8_coding_questions.string;

import java.math.BigDecimal;

public class Employee {
	
	String name;
	BigDecimal salary;
	
	public Employee(String name, BigDecimal salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}
	

}
