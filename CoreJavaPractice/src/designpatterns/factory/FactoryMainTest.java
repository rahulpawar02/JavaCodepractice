package designpatterns.factory;

public class FactoryMainTest {

	public static void main(String[] args) {

		// Create a CarFactory
		CarFactory carFactory = new CarFactory();

		// Create and manufacture a FourSeater car using the factory
		Car fourSeaterCar = carFactory.createCar("fourSeater");
		fourSeaterCar.manufacture(); // Manufacturing method specific to a four-seater car

		// Create and manufacture a SixSeater car using the factory
		Car sixSeaterCar = carFactory.createCar("sixSeater");
		sixSeaterCar.manufacture(); // Manufacturing method specific to a six-seater car

	}
}
