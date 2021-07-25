package admin.login;

import java.io.Serializable;

public class student_login implements Serializable {

	private String studentid;
	private String studentfirstname;
	private String studentlastname;
	private String classid;
	private String classname;
	
	
	public String getStudentid() {
		return studentid;
	}
	public void setStudentid(String studentid) {
		this.studentid = studentid;
	}
	public String getStudentfirstname() {
		return studentfirstname;
	}
	public void setStudentfirstname(String studentfirstname) {
		this.studentfirstname = studentfirstname;
	}
	public String getStudentlastname() {
		return studentlastname;
	}
	public void setStudentlastname(String studentlastname) {
		this.studentlastname = studentlastname;
	}
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



	
}