package com.tipocambio.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tipocambio.bean.MonedaBean;
import com.tipocambio.bean.TipoCambioBeanReq;
import com.tipocambio.bean.TipoCambioBeanRes;
import com.tipocambio.service.TipoCambioService;

@RestController
public class TipoCambioController {
	
	//@Autowired
	//private MonedaService monedaService;
	
	@Autowired
	private TipoCambioService tipoCambioService;	

	@RequestMapping(value="/tipocambio/cambiarMonto", method=RequestMethod.GET)
	public TipoCambioBeanRes cambiarMonto(HttpServletRequest req,
	@RequestBody TipoCambioBeanReq request) {
		TipoCambioBeanReq beanRequest = new TipoCambioBeanReq();
		TipoCambioBeanRes beanResponse = new TipoCambioBeanRes();

		MonedaBean monedaOrigen = new MonedaBean();
		MonedaBean monedaDestino = new MonedaBean();

		monedaOrigen.setMoneda(request.getMonedaOrigen().getMoneda());
		monedaDestino.setMoneda(request.getMonedaDestino().getMoneda());
		
		beanRequest.setMonto(request.getMonto());
		beanRequest.setMonedaOrigen(monedaOrigen);
		beanRequest.setMonedaDestino(monedaDestino);

		beanResponse = tipoCambioService.cambiarMonto(beanRequest);
		
		return beanResponse;
	}
	
}
