package Encapsulation;

public class Creditcard {

	int CardNo;
	String BankName;
	public Creditcard(int cardNo, String bankName) {
		CardNo = cardNo;
		BankName = bankName;
	}
	public int getCardNo() {
		return CardNo;
	}
	public void setCardNo(int cardNo) {
		CardNo = cardNo;
	}
	public String getBankName() {
		return BankName;
	}
	public void setBankName(String bankName) {
		BankName = bankName;
	}
	
public static void main(String[] args) {
		
		Creditcard creditcard = new Creditcard(123, "BOB");
		
		System.out.println("Your card no. : "+ creditcard.getCardNo());
		System.out.println("Your Bankname : "+ creditcard.getBankName());
		
		creditcard.setBankName("Axis Bank");
		creditcard.setCardNo(888585);
		System.out.println("Your Bankname(updated) : "+ creditcard.getBankName());
		System.out.println("Your card no. : "+ creditcard.getCardNo());
	}
}
