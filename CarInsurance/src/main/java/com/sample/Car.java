package com.sample;

public class Car {

	
	private int motorPower;
	
	private double baseInsurance;
	
	private int newPremiumGrade;
	
	private int carAccidentAmount;
	
	private double finalInsurance;
	
	private boolean firstRegistration;
	
	private int oldPremiumGrade;
	
	private boolean finishedCalculation = false;

	public int getMotorPower() {
		return motorPower;
	}

	public double getBaseInsurance() {
		return baseInsurance;
	}

	public int getNewPremiumGrade() {
		return newPremiumGrade;
	}

	public int getCarAccidentAmount() {
		return carAccidentAmount;
	}

	public double getFinalInsurance() {
		return finalInsurance;
	}

	public boolean isFirstRegistration() {
		return firstRegistration;
	}

	public int getOldPremiumGrade() {
		return oldPremiumGrade;
	}

	public void setMotorPower(int motorPower) {
		this.motorPower = motorPower;
	}

	public void setBaseInsurance(double baseInsurance) {
		this.baseInsurance = baseInsurance;
	}

	public void setNewPremiumGrade(int newPremiumGrade) {
		this.newPremiumGrade = newPremiumGrade;
	}

	public void setCarAccidentAmount(int carAccidentAmount) {
		this.carAccidentAmount = carAccidentAmount;
	}

	public void setFinalInsurance(double finalInsurance) {
		this.finalInsurance = finalInsurance;
	}

	public void setFirstRegistration(boolean firstRegistration) {
		this.firstRegistration = firstRegistration;
	}

	public void setOldPremiumGrade(int oldPremiumGrade) {
		this.oldPremiumGrade = oldPremiumGrade;
	}

	@Override
	public String toString() {
		return "Car [baseInsurance=" + baseInsurance + ", newPremiumGrade=" + newPremiumGrade + ", finalInsurance="
				+ finalInsurance + "]";
	}

	public boolean isFinishedCalculation() {
		return finishedCalculation;
	}

	public void setFinishedCalculation(boolean finishedCalculation) {
		this.finishedCalculation = finishedCalculation;
	}

	

	
	
	
	
	
}
