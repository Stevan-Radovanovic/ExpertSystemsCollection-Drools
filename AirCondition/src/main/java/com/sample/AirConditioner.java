package com.sample;

public class AirConditioner {

	private String airConditionType;
	private int airConditionPower;
	private boolean inverter;
	private int squaredMeters;
	private boolean heatingMultipleRooms;
	private boolean wallMountingEnabled;
	private boolean heatingBelowMinus5;
	private String heatingUse;
	
	public String getAirConditionType() {
		return airConditionType;
	}
	public int getAirConditionPower() {
		return airConditionPower;
	}
	public boolean isInverter() {
		return inverter;
	}
	public int getSquaredMeters() {
		return squaredMeters;
	}
	public boolean isHeatingMultipleRooms() {
		return heatingMultipleRooms;
	}
	public boolean isWallMountingEnabled() {
		return wallMountingEnabled;
	}
	public boolean isHeatingBelowMinus5() {
		return heatingBelowMinus5;
	}
	public String getHeatingUse() {
		return heatingUse;
	}
	public void setAirConditionType(String airConditionType) {
		this.airConditionType = airConditionType;
	}
	public void setAirConditionPower(int airConditionPower) {
		this.airConditionPower = airConditionPower;
	}
	public void setInverter(boolean inverter) {
		this.inverter = inverter;
	}
	public void setSquaredMeters(int squaredMeters) {
		this.squaredMeters = squaredMeters;
	}
	public void setHeatingMultipleRooms(boolean heatingMultipleRooms) {
		this.heatingMultipleRooms = heatingMultipleRooms;
	}
	public void setWallMountingEnabled(boolean wallMountingEnabled) {
		this.wallMountingEnabled = wallMountingEnabled;
	}
	public void setHeatingBelowMinus5(boolean heatingBelowMinus5) {
		this.heatingBelowMinus5 = heatingBelowMinus5;
	}
	public void setHeatingUse(String heatingUse) {
		this.heatingUse = heatingUse;
	}
	@Override
	public String toString() {
		return "AirConditioner [" + (airConditionType != null ? "airConditionType=" + airConditionType + ", " : "")
				+ "airConditionPower=" + airConditionPower + ", inverter=" + inverter + ", squaredMeters="
				+ squaredMeters + ", heatingMultipleRooms=" + heatingMultipleRooms + ", wallMountingEnabled="
				+ wallMountingEnabled + ", heatingBelowMinus5=" + heatingBelowMinus5 + ", "
				+ (heatingUse != null ? "heatingUse=" + heatingUse : "") + "]";
	}
	

	
	
	
	
	
}
