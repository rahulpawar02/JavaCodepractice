package equalsAndHashCodeContract;

public class Student {

	private int rollNo;
	private String name;
	
	public Student(int rollNo, String name) {
		this.rollNo = rollNo;
		this.name = name;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}
		if (this == obj) {
			return true;
		}
		Student student = (Student) obj;
		return rollNo == student.rollNo;
	}
	
	@Override
	public int hashCode() {
		return Integer.hashCode(rollNo);
	}
	
}
