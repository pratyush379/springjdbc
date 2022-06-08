package com.cognizant.springjdbc.entity;

public class Student {
	
@Override
	public String toString() {
		return "Student [id=" + id + ", fname=" + fname + ", lname=" + lname + "]";
	}
int id;
String fname;
String lname;
public Student(int id, String fname, String lname) {
	super();
	this.id = id;
	this.fname = fname;
	this.lname = lname;
}
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public String getLname() {
	return lname;
}
public void setLname(String lname) {
	this.lname = lname;
}
}
