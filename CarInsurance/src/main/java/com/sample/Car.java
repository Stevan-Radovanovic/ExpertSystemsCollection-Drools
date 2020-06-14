package com.sample;

public class Car {

	
	private int motorPower;
	private double insurancePrice;
	private int newPremiumGrade;
	private int oldPremiumGrade;
	private int accidents;
	private double finalPrice;
	public int getMotorPower() {
		return motorPower;
	}
	public double getInsurancePrice() {
		return insurancePrice;
	}
	public int getNewPremiumGrade() {
		return newPremiumGrade;
	}
	public int getOldPremiumGrade() {
		return oldPremiumGrade;
	}
	public int getAccidents() {
		return accidents;
	}
	public double getFinalPrice() {
		return finalPrice;
	}
	public void setMotorPower(int motorPower) {
		this.motorPower = motorPower;
	}
	public void setInsurancePrice(double insurancePrice) {
		this.insurancePrice = insurancePrice;
	}
	public void setNewPremiumGrade(int newPremiumGrade) {
		this.newPremiumGrade = newPremiumGrade;
	}
	public void setOldPremiumGrade(int oldPremiumGrade) {
		this.oldPremiumGrade = oldPremiumGrade;
	}
	public void setAccidents(int accidents) {
		this.accidents = accidents;
	}
	public void setFinalPrice(double finalPrice) {
		this.finalPrice = finalPrice;
	}
	@Override
	public String toString() {
		return "Car [insurancePrice=" + insurancePrice + ", newPremiumGrade=" + newPremiumGrade + ", finalPrice="
				+ finalPrice + "]";
	}
	

	
	
	
	
	
}
