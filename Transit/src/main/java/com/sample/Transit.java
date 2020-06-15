package com.sample;

import java.util.ArrayList;

public class Transit {

	private ArrayList<String> solution = new ArrayList<String>();
	private float distance;
	private String terain;
	private boolean wantsTraining;
	private boolean hasMoney;
	public ArrayList<String> getSolution() {
		return solution;
	}
	public float getDistance() {
		return distance;
	}
	public String getTerain() {
		return terain;
	}
	public boolean isWantsTraining() {
		return wantsTraining;
	}
	public boolean isHasMoney() {
		return hasMoney;
	}
	public void setSolution(ArrayList<String> solution) {
		this.solution = solution;
	}
	public void setDistance(float distance) {
		this.distance = distance;
	}
	public void setTerain(String terain) {
		this.terain = terain;
	}
	public void setWantsTraining(boolean wantsTraining) {
		this.wantsTraining = wantsTraining;
	}
	public void setHasMoney(boolean hasMoney) {
		this.hasMoney = hasMoney;
	}
	@Override
	public String toString() {
		return "Transit [solution=" + solution + ", distance=" + distance + ", terain=" + terain + ", wantsTraining="
				+ wantsTraining + ", hasMoney=" + hasMoney + "]";
	}
	
	
	
	
}
