package com.wayplay.ucenter.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wayplay.ucenter.dao.UserinfoDao;
import com.wayplay.ucenter.model.Userinfo;
import com.wayplay.ucenter.service.IUserinfoService;

@Service("userinfoService")
public class UserinfoServiceImpl implements IUserinfoService {

	@Resource
	private UserinfoDao userinfoDao;

	@Override
	public Userinfo findUserinfoByUid(Long uid) {
		// TODO Auto-generated method stub
		return userinfoDao.findUserinfoByUid(uid);
	}

	@Override
	public boolean userIsRegister(String openid) {
		// TODO Auto-generated method stub
		int num = userinfoDao.userIsRegister(openid);
		return num > 0 ? true : false;
	}

	@Override
	public int register(Userinfo userinfo) {
		// TODO Auto-generated method stub
		return userinfoDao.register(userinfo);
	}

	@Override
	public int userUpdate(Userinfo userinfo) {
		// TODO Auto-generated method stub
		return userinfoDao.userUpdate(userinfo);
	}

	@Override
	public Userinfo findUserinfoByOpenid(String openid) {
		// TODO Auto-generated method stub
		return userinfoDao.findUserinfoByOpenid(openid);
	}

}
