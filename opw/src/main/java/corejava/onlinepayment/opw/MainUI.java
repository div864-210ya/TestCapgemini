package corejava.onlinepayment.opw;

import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import corejava.onlinepayment.bean.Account;
import corejava.onlinepayment.dao.AccountDaoImp1;
import corejava.onlinepayment.exception.WalletNoException;
import corejava.onlinepayment.service.AccountServiceImp1;
import corejava.onlinepayment.service.ValidationforRegistration;

public class MainUI {
	Scanner s = new Scanner(System.in);

	public int loginDetails() {

		System.out.print("Enter Userid:");
		int userid = s.nextInt();
		AccountServiceImp1 asi = new AccountServiceImp1();

		int a = (asi.getLoginDetails(userid));
		return a;
	}

	public Account passwordDetails(int a) {

		System.out.print("Enter password:");
		String password = s.next();

		AccountServiceImp1 asi = new AccountServiceImp1();
		Account a1 = asi.getLoginDetails(a, password);
		return a1;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		AccountDaoImp1 adi = new AccountDaoImp1();
		AccountServiceImp1 asi = new AccountServiceImp1();
		while (true) {

			System.out.println(" 2.add amount\n 3.show balance\n 4.transfer\n 5.exit ");
			System.out.print("Enter Your Chioce : ");
			int choice = s.nextInt();
			switch (choice) {

			case 2:
				MainUI ui = new MainUI();
				int a = ui.loginDetails();
				try {
					if (a == 0) {
						throw new WalletNoException("Invalid Number");
					}

				}

				catch (WalletNoException e) {
					System.out.println("ERROR: user not found");
					break;
				}
				Account a1 = ui.passwordDetails(a);
				try {
					if (a1 == null)
						throw new WalletNoException("Invalid password");
					else {
						System.out.println("logged in succesfully");
					}
				}

				catch (WalletNoException e) {
					System.out.println("ERROR: password incorrect");
					break;
				}

				System.out.println("add amount");
				double amount = s.nextDouble();
				int i = asi.rechargeAccount(a, amount);
				System.out.println("Your Account Recharged Successfully");
				break;
			case 3:

				System.out.println("\nEnter user : ");

				int userid2 = s.nextInt();

				double a2 = asi.showBalance(userid2);
				System.out.println("Balance in Your Wallet : " + a2);
				break;
			case 4:
				System.out.println("\nEnter your userid:");
				System.out.println("\nEnter another userid");
				System.out.println("amount to be transfered");

				int userid3 = s.nextInt();
				int userid4 = s.nextInt();
				double amount1 = s.nextInt();
				int k = asi.transferAmount(userid3, userid4, amount1);
				if (k == 1)
					System.out.println("transfered successfully ");
				break;
			case 5:
				System.exit(0);
			}
		}
	}
}
