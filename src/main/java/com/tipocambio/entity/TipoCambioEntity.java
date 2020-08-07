package com.tipocambio.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tipo_cambio")
public class TipoCambioEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private float tipoCambio;
	private int idMonedaOrigen;
	private int idMonedaDestino;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public float getTipoCambio() {
		return tipoCambio;
	}
	public void setTipoCambio(float tipoCambio) {
		this.tipoCambio = tipoCambio;
	}
	public int getIdMonedaOrigen() {
		return idMonedaOrigen;
	}
	public void setIdMonedaOrigen(int idMonedaOrigen) {
		this.idMonedaOrigen = idMonedaOrigen;
	}
	public int getIdMonedaDestino() {
		return idMonedaDestino;
	}
	public void setIdMonedaDestino(int idMonedaDestino) {
		this.idMonedaDestino = idMonedaDestino;
	}
	
	
	
	
}
