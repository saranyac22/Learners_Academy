package admin.login;

import java.io.Serializable;

public class class_login implements Serializable {

	private String classid;
	private String classname;
	private String teacherid;
	private String teacherfirstname;
	private String teacherlastname;
	public String getClassid() {
		return classid;
	}
	public void setClassid(String classid) {
		this.classid = classid;
	}
	public String getClassname() {
		return classname;
	}
	public void setClassname(String classname) {
		this.classname = classname;
	}
	public String getTeacherid() {
		return teacherid;
	}
	public void setTeacherid(String teacherid) {
		this.teacherid = teacherid;
	}
	public String getTeacherfirstname() {
		return teacherfirstname;
	}
	public void setTeacherfirstname(String teacherfirstname) {
		this.teacherfirstname = teacherfirstname;
	}
	public String getTeacherlastname() {
		return teacherlastname;
	}
	public void setTeacherlastname(String teacherlastname) {
		this.teacherlastname = teacherlastname;
	}
	
	
	
}