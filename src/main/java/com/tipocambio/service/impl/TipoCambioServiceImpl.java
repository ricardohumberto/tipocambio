package com.tipocambio.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;

import java.util.Optional;

import com.tipocambio.bean.MonedaBean;
import com.tipocambio.bean.TipoCambioBeanReq;
import com.tipocambio.bean.TipoCambioBeanRes;
import com.tipocambio.entity.MonedaEntity;
import com.tipocambio.entity.TipoCambioEntity;
import com.tipocambio.repository.MonedaRepository;
import com.tipocambio.repository.TipoCambioRepository;
import com.tipocambio.service.TipoCambioService;

@Service
public class TipoCambioServiceImpl implements TipoCambioService {
	
	@Autowired
	private TipoCambioRepository repository;

	@Autowired
	private MonedaRepository monedaRepository;

	@Override
	public TipoCambioBeanRes cambiarMonto(TipoCambioBeanReq req) {	
		
		ExampleMatcher monedaExampleMatcher = ExampleMatcher.matchingAny()
			.withMatcher("moneda", ExampleMatcher.GenericPropertyMatchers.contains().ignoreCase());
		Example<MonedaEntity> monedaExampleOrigen = Example.of(new MonedaEntity(req.getMonedaOrigen().getMoneda()), monedaExampleMatcher);
		Example<MonedaEntity> monedaExampleDestino = Example.of(new MonedaEntity(req.getMonedaDestino().getMoneda()), monedaExampleMatcher);
		Optional<MonedaEntity> monedaOrigen = monedaRepository.findOne(monedaExampleOrigen);
		Optional<MonedaEntity> monedaDestino = monedaRepository.findOne(monedaExampleDestino);


		TipoCambioEntity ent = new TipoCambioEntity();
		ent.setIdMonedaDestino(monedaDestino.get().getId());
		ent.setIdMonedaOrigen(monedaOrigen.get().getId());

		//Optional<TipoCambioEntity> entidad = repository.findOne(tipoCambExm);	

		ExampleMatcher tipoCambioExampleMatcher = ExampleMatcher.matchingAny()
			.withMatcher("monedaDestino", ExampleMatcher.GenericPropertyMatchers.contains().ignoreCase())
			.withMatcher("monedaOrigen", ExampleMatcher.GenericPropertyMatchers.contains().ignoreCase());
		Example<TipoCambioEntity> tipoCambExm = Example.of(ent, tipoCambioExampleMatcher);
		//List<TipoCambioEntity> lista2 = repository.findAll(tipoCambExm);
		Optional<TipoCambioEntity> entidad = repository.findOne(tipoCambExm);
	
		Float montoTipoCambio = (entidad.get().getTipoCambio() * req.getMonto());
		

		TipoCambioBeanRes res = new TipoCambioBeanRes();
		res.setMonto(req.getMonto());
		res.setMontoTipoCambio(montoTipoCambio);
		res.setMonedaOrigen(new MonedaBean(monedaOrigen.get().getId(), monedaOrigen.get().getNombre()));
		res.setMonedaDestino(new MonedaBean(monedaDestino.get().getId(), monedaDestino.get().getNombre()));
		res.setTipoCambio(entidad.get().getTipoCambio());

		return res;
	}

}
