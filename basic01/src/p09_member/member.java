package p09_member;

import java.util.Date;

public class Member{
	private String userid;
	private String pwd;
	private String email;
	private String name;
	private String phone;
	private Date regdate;
	public Member() {}
	public Member(String userid, String pwd, String email, String name, String phone, Date regdate) {
		this.userid = userid;
		this.pwd = pwd;
		this.email = email;
		this.name = name;
		this.phone = phone;
		this.regdate = regdate;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	@Override
	public String toString() {
		return "Member [userid=" + userid + ", pwd=" + pwd + ", email=" + email + ", name=" + name + ", phone=" + phone
				+ ", regdate=" + regdate + "]";
	}
	
}
