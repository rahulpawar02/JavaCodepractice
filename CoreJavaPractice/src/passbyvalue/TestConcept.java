package passbyvalue;

//Java only have pass by value we can not use pass by reference
public class TestConcept {

	public static void m1(int a) {
		System.out.println("value of a:"+ a);
	}
	public static void main(String[] args) {
		
		m1(5); // this is pass by value we pass the value to the method m1. so this is pass by value.
		
		
	}

}
