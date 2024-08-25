package java8.functional_programming.custom_functional_interface;

import java.util.List;

public class AdminDashboard {

	public void previewDiscount(List<Product> products, DiscountStrategy strategy) {
	
		System.out.println("\nDashBoard Preview Product and Discount Prices:");
		products.forEach( product -> {
			double discountedPrice = strategy.applyDiscount(product);
			System.out.println(product.getName() + " - Original: $" + product.getPrice()
			+ ", Discounted: $" + discountedPrice);	
		});
	
	/*	//used to returned into new List for further operations
		System.out.println("DashBoard Preview Product and Discount Prices:");
		List<Product> updatedProducts = products.stream().map(product -> {
			double discountedPrice = strategy.applyDiscount(product);
			System.out.println("Preview: " + product.getName() + " - Original: $" + product.getPrice()
			+ ", Discounted: $" + discountedPrice);
			return new Product(product.getId(), product.getName(), discountedPrice, product.getQuantity());
		}).collect(Collectors.toList());	
		
	 */
	}
}
