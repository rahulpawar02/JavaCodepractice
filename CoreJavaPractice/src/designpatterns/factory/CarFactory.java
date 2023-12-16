package designpatterns.factory;

//this class is responsible for object creation based on condition.
public class CarFactory {

	// Factory method to create Car instances based on type
	//	In Java, a class that implements an interface can be treated as an instance of that interface.(just for myself)
	public Car createCar(String type) {
	  switch (type.toLowerCase()) {
		case "fourseater":
			return new FourSeater();

		case "sixseater":
			return new SixSeater();

		default:
			throw new IllegalArgumentException("Invalid car type: " + type);
		}
	}
}
