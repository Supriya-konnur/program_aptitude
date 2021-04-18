package com.xworkz.java_programs.collection_programs.list.array_list.calender;

public class Calender {

	int year;
	int month;
	int day;
	
	public Calender(int year,int month, int day) {
		this.year=year;
		this.month=month;
		this.day=day;
	

	}

	@Override
	public String toString() {
		return "Calender [year=" + year + ", month=" + month + ", day=" + day + "]";
	}

}
