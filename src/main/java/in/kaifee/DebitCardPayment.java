package in.kaifee;

public class DebitCardPayment implements IPayment{
	@Override
	public boolean processPayment(double billAmt) {
		// logic
		System.out.println("Debit card payment proccessed....");
		return true;
	}
	public DebitCardPayment()
	{
		System.out.println("debit card default constructor");
	}

}
