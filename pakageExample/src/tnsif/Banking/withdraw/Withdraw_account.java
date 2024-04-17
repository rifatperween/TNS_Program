package tnsif.Banking.withdraw;

import tnsif.Banking.Account.PersonalInfo_Account;

public class Withdraw_account {
 public void doWithdraw(PersonalInfo_Account pa,long amt) {
	 long newBalance = pa.getBalance()-amt;
	 pa.setBalance(newBalance);
 }
}
