package com.nicollasjahel.cursomc.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nicollasjahel.cursomc.domain.Cidade;
import com.nicollasjahel.cursomc.repositories.CidadeRepository;
import com.nicollasjahel.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class CidadeService {
	
	@Autowired
	private CidadeRepository repo;
	
	
	public List<Cidade> find(Integer id) {
		
		return repo.findCidades(id);
	}

}
