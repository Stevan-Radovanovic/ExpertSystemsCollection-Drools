package com.sample;

public class Heat {

	private int squareMeters;
	private String sensitivity;
	private boolean priceImportant;
	private boolean hasElectricity;
	private boolean hasGas;
	private boolean connectedToCityHeatingNetwork;
	private String heatingType = null;
	private String heatingSystem = null;

	public int getSquareMeters() {
		return squareMeters;
	}
	public String getSensitivity() {
		return sensitivity;
	}
	public boolean isPriceImportant() {
		return priceImportant;
	}
	public boolean isHasElectricity() {
		return hasElectricity;
	}
	public boolean isHasGas() {
		return hasGas;
	}
	public boolean isConnectedToCityHeatingNetwork() {
		return connectedToCityHeatingNetwork;
	}
	public String getHeatingType() {
		return heatingType;
	}
	public String getHeatingSystem() {
		return heatingSystem;
	}
	public void setSquareMeters(int squareMeters) {
		this.squareMeters = squareMeters;
	}
	public void setSensitivity(String sensitivity) {
		this.sensitivity = sensitivity;
	}
	public void setPriceImportant(boolean isPriceImportant) {
		this.priceImportant = isPriceImportant;
	}
	public void setHasElectricity(boolean hasElectricity) {
		this.hasElectricity = hasElectricity;
	}
	public void setHasGas(boolean hasGas) {
		this.hasGas = hasGas;
	}
	public void setConnectedToCityHeatingNetwork(boolean connectedToCityHeatingNetwork) {
		this.connectedToCityHeatingNetwork = connectedToCityHeatingNetwork;
	}
	public void setHeatingType(String heatingType) {
		this.heatingType = heatingType;
	}
	public void setHeatingSystem(String heatingSystem) {
		this.heatingSystem = heatingSystem;
	}
	@Override
	public String toString() {
		return "Heat [squareMeters=" + squareMeters + ", sensitivity=" + sensitivity + ", priceImportant="
				+ priceImportant + ", hasElectricity=" + hasElectricity + ", hasGas=" + hasGas
				+ ", connectedToCityHeatingNetwork=" + connectedToCityHeatingNetwork + ", heatingType=" + heatingType
				+ ", heatingSystem=" + heatingSystem + "]";
	}
	
	

	
	
	
	
	
	
}
