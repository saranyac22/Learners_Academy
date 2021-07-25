package admin.login;

import java.io.Serializable;

public class teacher_login implements Serializable {

	private String teacherid;
	private String teacherfirstname;
	private String teacherlastname;
	private String subjectid;
	private String subjectname;
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
	public String getSubjectid() {
		return subjectid;
	}
	public void setSubjectid(String subjectid) {
		this.subjectid = subjectid;
	}
	public String getSubjectname() {
		return subjectname;
	}
	public void setSubjectname(String subjectname) {
		this.subjectname = subjectname;
	}

	
	
}