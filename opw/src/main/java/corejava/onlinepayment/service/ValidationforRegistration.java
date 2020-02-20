package corejava.onlinepayment.service;

import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import corejava.onlinepayment.bean.RegistrationBean;
import corejava.onlinepayment.exception.WalletNoException;

public class ValidationforRegistration {

	public static void validateFirstName(String customerName) throws WalletNoException {
		ValidationforRegistration f = new ValidationforRegistration();
		Pattern p = Pattern.compile("[a-zA-Z]+");
		Matcher m = p.matcher(customerName);
		if (!m.matches()) {
			
			throw new WalletNoException("customer Name Should Contain Only Alphabets");
		}
		
	}

	public static void validateContactNo(String contactNumber) throws WalletNoException {
		if (!(contactNumber.length()==10)) {
			throw new WalletNoException("Invalid Mobile Number");
		}
		System.out.println("enter the correct number");
	}

	public static void validateAccountNumber(String accountNo) throws WalletNoException {
		if (!(accountNo.length() == 8)) {

			throw new WalletNoException("Account Number Should be of 8 digits");
		}
	}

	public static void validateAccountID(String accountID) throws WalletNoException {

		if (!(accountID.length() == 5)) {
			throw new WalletNoException("Account ID should be of 5 digits");
		}
	}

}
