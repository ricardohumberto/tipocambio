package com.tipocambio.dao.impl;

import javax.sql.DataSource;

import org.springframework.stereotype.Service;

import com.tipocambio.bean.TipoCambioBeanReq;
import com.tipocambio.bean.TipoCambioBeanRes;
import com.tipocambio.dao.TipoCambioDAO;

import io.reactivex.Observable;


@Service
public class TipoCambioDAOImpl implements TipoCambioDAO {
	
	public TipoCambioBeanRes cambiarMonto(TipoCambioBeanReq req, DataSource dataSource) {
		//try(Connection conn = dataSource.getConnection();
			//	PreparedStatement pstm = conn.prepareStatement(sql))
		//Observable<TipoCambioBeanRes> observableBeanRes = Observable.just(req);
		return null;
	}
	
}
