package week4.day1;

public abstract class CanaraBank implements Payments {
	
	public void cashOnDelivery() 
	{
		System.out.println("CashOnDelivery method created in Payments");
	}
	public void upiPayments() 
	{
		System.out.println("upiPayments method created in Payments");	
	}
	public void cardPayments() 
	{
		System.out.println("cardPayments method created in Payments");
	}
	public void internetBanking() 
	{
		System.out.println("internetBanking method created in Payments");
	}
	public void recordPaymentDetails()
	{
		System.out.println("recordPaymentDetails method created in CanaraBank");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
