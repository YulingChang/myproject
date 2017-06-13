package oo.test;

public class PhoneMember extends Member{
	public PhoneMember(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	String phone;
	boolean verified = false;
	public String getPhone(){
		return phone;
	}
	public void setPhone(String phone){
		this.phone = phone;
	}
	public boolean isVerified(){
		return verified;
	}
	public void setVerified(boolean verified){
		this.verified = verified;
	}

}
