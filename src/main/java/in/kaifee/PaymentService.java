package in.kaifee;

public class PaymentService {
	private IPayment payment;
	public PaymentService(IPayment payment) {
		this.payment=payment;
	}
	
	public void setPayment(IPayment payment) {
		System.out.println("Setter method called");
		this.payment=payment;
		
	}
	public void doPayment(double billAmt) {
		boolean status=payment.processPayment(billAmt);
		if(status) {
			System.out.println("Printing Reciept");
		}else {
			System.out.println("Payment Declined");
		}
	}
	public PaymentService() {
		System.out.println("paymentservice default constructor");
	}

}
