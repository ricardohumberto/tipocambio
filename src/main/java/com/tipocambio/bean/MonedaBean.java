package com.tipocambio.bean;

public class MonedaBean {
	private int idMoneda;
	private String moneda;

	public MonedaBean(){

	}

	public MonedaBean(int idMoneda, String moneda){
		this.idMoneda = idMoneda;
		this.moneda = moneda;
	}
	
	public int getIdMoneda() {
		return idMoneda;
	}
	public void setIdMoneda(int idMoneda) {
		this.idMoneda = idMoneda;
	}
	public String getMoneda() {
		return moneda;
	}
	public void setMoneda(String moneda) {
		this.moneda = moneda;
	}
	
	
}
