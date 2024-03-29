package objectclassmethods;

public class Employee {
	
	private Long empId;
	private String name;
	private String profile;
	
	//Default constructor
	Employee(){
		
	}
	//parameterized contructor 
	Employee(Long empId, String name, String profile){
		this.empId = empId;
		this.name = name;
		this.profile = profile;
	}

	public Long getEmpId() {
		return empId;
	}

	public void setEmpId(Long empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProfile() {
		return profile;
	}

	public void setProfile(String profile) {
		this.profile = profile;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", profile=" + profile + "]";
	}

}
