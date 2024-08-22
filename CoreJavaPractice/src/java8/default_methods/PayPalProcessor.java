package java8.default_methods;

public class PayPalProcessor implements PaymentProcessor{

	@Override
	public void processPayment(double amount) {
		
		if(validatePayment(amount)) {
			System.out.println("Processing Paypal payment of $"+ amount);
		} else {
            System.out.println("Invalid payment amount for paypal.");
		}	}
}
