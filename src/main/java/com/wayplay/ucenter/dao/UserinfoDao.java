package com.wayplay.ucenter.dao;

import com.wayplay.ucenter.model.Userinfo;

public interface UserinfoDao {

	/**
	 * 根据uid查询用户信息
	 * 
	 * @param uid
	 * @return
	 */
	public Userinfo findUserinfoByUid(Long uid);
	
	/**
	 * 根据openid查询用户信息
	 * 
	 * @param openid
	 * @return
	 */
	public Userinfo findUserinfoByOpenid(String openid);

	/**
	 * 根据openid查询用户是否注册
	 * 
	 * @param openid
	 * @return
	 */
	public int userIsRegister(String openid);

	/**
	 * 用户注册
	 * 
	 * @param userinfo
	 * @return
	 */
	public int register(Userinfo userinfo);

	/**
	 * 更新用户状态
	 * 
	 * @param userinfo
	 * @return
	 */
	public int userUpdate(Userinfo userinfo);

}
