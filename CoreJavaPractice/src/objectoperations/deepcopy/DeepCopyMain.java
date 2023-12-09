package objectoperations.deepcopy;

public class DeepCopyMain {

	public static void main(String[] args) throws CloneNotSupportedException {

		Address address = new Address("Pune", "MAH", 411027);
		Employee employee = new Employee(11L, "Aditya", address);
		Employee clonedEmployee = (Employee) employee.clone();
		
		System.out.println("hashcode employyeee" + employee.getEmpAddress().hashCode());
		System.out.println("hashcode clonedEmployee" + clonedEmployee.getEmpAddress().hashCode());
		
		clonedEmployee.getEmpAddress().setCity("Banglore");

		System.out.println("employee: " + employee);
		System.out.println("cloned employee: " + clonedEmployee);
	}
}
