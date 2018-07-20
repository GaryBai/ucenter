package com.wayplay.ucenter.model;

import java.io.Serializable;
import java.util.Date;

public class Userinfo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5029305912490098196L;

	private Long uid;

	private String openid;

	private String username;

	private String iconurl;

	private Date registertime;

	private Date latesttime;

	private Long initdid;

	private Long curdid;

	private int status;

	private String phone;

	private String birthday;

	private String gender;

	public Long getUid() {
		return uid;
	}

	public void setUid(Long uid) {
		this.uid = uid;
	}

	public String getOpenid() {
		return openid;
	}

	public void setOpenid(String openid) {
		this.openid = openid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getIconurl() {
		return iconurl;
	}

	public void setIconurl(String iconurl) {
		this.iconurl = iconurl;
	}

	public Date getRegistertime() {
		return registertime;
	}

	public void setRegistertime(Date registertime) {
		this.registertime = registertime;
	}

	public Date getLatesttime() {
		return latesttime;
	}

	public void setLatesttime(Date latesttime) {
		this.latesttime = latesttime;
	}

	public Long getInitdid() {
		return initdid;
	}

	public void setInitdid(Long initdid) {
		this.initdid = initdid;
	}

	public Long getCurdid() {
		return curdid;
	}

	public void setCurdid(Long curdid) {
		this.curdid = curdid;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "User [uid=" + uid + ", openid=" + openid + ", username=" + username + ", iconurl=" + iconurl
				+ ", registertime=" + registertime + ", latesttime=" + latesttime + ", initdid=" + initdid + ", curdid="
				+ curdid + ", status=" + status + ", phone=" + phone + ", birthday=" + birthday + ", gender=" + gender
				+ "]";
	}

}
