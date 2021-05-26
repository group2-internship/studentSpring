package com.capg.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class TechnicalCourses extends Courses{
	@Value("Spring")
	private String cName;
	@Value("15")
	private int duration;
	
	
	public TechnicalCourses() {
		super();
		// TODO Auto-generated constructor stub
	}


	public TechnicalCourses(String cName, int duration) {
		super();
		this.cName = cName;
		this.duration = duration;
	}


	public String getcName() {
		return cName;
	}


	public void setcName(String cName) {
		this.cName = cName;
	}


	public int getDuration() {
		return duration;
	}


	public void setDuration(int duration) {
		this.duration = duration;
	}


	@Override
	public String toString() {
		return "TechnicalCourses [cName=" + cName + ", duration=" + duration + "]";
	}
	
	
}
