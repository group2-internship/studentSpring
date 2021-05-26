package com.capg.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class NonTechnicalCourses extends Courses{
	@Value("YOGA")
	private String cName;
	@Value("25")
	private int duration;
	public NonTechnicalCourses() {
		super();
		// TODO Auto-generated constructor stub
	}
	public NonTechnicalCourses(String cName, int duration) {
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
		return "NonTechnicalCourses [cName=" + cName + ", duration=" + duration + "]";
	}
	
	
}
