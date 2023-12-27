package designpatterns.abstract_factory;

public class AbstractFactoryMainTest {

	public static void main(String[] args) {

		// Create a SmallCarFactory
		CarFactory smallCarFactory = new SmallCarFactory();

		// Use the factory to create a small car
		Car smallCar = smallCarFactory.createCar();
		smallCar.manufature();

		// Create a LuxuryCarFactory
		CarFactory luxuryCarFactory = new LuxuryCarFactory();

		// Use the factory to create a luxury car
		Car luxuryCar = luxuryCarFactory.createCar();
		luxuryCar.manufature();

	}
}
