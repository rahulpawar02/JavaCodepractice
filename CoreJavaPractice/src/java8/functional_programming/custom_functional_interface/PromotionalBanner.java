package java8.functional_programming.custom_functional_interface;

public class PromotionalBanner {

	public void displayDiscountedPrice(Product product, DiscountStrategy strategy) {

		double discountedPrice = strategy.applyDiscount(product);
		System.out.println("\nPromotional Banner");
		System.out.println("Special offer on " + product.getName() + "! Now only $" + discountedPrice);
	}
}
