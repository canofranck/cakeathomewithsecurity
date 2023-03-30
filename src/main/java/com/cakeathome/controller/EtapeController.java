package com.cakeathome.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cakeathome.dao.EtapeDao;
import com.cakeathome.domain.Etape;


@RestController
@RequestMapping
@CrossOrigin("*") 
public class EtapeController {

	@Autowired
	EtapeDao etapeDao;
	
	@GetMapping("/etape")
	public List<Etape> getAllEtapes(@Validated @RequestBody(required = false) Etape etape) {
		return etapeDao.getEtapes();		
}
	@PostMapping("/etape")
	public Etape createEtape(@Validated @RequestBody(required = false) Etape etape) {
		return etapeDao.saveEtape(etape);
	
}
	@GetMapping("/etape/{id_etape}")
	public ResponseEntity findetapeById(@PathVariable(name = "id_etape")Long id_etape){
		if (id_etape == null) {
			return ResponseEntity.badRequest().body("Je ne trouve pas le fournisseur avec son ID");
		}
		
		Etape etape = etapeDao.getEtapeByID(id_etape);
		
		if (etape == null) {
			return ResponseEntity.notFound().build();
		}
		
		return ResponseEntity.ok().body(etape); 
		
	}
	@PutMapping("/etapes/{id_etape}")
	public ResponseEntity<Etape> updateEtape(@Validated @PathVariable(name = "id_etape")Long id_etape, @RequestBody(required = false) Etape etape) {
		if (etape == null) {
			return ResponseEntity.notFound().build();
			
		}
	etape.setId_etape(id_etape);
		etapeDao.updateEtape(etape);
		return ResponseEntity.ok().body(etape);
	}
	
	@DeleteMapping("/etapes/{id_etape}")
	public ResponseEntity<Etape> deleteEtape (@Validated @PathVariable(name = "id_etape")Long id_etape) {
		
		Etape etape = etapeDao.getEtapeByID(id_etape) ;
		
		if (etape == null) {
			return ResponseEntity.notFound().build();
		
	}
		etapeDao.deleteEtape(etape);
		return ResponseEntity.ok().body(etape); 
	
	}
}
