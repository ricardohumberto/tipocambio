package com.tipocambio.bean;

public class TipoCambioBeanReq {
	
	 private float monto;
	 private MonedaBean monedaOrigen;
	 private MonedaBean monedaDestino;
	 
	public float getMonto() {
		return monto;
	}
	public void setMonto(float monto) {
		this.monto = monto;
	}
	public MonedaBean getMonedaOrigen() {
		return monedaOrigen;
	}
	public void setMonedaOrigen(MonedaBean monedaOrigen) {
		this.monedaOrigen = monedaOrigen;
	}
	public MonedaBean getMonedaDestino() {
		return monedaDestino;
	}
	public void setMonedaDestino(MonedaBean monedaDestino) {
		this.monedaDestino = monedaDestino;
	}
	 
	 
}
