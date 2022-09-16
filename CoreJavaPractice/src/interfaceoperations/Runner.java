package interfaceoperations;

public class Runner {

	public static void main(String[] args) {
		
		ComputerShop cshop = new ComputerShop();
		cshop.getPhone(); //we call the method of ComputerShop using object of it. but this method getPhone() return the Object of Phone
		
		//if we store the method return into Interface then we can access the only those method which are in interface
		
		Phone phone = cshop.getPhone();
		phone.call(); 
		phone.sms();
		
		//if we store the method return into implemented class then we can access the interface as well as these class methods 
		//but we need to type cast it.
		SamsungS7 samsung = (SamsungS7) cshop.getPhone(); // this getPhone() return the Phone object but we want to into SamsungS7 then that time we need to typecast it Phone to SamsungS7.
		samsung.call();
		samsung.sms();
		samsung.sms2();
	}
}
