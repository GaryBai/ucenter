package com.wayplay.ucenter.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wayplay.ucenter.dao.VersionDao;
import com.wayplay.ucenter.service.IVersionService;

@Service("versionService")
public class VersionServiceImpl implements IVersionService {

	@Resource
	private VersionDao versionDao;
	
	@Override
	public String findLatestVersion(String curversion) {
		// TODO Auto-generated method stub
		return versionDao.findLatestVersion(curversion);
	}

}
