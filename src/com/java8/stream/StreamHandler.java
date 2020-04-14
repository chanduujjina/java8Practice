package com.java8.stream;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.java8.stream.service.EmpleyeeMockService;

public class StreamHandler {
	public static void main(String[] args) {
		
		List<Employee> employeeList = EmpleyeeMockService.getEmployeeList(); 
		
		//get list of names using stream
		
		List<String> nameList= employeeList.stream().map(Employee :: getName).collect(Collectors.toList());
		System.out.println("nameList::"+nameList);
		
		//Get list of names starts with k from list of employee objects using strems
		
		List<String> filterednameList = employeeList.stream().filter(emp ->emp.getName().startsWith("k")).map(Employee :: getName).collect(Collectors.toList());
		System.out.println("filterednameList::"+filterednameList);
		
		
		//get max salary from list of employee objects
		
		long maxsalry = employeeList.stream().map(Employee :: getSalry).collect(Collectors.toList()).stream().mapToLong(x->x).max().getAsLong();
	   System.out.println("maxsalry::"+maxsalry);
	   
	 //get min salary from list of employee objects
	   
	   long minsalry = employeeList.stream().map(Employee :: getSalry).collect(Collectors.toList()).stream().mapToLong(x->x).min().getAsLong();
	   System.out.println("minsalry::"+minsalry);
		
	   //group by dept
	   Map<String, Long> grupbyDept = employeeList.stream().map(Employee :: getDeptName).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
	   
	   System.out.println("grupbyDept::"+grupbyDept);
	   
		// get employee list from highest salary to lowest salary
		List<String> sortednameList = employeeList.stream()
				.sorted(Comparator.comparingLong(Employee::getSalry).reversed()).map(Employee::getName)
				.collect(Collectors.toList());

		System.out.println("sortednameList::" + sortednameList);

		// get employee list from lowest salary to highest salary
		List<String> sortednameList1 = employeeList.stream().sorted(Comparator.comparingLong(Employee::getSalry))
				.map(Employee::getName).collect(Collectors.toList());
		System.out.println("sortednameList1::" + sortednameList1);
		
	}

}
