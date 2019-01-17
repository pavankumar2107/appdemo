package com.uskcorp.app.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uskcorp.app.app.dao.AppDAO;
import com.uskcorp.app.app.model.App;

@Service
public class AppServiceImpl implements AppService {
	@Autowired
	AppDAO appDao;

	@Override
	public List<App> getAppInfo() {
		return appDao.getAppInfo();
	}

}
