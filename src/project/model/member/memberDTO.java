package project.model.member;

import java.sql.Date;

public class memberDTO {
	private String user_id;			//PK
    private String user_name;
    private String user_passwd;
    private String user_phone;
    private String user_addr;
    private Date user_birth;			//등록일자
    private int admingrade;		//일반유저 = 0, 관리자 = 1
    
//---------------------------------------------------------
    
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
	public String getUser_passwd() {
		return user_passwd;
	}
	public void setUser_passwd(String user_passwd) {
		this.user_passwd = user_passwd;
	}
	public String getUser_phone() {
		return user_phone;
	}
	public void setUser_phone(String user_phone) {
		this.user_phone = user_phone;
	}
	public String getUser_addr() {
		return user_addr;
	}
	public void setUser_addr(String user_addr) {
		this.user_addr = user_addr;
	}
	public Date getUser_birth() {
		return user_birth;
	}
	public void setUser_birth(Date user_birth) {
		this.user_birth = user_birth;
	}
	public int getAdmingrade() {
		return admingrade;
	}
	public void setAdmingrade(int admingrade) {
		this.admingrade = admingrade;
	}
	
//---------------------------------------------------------
    
}
