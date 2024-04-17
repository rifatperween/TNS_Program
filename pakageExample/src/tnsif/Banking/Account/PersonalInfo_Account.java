package tnsif.Banking.Account;

public class PersonalInfo_Account {

private String acc_name,email,adharno;
private long balance;
public PersonalInfo_Account() {
	
}
public PersonalInfo_Account(String acc_name, String email, String adharno, long balance) {
	super();
	this.acc_name = acc_name;
	this.email = email;
	this.adharno = adharno;
	this.balance = balance;
}
public String getAcc_name() {
	return acc_name;
}
public void setAcc_name(String acc_name) {
	this.acc_name = acc_name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getAdharno() {
	return adharno;
}
public void setAdharno(String adharno) {
	this.adharno = adharno;
}
public long getBalance() {
	return balance;
}
public void setBalance(long balance) {
	this.balance = balance;
}
@Override
public String toString() {
	return "PersonalInfo_Account [acc_name=" + acc_name + ", email=" + email + ", adharno=" + adharno + ", balance="
			+ balance + "]";
}

}
