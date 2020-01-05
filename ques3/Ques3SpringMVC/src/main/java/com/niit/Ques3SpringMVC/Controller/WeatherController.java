package com.niit.Ques3SpringMVC.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.niit.Ques3SpringMVC.DAO.WeatherDAO;
import com.niit.Ques3SpringMVC.Model.Weather;

@RestController
public class WeatherController {
	@Autowired
	WeatherDAO weatherdao;

	@RequestMapping("weatherbycondition/{condition}")
	ResponseEntity<List<Weather>> getDataByCondition(@PathVariable("condition") String condition) {
		List<Weather> weatherdetail = weatherdao.fethByCondition(condition);
		if (weatherdetail.isEmpty()) {
			return new ResponseEntity<List<Weather>>(weatherdetail, HttpStatus.NOT_ACCEPTABLE);
		} else {
			return new ResponseEntity<List<Weather>>(weatherdetail, HttpStatus.ACCEPTED);
		}
	}

	@RequestMapping("weatherbymonth/{month}")
	ResponseEntity<List<Weather>> getDataByMonth(@PathVariable("month") String month) {
		List<Weather> weatherdetail = weatherdao.fethByMonth(month);
		if (weatherdetail.isEmpty()) {
			return new ResponseEntity<List<Weather>>(weatherdetail, HttpStatus.NOT_ACCEPTABLE);
		} else {
			return new ResponseEntity<List<Weather>>(weatherdetail, HttpStatus.ACCEPTED);
		}
	}

	@RequestMapping("weatherbyyear/{year}")
	ResponseEntity<List<Weather>> getDataByYear(@PathVariable("year") String year) {
		List<Weather> weatherdetail = weatherdao.fethByYear(year);
		if (weatherdetail.isEmpty()) {
			return new ResponseEntity<List<Weather>>(weatherdetail, HttpStatus.NOT_ACCEPTABLE);
		} else {
			return new ResponseEntity<List<Weather>>(weatherdetail, HttpStatus.ACCEPTED);
		}
	}

	@RequestMapping("weatherbydate/{date}")
	ResponseEntity<List<Weather>> getDataByDate(@PathVariable("date") String date) {
		List<Weather> weatherdetail = weatherdao.fethByDate(date);
		if (weatherdetail.isEmpty()) {
			return new ResponseEntity<List<Weather>>(weatherdetail, HttpStatus.NOT_ACCEPTABLE);
		} else {
			return new ResponseEntity<List<Weather>>(weatherdetail, HttpStatus.ACCEPTED);
		}
	}

}
