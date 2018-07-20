package com.wayplay.ucenter.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wayplay.ucenter.service.impl.VersionServiceImpl;

@RestController
public class VersionController {

	@Resource
	private VersionServiceImpl versionService;

	@RequestMapping(value = "/updateVersion", method = RequestMethod.POST)
	public String updateVersion(@RequestParam String curversion) throws Exception {

		System.out.println("updateVersion");

		return versionService.findLatestVersion(curversion);
	}

}
