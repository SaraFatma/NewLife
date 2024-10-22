package com.wp.DTO;

public class LoginDTO {
String unm;
String upw;
int status;
 
public LoginDTO() {
	super();
	// TODO Auto-generated constructor stub
}
public LoginDTO(String unm, String upw, int status) {
	super();
	this.unm = unm;
	this.upw = upw;
	this.status = status;
}
public String getUnm() {
	return unm;
}
public String getUpw() {
	return upw;
}
public int getStatus() {
	return status;
}


}
