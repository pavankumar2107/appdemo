package com.uskcorp.app.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uskcorp.app.app.constants.RESTURIConstants;
import com.uskcorp.app.app.model.App;
import com.uskcorp.app.app.service.AppService;

@RestController
public class AppController {
	@Autowired
	AppService appService;

	@GetMapping(value = RESTURIConstants.GET_APP_INFO)
	public List<App> getAppInfo() {
		return appService.getAppInfo();
	}

}
