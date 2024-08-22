package java8.default_methods;

public interface PaymentProcessor {

	void processPayment(double amount);

	//Default method for validation payment
	default boolean validatePayment(double amount) {
		return amount > 0; // amount must be positive
	}
}
