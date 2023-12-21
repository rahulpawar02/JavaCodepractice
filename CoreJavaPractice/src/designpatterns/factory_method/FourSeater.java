package designpatterns.factory_method;

//FourSeater class implementing Car
public class FourSeater implements Car {
	
	@Override
	public void manufacture() {
		System.out.println("Manufacturing a four-seater car.");
	}
	
}
