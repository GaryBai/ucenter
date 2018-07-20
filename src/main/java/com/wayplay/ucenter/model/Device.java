package com.wayplay.ucenter.model;

import java.io.Serializable;
import java.util.Date;

public class Device implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1460791747765914962L;

	private Long did;

	private String busid;

	private String imei;

	private String imsi;

	private String initversion;

	private String curversion;

	private Date activatetime;

	private Date latesttime;

	private Long drid;

	public Long getDid() {
		return did;
	}

	public void setDid(Long did) {
		this.did = did;
	}

	public String getBusid() {
		return busid;
	}

	public void setBusid(String busid) {
		this.busid = busid;
	}

	public String getImei() {
		return imei;
	}

	public void setImei(String imei) {
		this.imei = imei;
	}

	public String getImsi() {
		return imsi;
	}

	public void setImsi(String imsi) {
		this.imsi = imsi;
	}

	public String getInitversion() {
		return initversion;
	}

	public void setInitversion(String initversion) {
		this.initversion = initversion;
	}

	public String getCurversion() {
		return curversion;
	}

	public void setCurversion(String curversion) {
		this.curversion = curversion;
	}

	public Date getActivatetime() {
		return activatetime;
	}

	public void setActivatetime(Date activatetime) {
		this.activatetime = activatetime;
	}

	public Date getLatesttime() {
		return latesttime;
	}

	public void setLatesttime(Date latesttime) {
		this.latesttime = latesttime;
	}

	public Long getDrid() {
		return drid;
	}

	public void setDrid(Long drid) {
		this.drid = drid;
	}

	@Override
	public String toString() {
		return "Device [did=" + did + ", busid=" + busid + ", imei=" + imei + ", imsi=" + imsi + ", initversion="
				+ initversion + ", curversion=" + curversion + ", activatetime=" + activatetime + ", latesttime="
				+ latesttime + ", drid=" + drid + "]";
	}

}
