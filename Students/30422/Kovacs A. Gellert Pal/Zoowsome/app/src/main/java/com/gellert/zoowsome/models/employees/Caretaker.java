package com.gellert.zoowsome.models.employees;

import java.math.BigDecimal;

import org.w3c.dom.Element;

import com.gellert.zoowsome.models.animals.Animal;
import com.gellert.zoowsome.models.interfaces.Caretaker_I;
import com.gellert.zoowsome.services.factories.Constants;

public class Caretaker extends Employee implements Caretaker_I {

	private double workingHours;

	public Caretaker() {
		super();
	}

	public Caretaker(String name, long id, BigDecimal salary, double workingHours) {
		super(name, id, salary);
		this.workingHours = workingHours;
	}
	
	public void decodeFromXml(Element element) {
		super.decodeFromXml(element);
		setWorkingHours(Double.valueOf(element.getElementsByTagName("workingHours").item(0).getTextContent()));
	}

	public double getWorkingHours() {
		return workingHours;
	}

	public void setWorkingHours(double workingHours) {
		this.workingHours = workingHours;
	}

	@Override
	public String takeCareOf(Animal animal) {
		if (animal.kill()) {
			return Constants.Employees.Caretakers.TCO_KILLED;
		}
		if (this.workingHours < animal.getMaintenanceCost()) {
			return Constants.Employees.Caretakers.TCO_NO_TIME;
		}
		animal.setTakenCareOf(true);
		this.workingHours = this.workingHours - animal.getMaintenanceCost();
		return Constants.Employees.Caretakers.TCO_SUCCESS;
	}

}
