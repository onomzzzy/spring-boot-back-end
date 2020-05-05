package io.onome.code.model;

public class Buyer {
private String firstname;
private String lastname;
private String phonenumber;
private String whatsapp;
private String address;

public Buyer() {
}

public String getFirstname() {
	return firstname;
}

public void setFirstname(String firstname) {
	this.firstname = firstname;
}

public String getLastname() {
	return lastname;
}

public void setLastname(String lastname) {
	this.lastname = lastname;
}

public String getPhonenumber() {
	return phonenumber;
}

public void setPhonenumber(String phonenumber) {
	this.phonenumber = phonenumber;
}

public String getWhatsapp() {
	return whatsapp;
}

public void setWhatsapp(String whatsapp) {
	this.whatsapp = whatsapp;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}


}
