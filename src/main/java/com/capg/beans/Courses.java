package com.capg.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public abstract class Courses {
	@Value("1")
	private int cId;
	@Value("Java")
	private String cName;
	@Value("10")
	private int duration;
	public Courses() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
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
		return "Courses [cId=" + cId + ", cName=" + cName + ", duration=" + duration + "]";
	}
	
	
}
