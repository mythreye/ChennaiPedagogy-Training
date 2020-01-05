package com.niit.Ques3SpringMVC.Model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
public class Weather {

	@Id
	int id;
	@Temporal(TemporalType.DATE)
	Date datetime_utc;
	String conds;
	String dewptm;
	String fog;
	String hail;
	String hum;
	String pressurem;
	String rain;
	String snow;
	String tempm;
	String thunder;
	String tornado;
	String wdire;
	String city;
	public Date getDatetime_utc() {
		return datetime_utc;
	}
	public void setDatetime_utc(Date datetime_utc) {
		this.datetime_utc = datetime_utc;
	}
	public String getConds() {
		return conds;
	}
	public void setConds(String conds) {
		this.conds = conds;
	}
	public String getDewptm() {
		return dewptm;
	}
	public void setDewptm(String dewptm) {
		this.dewptm = dewptm;
	}
	public String getFog() {
		return fog;
	}
	public void setFog(String fog) {
		this.fog = fog;
	}
	public String getHail() {
		return hail;
	}
	public void setHail(String hail) {
		this.hail = hail;
	}
	public String getHum() {
		return hum;
	}
	public void setHum(String hum) {
		this.hum = hum;
	}
	public String getPressurem() {
		return pressurem;
	}
	public void setPressurem(String pressurem) {
		this.pressurem = pressurem;
	}
	public String getRain() {
		return rain;
	}
	public void setRain(String rain) {
		this.rain = rain;
	}
	public String getSnow() {
		return snow;
	}
	public void setSnow(String snow) {
		this.snow = snow;
	}
	public String getTempm() {
		return tempm;
	}
	public void setTempm(String tempm) {
		this.tempm = tempm;
	}
	public String getThunder() {
		return thunder;
	}
	public void setThunder(String thunder) {
		this.thunder = thunder;
	}
	public String getTornado() {
		return tornado;
	}
	public void setTornado(String tornado) {
		this.tornado = tornado;
	}
	public String getWdire() {
		return wdire;
	}
	public void setWdire(String wdire) {
		this.wdire = wdire;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	


}
