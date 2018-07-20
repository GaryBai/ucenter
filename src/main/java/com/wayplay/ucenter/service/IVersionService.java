package com.wayplay.ucenter.service;

public interface IVersionService {
	
	/**
	 * 查询最新版本
	 * 
	 * @param curversion
	 * @return
	 */
	public String findLatestVersion(String curversion);

}
