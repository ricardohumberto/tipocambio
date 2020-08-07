package com.tipocambio.repository;

import com.tipocambio.entity.MonedaEntity;

import org.springframework.data.jpa.repository.JpaRepository;


public interface MonedaRepository extends JpaRepository<MonedaEntity, Integer> {
	
}