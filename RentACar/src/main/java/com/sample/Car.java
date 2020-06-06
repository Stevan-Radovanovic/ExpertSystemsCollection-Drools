package com.sample;

public class Car {

	private boolean hasLicense;
	private int age;
	private int deposit = 0;
	private boolean canRent;
	private String mustLeaveDeposit;
	private double yearsWithLicense;
	private String vehicleClass="";


	public boolean isHasLicense() {
		return hasLicense;
	}
	public int getAge() {
		return age;
	}
	public int getDeposit() {
		return deposit;
	}
	public boolean isCanRent() {
		return canRent;
	}
	public double getYearsWithLicense() {
		return yearsWithLicense;
	}
	public String getVehicleClass() {
		return vehicleClass;
	}
	public void setHasLicense(boolean hasLicense) {
		this.hasLicense = hasLicense;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getMustLeaveDeposit() {
		return mustLeaveDeposit;
	}
	public void setMustLeaveDeposit(String mustLeaveDeposit) {
		this.mustLeaveDeposit = mustLeaveDeposit;
	}
	public void setDeposit(int deposit) {
		this.deposit = deposit;
	}
	public void setCanRent(boolean canRent) {
		this.canRent = canRent;
	}
	public void setYearsWithLicense(double d) {
		this.yearsWithLicense = d;
	}
	public void setVehicleClass(String vehicleClass) {
		this.vehicleClass = vehicleClass;
	}
	@Override
	public String toString() {
		return "Car [deposit=" + deposit + ", canRent=" + canRent + ", mustLeaveDeposit=" + mustLeaveDeposit
				+ ", vehicleClass=" + vehicleClass + "]";
	}
	
	
	
	
	
	
}
