package com.demo.model;

public class MyUSer {
	private int uid;
	private String uname;
	private Address a1;
	//private Course c;
	//private Skill s;
	public MyUSer() {
		super();
	}
	public MyUSer(int uid, String uname, Address a1) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.a1 = a1;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public Address getAddr() {
		return a1;
	}
	public void setAddr(Address addr) {
		this.a1 = addr;
	}
	@Override
	public String toString() {
		return "MyUSer [uid=" + uid + ", uname=" + uname + ", addr=" + a1 + "]";
	}
	

}