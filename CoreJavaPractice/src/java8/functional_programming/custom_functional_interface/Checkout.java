package java8.functional_programming.custom_functional_interface;

import java.util.List;
import java.util.stream.Collectors;

public class Checkout {

	public void applyCheckOutDiscounts(List<Product> products, DiscountStrategy... strategies) {

		// Apply all discounts sequentially
		List<Product> updatedProducts = products.stream().map(product -> {
			double discountedPrice = product.getPrice(); // Start with the original price
			for (DiscountStrategy strategy : strategies) { // Loop through each discount strategy
				// Apply the discount and update the price
				discountedPrice = strategy.applyDiscount(
						new Product(product.getId(), product.getName(), discountedPrice, product.getQuantity()));
			}
			// Return a new Product with the discounted price
			return new Product(product.getId(), product.getName(), discountedPrice, product.getQuantity());
		}).collect(Collectors.toList());

		// print the updated products
		System.out.println("\nCheckout Product and Discount Prices:");
		updatedProducts.forEach(product -> {
			System.out.println(product.getName() + " - " + product.getPrice());
		});
	}
}
