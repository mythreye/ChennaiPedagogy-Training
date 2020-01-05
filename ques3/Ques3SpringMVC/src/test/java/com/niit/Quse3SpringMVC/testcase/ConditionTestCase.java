package com.niit.Quse3SpringMVC.testcase;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.niit.Ques3SpringMVC.Config.DBConfig;
import com.niit.Ques3SpringMVC.DAO.WeatherDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = DBConfig.class)
public class ConditionTestCase {
	@Autowired
	WeatherDAO weatherDAO;

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		assertNotNull(weatherDAO.fethByCondition("Haze"));
	}

}
