package com.wayplay.ucenter.model;

import java.io.Serializable;
import java.util.Date;

public class Version implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5212676587732801860L;

	private Long vsid;

	private String version;

	private String desc;

	private int status;

	private String downloadurl;

	private String size;

	private Date createtime;

	public Long getVsid() {
		return vsid;
	}

	public void setVsid(Long vsid) {
		this.vsid = vsid;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getDownloadurl() {
		return downloadurl;
	}

	public void setDownloadurl(String downloadurl) {
		this.downloadurl = downloadurl;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	@Override
	public String toString() {
		return "Version [vsid=" + vsid + ", version=" + version + ", desc=" + desc + ", status=" + status
				+ ", downloadurl=" + downloadurl + ", size=" + size + ", createtime=" + createtime + "]";
	}

}
