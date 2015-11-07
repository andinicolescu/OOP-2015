package com.gellert.zoowsome.services.factories;

import com.gellert.zoowsome.models.employees.Caretaker;
import com.gellert.zoowsome.models.employees.Employee;

public class CaretakerFactory extends EmployeeFactory {
	
	private RandomEmployeePropGen rpg = new RandomEmployeePropGen();
	
	@Override
	public Employee getEmployee(String type) throws Exception{
		if (Constants.Employees.Caretaker.equals(type)) 
			return new Caretaker(rpg.getRandomName(), rpg.getRandomId(), rpg.getRandomSalary(), rpg.getRandomWorkingHours());
		else throw new Exception("Invalid employee exception!");
	}
}
