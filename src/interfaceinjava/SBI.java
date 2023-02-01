package interfaceinjava;

public class SBI implements ReserveBank{

	public static void main(String[] args) {
		reserveBank.staticMethodFromInterface();
		
	}
	

	@Override
	public void savingAccountCharges() {

		System.out.println("SBI bank charges 1000 for saving account");
	}

	@Override
	public void currentAccountCharges() {

		System.out.println("SBI bank charges 10000 for current account");
	}

	public void janDhanAccount() {
		System.out.println("SBI charges zero for Jan Dhan Account");
	}

	@Override
	public void UPITransaction() {

		System.out.println("SBI Charges 0.01% for UPI transaction");

	}

	@Override
	public int m() {
		
		return 0;
	}

	@Override
	public void currancyExchangeRate() {

    System.out.println("Currency exchange rate of SBI is 1%");
		
	}

}
