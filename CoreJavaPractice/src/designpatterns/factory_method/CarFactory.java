package designpatterns.factory_method;

//Abstract CarFactory class with a factory method
abstract class CarFactory {
	// Factory method to create Car instances
	public abstract Car createCar();
}
