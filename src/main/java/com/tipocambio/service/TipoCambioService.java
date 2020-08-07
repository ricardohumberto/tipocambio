package com.tipocambio.service;

import com.tipocambio.bean.TipoCambioBeanReq;
import com.tipocambio.bean.TipoCambioBeanRes;

public interface TipoCambioService {
	public TipoCambioBeanRes cambiarMonto(TipoCambioBeanReq req);
}