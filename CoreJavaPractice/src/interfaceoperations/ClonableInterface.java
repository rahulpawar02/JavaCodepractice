package interfaceoperations;
import java.lang.Cloneable;

class Address implements Cloneable{
	
	int pinCode;
	String streetName;
	
	public Address(int pinCode, String streetName) {
		this.pinCode = pinCode;
		this.streetName = streetName;
	}
	
    @Override
    protected Object clone() 
        throws CloneNotSupportedException 
    { 
        return super.clone(); 
    } 
	
}

public class ClonableInterface {

	public static void main(String[] args) throws CloneNotSupportedException {
		Address orgAddrObj = new Address(121, "time square");
		Address cloneAddrObj = (Address)orgAddrObj.clone();
		
		System.out.println(cloneAddrObj.pinCode +" "+ cloneAddrObj.streetName);

	}

}
