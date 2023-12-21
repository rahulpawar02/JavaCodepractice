package designpatterns.factory_method;

//Concrete FourSeaterFactory class extending CarFactory
public class FourSeaterFactory extends CarFactory {

	// Implementation of the factory method to create a FourSeater
	@Override
	public Car createCar() {
		return new FourSeater();
	}
}
