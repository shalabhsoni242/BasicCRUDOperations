package com.app.core;

import java.time.LocalDate;
//buddy class
public class Buddy {
private String email;
private String name, phone;
private LocalDate dob;
private String city ;
//buddy class constructor
public Buddy(String email,String name,String phone,LocalDate dob,String city) 
{
this.email=email;
this.name=name;
this.phone=phone;
this.dob=dob;
this.city=city;
}
//getters & setters 
public String getEmail() {
	return this.email;
}
public LocalDate getDob() {
	return dob;
}

public void setDob(LocalDate dob) {
	this.dob = dob;
}

public String getPhone () {
	return this.phone;
}
@Override
public String toString() {
	return "Name=" + name +" ,email=" + email +  ", phone=" + phone + ", dob=" + dob + ", city=" + city ;
}
}
