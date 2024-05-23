package com.nicollasjahel.cursomc.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nicollasjahel.cursomc.domain.Estado;
import com.nicollasjahel.cursomc.domain.enums.Perfil;
import com.nicollasjahel.cursomc.repositories.EstadoRepository;
import com.nicollasjahel.cursomc.security.UserSS;
import com.nicollasjahel.cursomc.services.exceptions.AuthorizationException;
import com.nicollasjahel.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class EstadoService {
	
	@Autowired
	private EstadoRepository repo;
	
	public Estado find(Integer id) {
		
		Optional<Estado> obj = repo.findById(id);
		
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: " + id + ", Tipo: " + Estado.class.getName()));
	}
	
	public List<Estado> findAll(){
		return repo.findAllByOrderByNome();
	}
	
}
