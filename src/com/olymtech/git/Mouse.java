package com.olymtech.git;

import java.util.Calendar;
import java.util.Date;

public class Mouse {
	private String type;
	private String color;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public static Date add(Date inputDate, int interval, int calendarUnit) {
        if (inputDate == null) {
            return null;
        }
        Calendar cal = Calendar.getInstance();
        cal.setTime(inputDate);
        cal.add(calendarUnit, interval);
        return cal.getTime();
    }
	
}
