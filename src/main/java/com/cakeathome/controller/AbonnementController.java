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

import com.cakeathome.dao.AbonnementDao;
import com.cakeathome.domain.Abonnement;


@RestController
@RequestMapping
@CrossOrigin("*")
public class AbonnementController {
	@Autowired
	AbonnementDao abonnementDao;
	
	@GetMapping("/abonnement")
	public List<Abonnement> getAllAbonnements(@Validated @RequestBody(required = false) Abonnement abonnement) {
		return abonnementDao.getAbonnements();		
}
	@PostMapping("/abonnement")
	public Abonnement createAbonnement(@Validated @RequestBody(required = false)  Abonnement abonnement) {
		return abonnementDao.saveAbonnement(abonnement);
	
}
	@GetMapping("/abonnement/{id_abonnement}")
	public ResponseEntity findAbonnementById(@PathVariable(name = "id_abonnement")Long id_abonnement){
		if (id_abonnement == null) {
			return ResponseEntity.badRequest().body("Je ne trouve pas le fournisseur avec son ID");
		}
		
		Abonnement abonnement = abonnementDao.getAbonnementByID(id_abonnement);
		
		if (abonnement == null) {
			return ResponseEntity.notFound().build();
		}
		
		return ResponseEntity.ok().body(abonnement); 
		
	}
	
	@PutMapping("/abonnements/{id_abonnement}")
	public ResponseEntity<Abonnement> updateAbonnement (@Validated @PathVariable(name = "id_abonnement")Long id_abonnement, @RequestBody(required = false) Abonnement abonnement) {
		if (abonnement == null) {
			return ResponseEntity.notFound().build();
			
		}
		abonnement.setId_abonnement(id_abonnement);
		abonnementDao.updateAbonnement(abonnement);
		return ResponseEntity.ok().body(abonnement);
	}
	
	@DeleteMapping("/abonnements/{id_abonnement}")
	public ResponseEntity<Abonnement> deleteAbonnement (@Validated @PathVariable(name = "id_abonnement")Long id_abonnement) {
		
		Abonnement abonnement = abonnementDao.getAbonnementByID(id_abonnement) ;
		
		if (abonnement == null) {
			return ResponseEntity.notFound().build();
		
	}
		abonnementDao.deleteAbonnement(abonnement);
		return ResponseEntity.ok().body(abonnement); 
	
	}
	
}