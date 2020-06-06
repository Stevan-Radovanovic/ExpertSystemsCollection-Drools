package com.sample;

public class Klima {

	private String tipKlime;
	private int snagaKlime;
	private boolean inverter;
	private int kvadratura;
	private boolean grejanjeViseProstorija;
	private boolean mogucnostUgradnjeUZid;
	private boolean zimiZaGrejanjeIspodMinus5;
	private String kolikoZaGrejanje;
	
	
	
	public String getTipKlime() {
		return tipKlime;
	}
	public int getSnagaKlime() {
		return snagaKlime;
	}
	public boolean isInverter() {
		return inverter;
	}
	public int getKvadratura() {
		return kvadratura;
	}
	public boolean isGrejanjeViseProstorija() {
		return grejanjeViseProstorija;
	}
	public boolean isMogucnostUgradnjeUZid() {
		return mogucnostUgradnjeUZid;
	}
	public boolean isZimiZaGrejanjeIspodMinus5() {
		return zimiZaGrejanjeIspodMinus5;
	}
	public String getKolikoZaGrejanje() {
		return kolikoZaGrejanje;
	}
	public void setTipKlime(String tipKlime) {
		this.tipKlime = tipKlime;
	}
	public void setSnagaKlime(int snagaKlime) {
		this.snagaKlime = snagaKlime;
	}
	public void setInverter(boolean inverter) {
		this.inverter = inverter;
	}
	public void setKvadratura(int kvadratura) {
		this.kvadratura = kvadratura;
	}
	public void setGrejanjeViseProstorija(boolean grejanjeViseProstorija) {
		this.grejanjeViseProstorija = grejanjeViseProstorija;
	}
	public void setMogucnostUgradnjeUZid(boolean mogucnostUgradnjeUZid) {
		this.mogucnostUgradnjeUZid = mogucnostUgradnjeUZid;
	}
	public void setZimiZaGrejanjeIspodMinus5(boolean zimiZaGrejanjeIspodMinus5) {
		this.zimiZaGrejanjeIspodMinus5 = zimiZaGrejanjeIspodMinus5;
	}
	public void setKolikoZaGrejanje(String kolikoZaGrejanje) {
		this.kolikoZaGrejanje = kolikoZaGrejanje;
	}
	
	@Override
	public String toString() {
		return "Klima [tipKlime=" + tipKlime + ", snagaKlime=" + snagaKlime + ", inverter=" + inverter + ", kvadratura="
				+ kvadratura + ", grejanjeViseProstorija=" + grejanjeViseProstorija + ", mogucnostUgradnjeUZid="
				+ mogucnostUgradnjeUZid + ", zimiZaGrejanjeIspodMinus5=" + zimiZaGrejanjeIspodMinus5
				+ ", kolikoZaGrejanje=" + kolikoZaGrejanje + "]";
	}
	
	
	
	
	
	
}
