package java8.functional_programming.custom_functional_interface;

import java.util.ArrayList;
import java.util.List;

public class ECommerceApplication {

	public static void main(String[] args) {

		// Sample List of Products
		List<Product> products = new ArrayList<>();
		products.add(new Product(1L, "Laptop", 1000.00, 1));
		products.add(new Product(2L, "Smartphone", 500.00, 2));
		products.add(new Product(3L, "Headphones", 200.00, 5));

		System.out.println("Original products are:");
		products.forEach(System.out::println);

		// Define various discount strategies
		DiscountStrategy seasonalDiscount = product -> product.getPrice() * 0.9; // 10% off

		DiscountStrategy bulkPurchaseDiscount = product -> {
			if (product.getQuantity() > 3) {
				return product.getPrice() * 0.85; // 15% off for bulk purchases
			} else {
				return product.getPrice();
			}
		};

		DiscountStrategy membershipDiscount = product -> product.getPrice() * 0.95; // 5% off

		// Apply discount in checkout process
		Checkout checkout = new Checkout();
		checkout.applyCheckOutDiscounts(products, seasonalDiscount, bulkPurchaseDiscount); // applied the two discounts

		// Display discounts in the Promotional Banner
		PromotionalBanner banner = new PromotionalBanner();
		banner.displayDiscountedPrice(products.get(0), membershipDiscount);

		// Preview discounts in the Admin Dashboard
		AdminDashboard adminDashboard = new AdminDashboard();
		adminDashboard.previewDiscount(products, seasonalDiscount);

	}

}
