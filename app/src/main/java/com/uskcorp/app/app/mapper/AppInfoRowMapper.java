package com.uskcorp.app.app.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.uskcorp.app.app.model.App;

public class AppInfoRowMapper implements RowMapper<App> {

	@Override
	public App mapRow(ResultSet rs, int rownum) throws SQLException {
		App app = new App();
		app.setId(rs.getInt("id"));
		app.setText(rs.getString("text"));
		return app;
	}

}
