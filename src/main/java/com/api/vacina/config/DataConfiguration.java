package com.api.vacina.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

@Configuration
public class DataConfiguration {

	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource data = new DriverManagerDataSource();
		data.setUrl("jdbc:mysql://localhost:3306/vacina");
		data.setUsername("root");
		data.setPassword("1234");
		return data;
	}
	
	public JpaVendorAdapter jpa() {
		HibernateJpaVendorAdapter hibernate = new HibernateJpaVendorAdapter();
		hibernate.setDatabase(Database.MYSQL);
		hibernate.setPrepareConnection(true);
		hibernate.setDatabasePlatform("org.hibernate.dialect.MySQLDialect");
		hibernate.setGenerateDdl(true);
		hibernate.setShowSql(true);
		return hibernate;
	}
}
