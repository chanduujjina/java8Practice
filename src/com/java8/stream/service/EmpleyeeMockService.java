package com.java8.stream.service;

import java.util.ArrayList;
import java.util.List;

import com.java8.stream.Employee;

public class EmpleyeeMockService {
	static List<Employee> list=new ArrayList<Employee>();
	static {
		list.add(new Employee("chandu", 1, 50000, "IT", 1));
		list.add(new Employee("karthik", 4, 50000, "IT", 2));
		list.add(new Employee("suresh", 3, 58000, "IT", 1));
		list.add(new Employee("sateesh", 2, 51000, "IT", 3));
		list.add(new Employee("sai", 5, 30000, "CCD", 2));
		list.add(new Employee("Guru", 6, 30000, "CCD", 2));
	}
	
	public static List<Employee> getEmployeeList(){
		return list;
	}

}
