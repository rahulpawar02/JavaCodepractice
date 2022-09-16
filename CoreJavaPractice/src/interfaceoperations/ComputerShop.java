package interfaceoperations;

class SamsungS7 implements Phone{
	
	public void call() {
		System.out.println("calling..........");
	}
	
	public void sms() {
		System.out.println("sending..........");
	}
	
	//it's own method
	public void sms2() {
		System.out.println("sending sms2........");
	}
}

public class ComputerShop {

	public Phone getPhone() {
		
		Phone phone = new SamsungS7(); // here we create the object of SamsungS7 class and Phone interface reference variable
		return phone;
	}
}
