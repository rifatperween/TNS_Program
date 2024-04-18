package inheritance;

public class Citizen {
  private String name,email,adharno;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
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


public String toString1() {
	return "Citizen [name=" + name + ", email=" + email + ", adharno=" + adharno + "]";
}
  
}
