package corejava.onlinepayment.service;

import corejava.onlinepayment.bean.Account;

public interface AccountService {
	int getLoginDetails(int  userid);
	Account getLoginDetails(int userid,String password);
	int rechargeAccount(int userid1,double amount );
double showBalance(int userid2);
int transferAmount(int userid3,int userid4,double amount1);
}
