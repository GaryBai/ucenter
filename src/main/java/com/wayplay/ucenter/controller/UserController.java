package com.wayplay.ucenter.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wayplay.ucenter.model.Userinfo;
import com.wayplay.ucenter.service.impl.UserinfoServiceImpl;

@RestController
public class UserController {

	@Resource
	private UserinfoServiceImpl userinfoService;

	@RequestMapping("/test")
	public Userinfo test() {
		Userinfo userinfo = userinfoService.findUserinfoByUid((long) 1001);
		return userinfo;
	}

	@RequestMapping("/test1")
	public String test1() {
		return "success hahaha ";
	}

	/**
	 * 用户注册
	 * 
	 * @param userinfo
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public Map<String, String> userRegister(@RequestBody(required = true) Userinfo userinfo) throws Exception {

		System.out.println("register");
		Map<String, String> map = new HashMap<String, String>();
		Userinfo returnUserinfo = new Userinfo();

		if (userinfo != null) {
			// 判断该openid是否注册
			boolean userIsRegister = userinfoService.userIsRegister(userinfo.getOpenid());
			String isRegister = userIsRegister == true ? "1" : "0";
			map.put("isregister", isRegister);

			if (userIsRegister) { // 已注册
				System.out.println("已注册");
				// 更新用户最后登录时间和当前设备id
				userinfoService.userUpdate(userinfo);
				returnUserinfo = userinfoService.findUserinfoByOpenid(userinfo.getOpenid());
				map.put("uid", returnUserinfo.getUid().toString());
				map.put("registertime", returnUserinfo.getRegistertime().toString());
				map.put("latesttime", returnUserinfo.getLatesttime().toString());
			} else { // 还未注册
				int num = userinfoService.register(userinfo);
				if (num == 0) {
					System.out.println("注册失败");
					map.put("uid", "-1");
				} else {
					System.out.println("注册成功");
					returnUserinfo = userinfoService.findUserinfoByOpenid(userinfo.getOpenid());
					map.put("uid", returnUserinfo.getUid().toString());
					map.put("registertime", returnUserinfo.getRegistertime().toString());
					map.put("latesttime", returnUserinfo.getLatesttime().toString());
				}
			}
		}
		return map;
	}

}
