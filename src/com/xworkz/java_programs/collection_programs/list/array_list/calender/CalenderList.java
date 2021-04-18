package com.xworkz.java_programs.collection_programs.list.array_list.calender;

import java.util.ArrayList;

public class CalenderList {

	public static void main(String[] args) {
		ArrayList<Calender>ListOfCalender=new ArrayList<Calender>();
		
		Calender calender1= new Calender(2020,01,01);
		Calender calender2= new Calender(2021,01,01);
		Calender calender3= new Calender(2022,01,01);
		Calender calender4= new Calender(2023,01,01);
		
		ListOfCalender.add(calender1);
		ListOfCalender.add(calender2);
		ListOfCalender.add(calender3);
		ListOfCalender.add(calender4);
		
		
		for(Calender cl:ListOfCalender) {
			System.out.println(cl);
		
		}
		

	}

}
