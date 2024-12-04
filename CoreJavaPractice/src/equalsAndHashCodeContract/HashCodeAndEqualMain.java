package equalsAndHashCodeContract;

public class HashCodeAndEqualMain {

	public static void main(String[] args) {
		
		Student student1 = new Student(101, "Alice");
		Student student2 = new Student(101, "Alice");
		Student student3 = new Student(102, "Blob");

		System.out.println(student1.equals(student2)); // true, because they have the same rollNo
		System.out.println(student1.equals(student3)); // false, because they have different rollNo
		
//		The equals() and hashCode() methods consistently compare and calculate values based on the rollNo field
		System.out.println(student1.hashCode()); //101 
		System.out.println(student2.hashCode()); //101
		System.out.println(student3.hashCode()); //102
	}
}
