package corejava.onlinepayment.dao;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

import corejava.onlinepayment.bean.Account;

public class AccountDaoImp1 implements AccountDao {
	HashMap transactions = new HashMap<>();
	
	public  Account hashMap(int userid) {
		
		HashMap accountEntry = new HashMap<>();
		accountEntry.put(10131, new Account("Prepaid", "Vaishali", 200));
		accountEntry.put(10132, new Account("postpaid", "rachana", 200));
		int keyToBeChecked;
		
		 keyToBeChecked = userid; 

		

	
		Iterator<Map.Entry<Integer, Account> > 
			iterator = accountEntry.entrySet().iterator(); 

		
		boolean isKeyPresent = false; 

		
		while (iterator.hasNext()) { 

			
			Map.Entry<Integer, Account> 
				entry 
				= iterator.next(); 

			
			if (keyToBeChecked == entry.getKey()) { 

				isKeyPresent = true; 
			} 
		} 
		if(true) {
			Account a=(Account)accountEntry.get(userid);
			return a;
		}
		else 
			return null;

	}


	public int getLoginDetails(int userid) {
		System.out.println("two");
		AccountDaoImp1 adi=new AccountDaoImp1();
		Account a=adi.hashMap(userid);

		
			if(a==null)
		return 0;
			else
				return userid;
	}

	public Account getLoginDetails(int userid, String password) {
		AccountDaoImp1 adi=new AccountDaoImp1();
		Account a=adi.hashMap(userid);
	
		System.out.println("five");
		System.out.println(userid);
		

		System.out.println(a.toString());
		System.out.println(userid+"hello");
		
		System.out.println("six");
		if (a.getPassword().equals(password))
			return a;
		else
			return null;

	}
	public int rechargeAccount(int userid,double amount ) {
		AccountDaoImp1 adi=new AccountDaoImp1();
		Account a=adi.hashMap(userid);
		
		System.out.println("ten");
		System.out.println(a.getAccountBalance());
		double nb=a.getAccountBalance()+amount;
		System.out.println(nb);
		a.setAccountBalance(nb);
	
		transactions.put(userid, nb);
		return (int)nb;
	}
	public double showBalance(int userid2) {
		AccountDaoImp1 adi=new AccountDaoImp1();
		Account a=adi.hashMap(userid2);
	
		double nb=a.getAccountBalance();
				return nb;
	}
	public int transferAmount(int userid3,int userid4,double amount1) {
		
		AccountDaoImp1 adi=new AccountDaoImp1();
		Account a=adi.hashMap(userid3);
		Account b=adi.hashMap(userid4);
		
		double nc=b.getAccountBalance()+amount1;
		double nb=a.getAccountBalance()-amount1;
		System.out.println("eleven");
		a.setAccountBalance(nb);
		b.setAccountBalance(nc);
		System.out.println("twelve");
		transactions.replace(userid3, a);
		transactions.replace(userid4, b);
		return 1;
	}
}
