package designpatterns.factory;

public class FourSeater implements Car {

	@Override
	public void manufacture() {
		System.out.println("Manufacturing a four-seater car.");
	}
}
