package com.wayplay.ucenter.dao;

public interface VersionDao {

	/**
	 * 查询最新版本
	 * 
	 * @param curversion
	 * @return
	 */
	public String findLatestVersion(String curversion);

}
