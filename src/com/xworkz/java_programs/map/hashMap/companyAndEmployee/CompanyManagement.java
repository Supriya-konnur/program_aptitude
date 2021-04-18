package com.xworkz.java_programs.map.hashMap.companyAndEmployee;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;

public class CompanyManagement {

	public static void main(String[] args) {
		Company tcs = new Company("TCS");
		Company infosys = new Company("Infosys");
		Company google = new Company("Google");
		Company apple = new Company("Apple");
		Company cognizant = new Company("Cognizant");
		
		Employee prathima = new Employee("Prathima");
		Employee nithya = new Employee("Nithya");
		Employee skanda = new Employee("Skanda");
	    Employee supriya = new Employee("Supriya");
	    Employee madhu = new Employee("Madhu");
	    Employee shrinivas = new Employee("Shrinivas");
	    Employee naheeda = new Employee("Naheeda");
	    Employee asha = new Employee("Asha");
	    Employee mamata = new Employee("Mamata");
	    Employee usha = new Employee("Usha");
	    
	    
	    List<Employee> tcsEmployeeList = new ArrayList<Employee>();
	    tcsEmployeeList.add(prathima);
	    tcsEmployeeList.add(nithya);
	    tcsEmployeeList.add(skanda);
	    List<Employee> infosysEmployeeList = new ArrayList<Employee>();
	    infosysEmployeeList.add(supriya);
	    infosysEmployeeList.add(madhu);
	    List<Employee> googleEmployeeList = new ArrayList<Employee>();
	    googleEmployeeList.add(shrinivas);
	    googleEmployeeList.add(naheeda);
	    List<Employee> appleEmployeeList = new ArrayList<Employee>();
	    appleEmployeeList.add(asha);
	    appleEmployeeList.add(mamata);
	    List<Employee> cognizantEmployeeList = new ArrayList<Employee>();
	    cognizantEmployeeList.add(usha);
	    cognizantEmployeeList.add(skanda);
	    
	    HashMap<Company, List<Employee>> mapOfcompanyandEmployee =new HashMap<Company,  List<Employee>>();
	    mapOfcompanyandEmployee.put(tcs, tcsEmployeeList);
	    mapOfcompanyandEmployee.put(infosys, infosysEmployeeList);
	    mapOfcompanyandEmployee.put(google, googleEmployeeList);
	    mapOfcompanyandEmployee.put(apple, appleEmployeeList);
	    mapOfcompanyandEmployee.put(cognizant, cognizantEmployeeList);
	    
	    System.out.println("Below is the list of employees who is working in infosys");
	    
	    for(Map.Entry<Company, List<Employee>> entry:mapOfcompanyandEmployee.entrySet()) {
	    	Company company = entry.getKey();
	    	
	    	if(company.name.equals("Infosys")) {
	    		for(Employee employee: entry.getValue()) {
	    			System.out.println(employee.name);
	    		}
	    	}
	    	
	    }

		

	}

}
