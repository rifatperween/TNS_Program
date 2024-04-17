package tnsif.Banking.withdraw;

import tnsif.Banking.Account.PersonalInfo_Account;

public class DemoWithdraw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Withdraw_account Wa=new Withdraw_account();
    PersonalInfo_Account pa=new PersonalInfo_Account();
    pa.setAcc_name("Rifat");
    pa.setAdharno("0123");
    pa.setBalance(200);
    pa.setEmail("Rifat@gmail");
    System.out.println(pa);
    
    Wa.doWithdraw(pa,50);
    System.out.println(pa);
    
	}

}
