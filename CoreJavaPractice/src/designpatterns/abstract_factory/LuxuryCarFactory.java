package designpatterns.abstract_factory;

//Concrete LuxuryCarFactory implementing CarFactory
public class LuxuryCarFactory implements CarFactory {

	@Override
	public Car createCar() {
		return new LuxuryCar();
	}

}
