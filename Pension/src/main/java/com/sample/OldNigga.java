package com.sample;

public class OldNigga {

	private int age;
	private int yearsSpentWorking;
	private String gender;
	private boolean hasDisability;
	private int ageLimit = 0;
	private String pensionType;
	private double pensionPercent;
	public int getAge() {
		return age;
	}
	public int getYearsSpentWorking() {
		return yearsSpentWorking;
	}
	public String getGender() {
		return gender;
	}
	public boolean isHasDisability() {
		return hasDisability;
	}
	public int getAgeLimit() {
		return ageLimit;
	}
	public String getPensionType() {
		return pensionType;
	}
	public double getPensionPercent() {
		return pensionPercent;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setYearsSpentWorking(int yearsSpentWorking) {
		this.yearsSpentWorking = yearsSpentWorking;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void setHasDisability(boolean hasDisability) {
		this.hasDisability = hasDisability;
	}
	public void setAgeLimit(int ageLimit) {
		this.ageLimit = ageLimit;
	}
	public void setPensionType(String pensionType) {
		this.pensionType = pensionType;
	}
	public void setPensionPercent(double pensionPercent) {
		this.pensionPercent = pensionPercent;
	}
	@Override
	public String toString() {
		return "OldNigga [age=" + age + ", yearsSpentWorking=" + yearsSpentWorking + ", "
				+ (gender != null ? "gender=" + gender + ", " : "") + "hasDisability=" + hasDisability + ", ageLimit="
				+ ageLimit + ", " + (pensionType != null ? "pensionType=" + pensionType + ", " : "") + "pensionPercent="
				+ pensionPercent + "]";
	}
	
	
	
}
