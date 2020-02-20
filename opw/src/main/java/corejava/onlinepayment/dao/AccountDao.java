package corejava.onlinepayment.dao;

import corejava.onlinepayment.bean.Account;

//package corejava.capg.COREJAVA_DEVP;


public interface AccountDao {
	int getLoginDetails(int userid);
	Account getLoginDetails(int userid,String password);
	int rechargeAccount(int userid1,double amount );
	 double showBalance(int userid2);
	 int transferAmount(int userid3,int userid4,double amount);
}
