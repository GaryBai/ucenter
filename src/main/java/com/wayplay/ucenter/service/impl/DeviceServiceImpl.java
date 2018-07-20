package com.wayplay.ucenter.service.impl;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wayplay.ucenter.dao.DeviceDao;
import com.wayplay.ucenter.model.Device;
import com.wayplay.ucenter.service.IDeviceService;

@Service("deviceService")
public class DeviceServiceImpl implements IDeviceService {
	
	@Resource
	private DeviceDao deviceDao;

	@Override
	public boolean deviceIsActivate(String imei) {
		// TODO Auto-generated method stub
		int num = deviceDao.deviceIsActivate(imei);
		return num > 0 ? true : false;
	}

	@Override
	public int activate(Device device) {
		// TODO Auto-generated method stub
		return deviceDao.activate(device);
	}

	@Override
	public int deviceUpdate(Device device) {
		// TODO Auto-generated method stub
		return deviceDao.deviceUpdate(device);
	}

	@Override
	public Device findDeviceByImei(String imei) {
		// TODO Auto-generated method stub
		return deviceDao.findDeviceByImei(imei);
	}

	@Override
	public Integer findCoinByDid(Long did) {
		// TODO Auto-generated method stub
		return deviceDao.findCoinByDid(did);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public int updateCoinByDid(Long did, int amount) {
		// TODO Auto-generated method stub
		Map map = new HashMap();
		map.put("did", did);
		map.put("amount", amount);
		return deviceDao.updateCoinByDid(map);
	}

}
