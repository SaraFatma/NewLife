package com.wp.DTO;

public class RegDTO {
 
String unm,upw;
int id,status;

public RegDTO() {
	super();
	// TODO Auto-generated constructor stub
}

public RegDTO(String unm, String upw, int id, int status) {
	super();
	this.unm = unm;
	this.upw = upw;
	this.id = id;
	this.status = status;
}

public String getUnm() {
	return unm;
}

public String getUpw() {
	return upw;
}

public int getId() {
	return id;
}

public int getStatus() {
	return status;
}

}
 


