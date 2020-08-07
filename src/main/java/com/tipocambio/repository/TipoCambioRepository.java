package com.tipocambio.repository;

import com.tipocambio.entity.TipoCambioEntity;

import org.springframework.data.jpa.repository.JpaRepository;


public interface TipoCambioRepository extends JpaRepository<TipoCambioEntity, Integer> {
	
}
