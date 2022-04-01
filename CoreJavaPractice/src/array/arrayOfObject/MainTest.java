package array.arrayOfObject;

import java.util.Arrays;

public class MainTest {

	public static void main(String[] args) {
		
		//array of employee object
		Employee empArr[] = { new Employee(1,"adi","pune"), new Employee(2,"jay","karjat")};
		
		System.out.println(Arrays.toString(empArr));
	}

}
