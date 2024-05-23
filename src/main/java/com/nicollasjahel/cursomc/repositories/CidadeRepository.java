package com.nicollasjahel.cursomc.repositories;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.nicollasjahel.cursomc.domain.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Integer>{
	
	@Transactional
	@Query("SELECT obj FROM Cidade obj WHERE obj.estado.id = :estadoId ORDER BY obj.nome")
	List<Cidade> findCidades(@Param("estadoId") Integer id_estado);

}
