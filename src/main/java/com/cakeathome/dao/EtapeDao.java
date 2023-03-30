package com.cakeathome.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cakeathome.domain.Etape;
import com.cakeathome.repository.IEtapeRepository;

@Service
public class EtapeDao {
	@Autowired
	IEtapeRepository etapeRepository;
	// Liste Etape

	public List<Etape> getEtapes() {
		return etapeRepository.findAll();
	}
	
	
	// create une etape
	public Etape saveEtape(Etape etape) {
		return etapeRepository.save(etape);
	}

	// recupere une etape par ID 
	public Etape getEtapeByID(Long id_etape) {
		return etapeRepository.findById(id_etape).get();
	}
	// Delete une Etape
	
	public void deleteEtape(Etape etape) {
		etapeRepository.delete(etape);
	}

	// modifier une Etape
	
	public Etape updateEtape(Etape etape) {
		return etapeRepository.save(etape);
		
	}
}
