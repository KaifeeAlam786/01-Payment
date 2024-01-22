package in.kaifee;

public class CreditCardPayment implements IPayment{
	@Override
	public boolean processPayment(double billAmt) {
		// logic
		System.out.println("Credit card payment proccessed.....");
		return true;
	}
	public CreditCardPayment() {
		System.out.println("credit card default constructor");
	}

}
