package com.nicollasjahel.cursomc.resources;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nicollasjahel.cursomc.domain.Cidade;
import com.nicollasjahel.cursomc.domain.Estado;
import com.nicollasjahel.cursomc.dto.CidadeDTO;
import com.nicollasjahel.cursomc.dto.EstadoDTO;
import com.nicollasjahel.cursomc.services.CidadeService;
import com.nicollasjahel.cursomc.services.EstadoService;

@RestController
@RequestMapping(value = "/estados")
public class EstadoResource {

	@Autowired
	private EstadoService service;
	
	@Autowired
	private CidadeService cidadeService;

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<EstadoDTO> find(@PathVariable Integer id) {
		Estado obj = service.find(id);
		EstadoDTO objDTO = new EstadoDTO(obj);
		return ResponseEntity.ok().body(objDTO);
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<EstadoDTO>> findAll() {
		List<Estado> list = service.findAll();
		List<EstadoDTO> listDto = list.stream().map(obj -> new EstadoDTO(obj)).collect(Collectors.toList());
		return ResponseEntity.ok().body(listDto);
	}
	
	@RequestMapping(value="/{id_estado}/cidades", method = RequestMethod.GET)
	public ResponseEntity<List<CidadeDTO>> findCidades (@PathVariable Integer id_estado){
		List<Cidade> list = cidadeService.find(id_estado);
		List<CidadeDTO> listDto = list.stream().map(i -> new CidadeDTO(i)).collect(Collectors.toList());
		return ResponseEntity.ok().body(listDto);
	}
	
}
