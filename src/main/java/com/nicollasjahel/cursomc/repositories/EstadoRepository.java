package com.nicollasjahel.cursomc.repositories;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nicollasjahel.cursomc.domain.Estado;


public interface EstadoRepository extends JpaRepository<Estado, Integer> {
	
	@Transactional
	List<Estado> findAllByOrderByNome();

}
