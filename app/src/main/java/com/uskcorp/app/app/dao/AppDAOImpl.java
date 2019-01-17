package com.uskcorp.app.app.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.uskcorp.app.app.constants.SQLConstants;
import com.uskcorp.app.app.mapper.AppInfoRowMapper;
import com.uskcorp.app.app.model.App;
@Repository("appDAOImpl")
public class AppDAOImpl implements AppDAO {
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public List<App> getAppInfo() {
		List<App> listOfApp = jdbcTemplate.query(SQLConstants.APP_INFO_QUERY, new AppInfoRowMapper());
		return listOfApp;
	}

}
