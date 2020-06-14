package com.sample;

public class AirConditioner {

	private String acType = "Mounted";
	private int acPower;
	private int squareMeters;
	private boolean multipleRooms;
	private boolean mountable;
	private boolean hasInverter;
	private String heatingAmount;
	private boolean heatingWhenItsColdAsFuck;
	public String getAcType() {
		return acType;
	}
	public int getAcPower() {
		return acPower;
	}
	public int getSquareMeters() {
		return squareMeters;
	}
	public boolean isMultipleRooms() {
		return multipleRooms;
	}
	public boolean isMountable() {
		return mountable;
	}
	public boolean isHasInverter() {
		return hasInverter;
	}
	public String getHeatingAmount() {
		return heatingAmount;
	}
	public boolean isHeatingWhenItsColdAsFuck() {
		return heatingWhenItsColdAsFuck;
	}
	public void setAcType(String acType) {
		this.acType = acType;
	}
	public void setAcPower(int acPower) {
		this.acPower = acPower;
	}
	public void setSquareMeters(int squareMeters) {
		this.squareMeters = squareMeters;
	}
	public void setMultipleRooms(boolean multipleRooms) {
		this.multipleRooms = multipleRooms;
	}
	public void setMountable(boolean mountable) {
		this.mountable = mountable;
	}
	public void setHasInverter(boolean hasInverter) {
		this.hasInverter = hasInverter;
	}
	public void setHeatingAmount(String heatingAmount) {
		this.heatingAmount = heatingAmount;
	}
	public void setHeatingWhenItsColdAsFuck(boolean heatingWhenItsColdAsFuck) {
		this.heatingWhenItsColdAsFuck = heatingWhenItsColdAsFuck;
	}
	@Override
	public String toString() {
		return "AirConditioner [" + (acType != null ? "acType=" + acType + ", " : "") + "acPower=" + acPower
				+ ", mountable=" + mountable + ", hasInverter=" + hasInverter + "]";
	}
	
	
	
	
	
	
}
