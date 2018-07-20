package com.wayplay.ucenter.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wayplay.ucenter.common.util.date.DateUtil;
import com.wayplay.ucenter.model.Device;
import com.wayplay.ucenter.service.impl.DeviceServiceImpl;

@RestController
public class DeviceController {

	@Resource
	private DeviceServiceImpl deviceService;

	@RequestMapping(value = "/activate", method = RequestMethod.POST)
	public Map<String, String> deviceActivate(@RequestBody(required = true) Device device) throws Exception {

		System.out.println("activate");
		Map<String, String> map = new HashMap<String, String>();
		Device returnDevice = new Device();

		String imei = device.getImei();

		// 通过imei判断该设备是否注册
		boolean deviceIsActivate = deviceService.deviceIsActivate(imei);
		String isActivate = deviceIsActivate == true ? "1" : "0";
		map.put("isactivate", isActivate);
		
		if (deviceIsActivate) { // 已激活
			System.out.println("已激活");
			
			// 更新当前版本和最后登录时间
			deviceService.deviceUpdate(device);
			returnDevice = deviceService.findDeviceByImei(imei);
			map.put("did", returnDevice.getDid().toString());
			
			map.put("activatetime", DateUtil.format(returnDevice.getActivatetime()));
			map.put("latesttime", DateUtil.format(returnDevice.getLatesttime()));
			
		} else { // 还未激活
			// 设备激活
			int num = deviceService.activate(device);
			if (num == 0) {
				System.out.println("激活失败");
				map.put("did", "-1");
			} else {
				System.out.println("激活成功");
				returnDevice = deviceService.findDeviceByImei(imei);
				map.put("did", returnDevice.getDid().toString());
				map.put("activatetime", returnDevice.getActivatetime().toString());
				map.put("latesttime", returnDevice.getLatesttime().toString());
			}
		}

		return map;
	}
	
	@RequestMapping(value = "/findcoinbydid", method = RequestMethod.POST)
	public Integer findCoinByDid(@RequestParam Long did) {
		System.out.println("findcoinbydid");
		return deviceService.findCoinByDid(did);
	}
	
	@RequestMapping(value = "/updatecoinbydid", method = RequestMethod.POST)
	public int updateCoinByDid(@RequestParam Long did, @RequestParam int amount) {
		System.out.println("updatecoinbydid");
		return deviceService.updateCoinByDid(did, amount);
	}

}
