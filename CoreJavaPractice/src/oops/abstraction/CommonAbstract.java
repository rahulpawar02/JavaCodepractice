package oops.abstraction;

abstract class Vehicle{
	int a;  //question1 - how to initialize this instance variable? because we can't create abstract class obj.
	
	//contructor of abstract class
	public Vehicle(int a) {
		this.a = a;
	}
	
	abstract void color();
	
	void companyName() { //question1 - we can not create the object of abstract class then how we call non-abstract method?
		System.out.println("non-abstract method of Vehicle abstract class");
	}	
}

class BMW extends Vehicle{  //note: suppose we use constructor in abstract class then in child class also need of child construtor.
	
	public BMW(int a) {
		super(a); // Super keyword refers to parent class
	}
	
	@Override
	void color() {
		System.out.println("implmentation of abstract method..");
	}

}

public class CommonAbstract {

	public static void main(String[] args) {
		BMW bmwObj = new BMW(6);
		bmwObj.color();
		bmwObj.companyName(); //ans of above question-2 is we can call this method using child class object.
		System.out.println(bmwObj.a);
	}

}
