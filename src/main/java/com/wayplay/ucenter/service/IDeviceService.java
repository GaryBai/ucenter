package com.wayplay.ucenter.service;

import com.wayplay.ucenter.model.Device;

public interface IDeviceService {

	/**
	 * 判断设备是否激活
	 * 
	 * @param imei
	 * @return
	 */
	public boolean deviceIsActivate(String imei);
	
	/**
	 * 根据imei，imsi查询did
	 * 
	 * @param imei
	 * @return
	 */
	public Device findDeviceByImei(String imei);

	/**
	 * 设备激活
	 * 
	 * @param device
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
	public int updateCoinByDid(Long did, int amount);

}
