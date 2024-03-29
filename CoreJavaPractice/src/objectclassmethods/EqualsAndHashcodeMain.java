package objectclassmethods;

public class EqualsAndHashcodeMain {

	public static void main(String[] args) {

		Employee e1 = new Employee(1L, "Rahul", "Software Engineer");
		System.out.println("Employee object e1: " + e1);
		System.out.println("HashCode of the Object e1: " + e1.hashCode());
		
		Employee e2 = e1;
		System.out.println("Employee object e2: " + e2);
		//Both e1 and e2 have same hashcode they are refering the same object.
		
		//object class equals() method.
		System.out.println("HashCode of Object e1: " + e1.hashCode());
		System.out.println("HashCode of Object e2: " + e2.hashCode());
		
		System.out.println("equals method, e1 and e2 both are same :" + e1.equals(e2));
		//equals() method return true because of hashcode are same
		
		Employee e3 = new Employee(2L, "Adi", "DevOps Engineer");
		System.out.println("Employee object e3: " + e3);
		System.out.println("HashCode of Object e3: " + e3.hashCode());
		//here e3 is new object
	
		
		System.out.println("equals method, e1 and e3 both are same :" + e1.equals(e3));
		//equals() method return true because of hashcode are different
		
	}
}
