package designpatterns.factory_method;

public class FactoryMethodMainTest {

	public static void main(String[] args) {
		
		// Create a FourSeaterFactory
        CarFactory fourSeaterFactory = new FourSeaterFactory();

        // Create and manufacture a FourSeater car using the factory method
        Car fourSeaterCar = fourSeaterFactory.createCar();
        fourSeaterCar.manufacture(); // Manufacturing method specific to a four-seater car

        // Create a SixSeaterFactory
        CarFactory sixSeaterFactory = new SixSeaterFactory();

        // Create and manufacture a SixSeater car using the factory method
        Car sixSeaterCar = sixSeaterFactory.createCar();
        sixSeaterCar.manufacture(); // Manufacturing method specific to a six-seater car			
	}

}


/* what is difference over the factory pattern? 
 * ans=> In the Factory Method pattern, instead of having a single factory class with a method for creating objects, 
 * you define an interface or an abstract class with a method for creating objects. Concrete subclasses then implement this method to create specific instances.
 */