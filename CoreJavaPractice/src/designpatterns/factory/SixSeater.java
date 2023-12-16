package designpatterns.factory;

public class SixSeater implements Car {
	
	@Override
	public void manufacture() {
		System.out.println("Manufacturing a six-seater car.");
	}
}
