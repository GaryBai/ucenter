package com.wayplay.ucenter.dao;

import java.util.Map;

import com.wayplay.ucenter.model.Device;

public interface DeviceDao {

	/**
	 * 根据imei判断设备是否激活
	 * 
	 * @param imei
	 * @return
	 */
	public int deviceIsActivate(String imei);
	
	/**
	 * 根据imei查询did
	 * 
	 * @param imei
	 * @return
	 */
	public Device findDeviceByImei(String imei);

	/**
	 * 设备激活
	 * 
	 * @param imei
	 * @param imsi
	 * @return
	 */
	public int activate(Device device);

	/**
	 * 设备更新
	 * 
	 * @param device
	 * @return
	 */
	public int deviceUpdate(Device device);
	
	/**
	 * 查询设备当前金币数
	 * 
	 * @param did
	 * @return
	 */
	public Integer findCoinByDid(Long did);
	
	/**
	 * 更新设备当前金币数
	 * 
	 * @param did
	 * @param amount
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	public int updateCoinByDid(Map map);

}
