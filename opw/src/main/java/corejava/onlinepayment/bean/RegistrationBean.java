package corejava.onlinepayment.bean;

import java.util.Random;

public class RegistrationBean
{
	private String customerName;
	private String contactNumber;
	private String accountNo;
	private int accountID;
	public String getCustomerName() 
	{

		return customerName;
	}
	public void setCustomerName(String customerName) 
	{
		this.customerName = customerName;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public int getAccountID() {
		return accountID;
	}
	public void setAccountID(int accountID) {
		this.accountID = accountID;
	}
	public RegistrationBean( String customerName, String contactNumber,String accountNo,int accountID) {
		super();
		Random r = new Random();
		
		//this.accountID = r.nextInt(9999);
		this.customerName = customerName;
		
		this.contactNumber = contactNumber;
		this.accountNo = accountNo;
		this.accountID = accountID;
	}
	public RegistrationBean() {
		super();
	}
	
	
}
