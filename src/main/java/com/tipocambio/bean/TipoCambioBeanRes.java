package com.tipocambio.bean;

public class TipoCambioBeanRes {
	
	private float monto;
	private float montoTipoCambio;
	private MonedaBean monedaOrigen;
	private MonedaBean monedaDestino;
	private float tipoCambio;
	
	public float getMonto() {
		return monto;
	}
	public void setMonto(float monto) {
		this.monto = monto;
	}
	public float getMontoTipoCambio() {
		return montoTipoCambio;
	}
	public void setMontoTipoCambio(float montoTipoCambio) {
		this.montoTipoCambio = montoTipoCambio;
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
	public float getTipoCambio() {
		return tipoCambio;
	}
	public void setTipoCambio(float tipoCambio) {
		this.tipoCambio = tipoCambio;
	}
	
	
}
