package lab8;

public class PaymentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Payment p1=new CashPayment();
		 System.out.println("Cash Payment "+p1.payment(20000.0)+ " Taka");
		 
		 Payment p2=new CardPayment();
		 System.out.println("Card Payment "+p2.payment(20000.0)+ " Dollar");


	}

}
