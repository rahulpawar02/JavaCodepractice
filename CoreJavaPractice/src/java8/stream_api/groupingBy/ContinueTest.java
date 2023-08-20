package java8.stream_api.groupingBy;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ContinueTest {

	public static void main(String[] args) {

		List<Employee> employeesDBList = new ArrayList<>();
		employeesDBList.add(new Employee(101, "Glady", "Manager", "Male", 2500000));
		employeesDBList.add(new Employee(102, "Vlad", "Software Engineer", "Female", 1500000));
		employeesDBList.add(new Employee(103, "Shine", "Lead Engineer", "Female", 2000000));

		
		List<Employee> employeesRequestedList = new ArrayList<>();
		employeesRequestedList.add(new Employee(104, "Glady", "Manager", "Female", 4500000));
		employeesRequestedList.add(new Employee(105, "Tony", "PM", "Male", 6000000));

		List<String> designationList = employeesDBList.stream().map(Employee::getDesignation).collect(Collectors.toList());
		
		//create map from db list Designation with Employee object
		
		Map<String, Employee> dbDesignationEmployeeMap = employeesDBList.stream().collect(Collectors.toMap(Employee::getDesignation, emp -> emp));
		
		
		// same Designation and gender category don't same, if gender is change then delete existing entry and save new entry into db.
		
		//here Manager Designation is already 
		for(Employee emp :employeesRequestedList) {
			
			if(designationList.contains(emp.getDesignation())) {
				Employee dbEmp = dbDesignationEmployeeMap.get(emp.getDesignation());
				
				//after check gender is same or not
				if(!emp.getGender().equals(dbEmp.getGender())) {
					employeesDBList.remove(dbEmp);				
				}else {
					continue;
				}
				
			}
			
			employeesDBList.add(emp);
			
		}
	
 }
}