package designpatterns.factory_method;

//SixSeater class implementing Car
public class SixSeater implements Car {
	
	@Override
	public void manufacture() {
		System.out.println("Manufacturing a six-seater car.");
	}

}
