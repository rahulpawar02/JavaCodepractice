package java8.default_methods;

public class PaymentMain {

	public static void main(String[] args) {
		
        // Creating instances of both payment processors
		PaymentProcessor creditCard = new CreditCardProcessor();
		creditCard.processPayment(0);
		
		PaymentProcessor paypal = new PayPalProcessor();
		paypal.processPayment(300);
	}
}
