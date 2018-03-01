package p1;

import java.io.Serializable;

public class Registration implements Serializable
{
	String name;
	String email;
	String addr;
	String phno;
	String gen;
	String pass;
	public Registration(String name, String email, String addr, String phno,
			String gen, String pass) {
		super();
		this.name = name;
		this.email = email;
		this.addr = addr;
		this.phno = phno;
		this.gen = gen;
		this.pass = pass;
	}
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
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getPhno() {
		return phno;
	}
	public void setPhno(String phno) {
		this.phno = phno;
	}
	public String getGen() {
		return gen;
	}
	public void setGen(String gen) {
		this.gen = gen;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	

}
