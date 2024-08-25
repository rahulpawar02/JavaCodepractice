package java8.functional_programming.custom_functional_interface;

@FunctionalInterface
public interface DiscountStrategy{
	
	double applyDiscount(Product product); //abstract method
	
}
