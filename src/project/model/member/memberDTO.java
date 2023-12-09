package project.model.member;

import java.sql.Date;

public class memberDTO {
    private String user_id;			//PK
    private String user_name;
    private String user_password;
    private String user_phone;
    private String user_birthdate;
    private Date regi_date;			//등록일자
    private int admin_grade;		//일반유저 = 0, 관리자 = 1
    
//--------------------------------------------------------------------------//
    
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_password() {
		return user_password;
	}
	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}
	public String getUser_phone() {
		return user_phone;
	}
	public void setUser_phone(String user_phone) {
		this.user_phone = user_phone;
	}
	public String getUser_birthdate() {
		return user_birthdate;
	}
	public void setUser_birthdate(String user_birthdate) {
		this.user_birthdate = user_birthdate;
	}
	public Date getRegi_date() {
		return regi_date;
	}
	public void setRegi_date(Date regi_date) {
		this.regi_date = regi_date;
	}
	public int getAdmin_grade() {
		return admin_grade;
	}
	public void setAdmin_grade(int admin_grade) {
		this.admin_grade = admin_grade;
	}

//--------------------------------------------------------------------------//
    
}
