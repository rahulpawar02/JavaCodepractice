package designpatterns.abstract_factory;

//Concrete SmallCarFactory implementing CarFactory
public class SmallCarFactory implements CarFactory {

	@Override
	public Car createCar() {
		return new SmallCar();
	}

}
