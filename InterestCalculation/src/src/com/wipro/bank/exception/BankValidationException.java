package src.com.wipro.bank.exception;

@SuppressWarnings("serial")
public class BankValidationException extends Exception{
	
	public BankValidationException(String str) {
		super(str);
	}
	@Override
	public String toString() {
		return "Invalid Data";
	}
}
