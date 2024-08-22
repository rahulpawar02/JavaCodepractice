package java8.default_methods;

public class CreditCardProcessor implements PaymentProcessor {

	@Override
	public void processPayment(double amount) {
		
		System.out.println("Processing Credit Card payment of $"+ amount);
	}
}
