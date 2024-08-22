package java8.default_methods;

public class CreditCardProcessor implements PaymentProcessor {

	@Override
	public void processPayment(double amount) {
		if(validatePayment(amount)) {
			System.out.println("Processing Credit Card payment of $"+ amount);
		} else {
            System.out.println("Invalid payment amount for credit card.");
		}
	}
}
