package com.xworkz.java_programs.map.hashMap.mobileAndSpecification;

import java.util.ArrayList;
//import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//import com.xworkz.java_programs.hashMap.companyAndEmployee.Company;
//import com.xworkz.java_programs.hashMap.companyAndEmployee.Employee;

public class MobileSpecificationDemo {

	public static void main(String[] args) {
		Mobile oneplus = new Mobile("Oneplus");
		Mobile samsungGalaxy = new Mobile("Samsung Galaxy");
		Mobile oppoF11 = new Mobile("OppoF11");
		Mobile pocoM2Pro = new Mobile("POCO M2 Pro");
		Mobile realme6 = new Mobile("Realme6");
		
		Specification sp1 = new Specification("8GB","128GB",8000,44000.00 );
		Specification sp2 = new Specification("4GB","64GB",5000,16000.00 );
		Specification sp3 = new Specification("4GB","64GB",4230,10000.00 );
		Specification sp4 = new Specification("6GB","64GB",5000,13999.00 );
		Specification sp5 = new Specification("8GB","128GB",5000,17000.00 );
		
		List<Specification> specificaton1List = new ArrayList<Specification>();
		specificaton1List.add(sp1);
		List<Specification> specificaton2List = new ArrayList<Specification>();
		specificaton2List.add(sp2);
		List<Specification> specificaton3List = new ArrayList<Specification>();
		specificaton3List.add(sp3);
		List<Specification> specificaton4List = new ArrayList<Specification>();
		specificaton4List.add(sp4);
		List<Specification> specificaton5List = new ArrayList<Specification>();
		specificaton5List.add(sp5);
		
		HashMap<Mobile, List<Specification>> mapOfMobileSpecification =new HashMap<Mobile,  List<Specification>>();
		mapOfMobileSpecification.put(oneplus, specificaton1List);
		mapOfMobileSpecification.put(samsungGalaxy, specificaton2List);
		mapOfMobileSpecification.put(oppoF11, specificaton3List);
		mapOfMobileSpecification.put(pocoM2Pro, specificaton4List);
		mapOfMobileSpecification.put(realme6, specificaton5List);
		
		System.out.println("Below is the specipication of oneplus mobile");
		
		 for(Map.Entry<Mobile, List<Specification>> entry:mapOfMobileSpecification.entrySet()) {
			 Mobile mobile = entry.getKey();
		    	
		    	if(mobile.name.equals("Oneplus")) {
		    		for(Specification specification: entry.getValue()) {
		    			System.out.println("1.RAM: "+specification.RAM);
		    			System.out.println("2.Storage: "+specification.storage);
		    			System.out.println("3.BatteryCapacity: "+specification.batteryCapacity+"mAh");
		    			System.out.println("4.price: "+specification.price);
		    			
		    		}
		    	}

	}

	}
}
