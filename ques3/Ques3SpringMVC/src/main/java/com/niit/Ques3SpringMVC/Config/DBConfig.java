package com.niit.Ques3SpringMVC.Config;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan("com.niit.Ques3SpringMVC")
@EnableTransactionManagement
public class DBConfig {

	@Bean
	DataSource mydataSource() {
		DriverManagerDataSource dmds = new DriverManagerDataSource();
		dmds.setDriverClassName("com.mysql.jdbc.Driver");
		dmds.setUrl("jdbc:mysql://localhost:3306/userdb");
		dmds.setUsername("root");
		dmds.setPassword("P@ssw0rd@11443");
		return dmds;
	}

	@Bean
	Properties prop() {
		Properties properties = new Properties();
		properties.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL5Dialect");
		properties.setProperty("hibernate.hbm2ddl.auto", "update");
		properties.setProperty("hibernate.show_sql", "true");
		return properties;
	}

	@Autowired
	@Bean
	LocalSessionFactoryBean sessionFactory(DataSource mydataSource, Properties prop) {
		LocalSessionFactoryBean lsfb = new LocalSessionFactoryBean();
		lsfb.setDataSource(mydataSource);
		lsfb.setHibernateProperties(prop);
		lsfb.setPackagesToScan("com.niit.Ques3SpringMVC.Model");
		return lsfb;
	}

	@Autowired
	@Bean
	HibernateTransactionManager mytrans(SessionFactory sessionFactory) {
		HibernateTransactionManager htm = new HibernateTransactionManager();
		htm.setSessionFactory(sessionFactory);
		return htm;

	}

}