package com.wp.DTO;

public class APDTO {
int id,cnt,age;
String name,dr;
public APDTO() {
	super();
	// TODO Auto-generated constructor stub
}
public APDTO(int cnt, int age, String name, String dr,int id) {
	super();
	this.id = id;
	this.cnt = cnt;
	this.age = age;
	this.name = name;
	this.dr = dr;
}
public int getId() {
	return id;
}
public int getCnt() {
	return cnt;
}
public int getAge() {
	return age;
}
public String getName() {
	return name;
}
public String getDr() {
	return dr;
}
}
