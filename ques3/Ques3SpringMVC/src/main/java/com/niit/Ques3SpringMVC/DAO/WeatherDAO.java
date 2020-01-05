package com.niit.Ques3SpringMVC.DAO;

import java.util.Date;
import java.util.List;

import com.niit.Ques3SpringMVC.Model.Weather;

public interface WeatherDAO {

	List<Weather> fethByCondition(String Cond);
	List<Weather> fethByYear(String yyyy);
	List<Weather> fethByMonth(String month);
	List<Weather> fethByDate(String date);
}
