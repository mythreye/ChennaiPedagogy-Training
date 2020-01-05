package com.niit.Ques3SpringMVC.DAOImpl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.Ques3SpringMVC.DAO.WeatherDAO;
import com.niit.Ques3SpringMVC.Model.Weather;

@Repository
@Transactional
public class WeatherDAOImpl implements WeatherDAO {

	@Autowired
	SessionFactory sf;

	@Override
	public List<Weather> fethByCondition(String Cond) {
		try {
			return sf.getCurrentSession().createQuery("from Weather where conds='" + Cond + "'").list();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public List<Weather> fethByYear(String yyyy) {
		try {
			return sf.getCurrentSession().createQuery("from Weather where year(datetime_utc)='" + yyyy + "'").list();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public List<Weather> fethByMonth(String month) {
		try {
			return sf.getCurrentSession().createQuery("from Weather where month(datetime_utc)='" + month + "'").list();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public List<Weather> fethByDate(String date) {
		try {
			Date date1 = new SimpleDateFormat("yyyyddmm").parse(date);
			String pattern = "yyyy/dd/mm";
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
			String ndate = simpleDateFormat.format(date1);

			return sf.getCurrentSession().createQuery("from Weather where datetime_utc='"+ndate+"'").list();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}
