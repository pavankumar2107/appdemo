package com.uskcorp.app.app.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;


	@Configuration
	public class DataConfig {
		@Value("${db.driver}")
		private String driverClassName;

		@Value("${db.url}")
		private String url;

		@Value("${db.username}")
		private String username;

		@Value("${db.password}")
		private String password;

		@Bean
		public DataSource dataSource() {
			DriverManagerDataSource dataSource = new DriverManagerDataSource();
			dataSource.setDriverClassName(driverClassName);
			dataSource.setUrl(url);
			dataSource.setUsername(username);
			dataSource.setPassword(password);

			return dataSource;
		}

		@Bean
		public JdbcTemplate jdbcTemplate() {
			return new JdbcTemplate(dataSource());
		}
}
