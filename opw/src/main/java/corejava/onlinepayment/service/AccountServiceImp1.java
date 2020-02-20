package corejava.onlinepayment.service;

import corejava.onlinepayment.bean.Account;
import corejava.onlinepayment.dao.AccountDaoImp1;

public class AccountServiceImp1 implements AccountService {
	AccountDaoImp1 adi = new AccountDaoImp1();
	public int getLoginDetails(int userid) 
	{
		System.out.println("one");
	 int a=adi.getLoginDetails(userid);
	  return a;
	}
	public Account getLoginDetails(int userid,String password ) {
		System.out.println("four");
	 Account a=adi.getLoginDetails( userid, password); 
return a;
}
	public int rechargeAccount(int userid1,double amount ) {
		int a=adi.rechargeAccount(userid1,amount);
		return a;
	}
	public double showBalance(int userid2) {
		double a=adi.showBalance(userid2);
		return a;
	}
	public int transferAmount(int userid3,int userid4,double amount1) {
		int a=adi.transferAmount(userid3,userid4,amount1);
		return a;
	}
}
