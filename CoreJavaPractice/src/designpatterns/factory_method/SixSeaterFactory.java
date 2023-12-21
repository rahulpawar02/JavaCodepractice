package designpatterns.factory_method;

//Concrete SixSeaterFactory class extending CarFactory
public class SixSeaterFactory extends CarFactory {

    // Implementation of the factory method to create a SixSeater
	@Override
	public Car createCar() {
		return new SixSeater();
	}
}
