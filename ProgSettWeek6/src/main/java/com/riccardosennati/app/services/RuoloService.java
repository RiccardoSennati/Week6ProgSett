package com.riccardosennati.app.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.riccardosennati.app.entities.Ruolo;
import com.riccardosennati.app.repositories.RuoloRepository;

@Service
public class RuoloService {
	
	@Autowired
	private RuoloRepository rr;
	
	public Ruolo save(Ruolo r) {
		return rr.save(r);
	}
	
	public List<Ruolo> getAll() {
		return rr.findAll();
	}
	
	public Optional<Ruolo> getById(int id) {
		return rr.findById(id);
	}
	
	public Page<Ruolo> getAll_page(Pageable pageable) {
		return rr.findAll(pageable);
	}
	
	public void delete(Ruolo r) {
		rr.delete(r);
	}

}
