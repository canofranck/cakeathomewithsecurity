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

import com.cakeathome.dao.UtilisateurDao;
import com.cakeathome.domain.Utilisateur;

@RestController
@RequestMapping
@CrossOrigin("*")
public class UtilisateurController {

	@Autowired
	UtilisateurDao utilisateurDao;

	@GetMapping("/utilisateur")
	public List<Utilisateur> getAllUtilisateurs(@Validated @RequestBody(required = false) Utilisateur utilisateur) {
		return utilisateurDao.getUtilisateurs();
	}

	@PostMapping("/utilisateur")
	public Utilisateur createUtilisateurs(@Validated @RequestBody(required = false) Utilisateur utilisateur) {
		return utilisateurDao.saveUtilisateur(utilisateur);

	}

	@GetMapping("/utilisateur/{id_utilisateur}")
	public ResponseEntity findutilisateurById(@PathVariable(name = "id_utilisateur") Long id_utilisateur) {
		if (id_utilisateur == null) {
			return ResponseEntity.badRequest().body("Je ne trouve pas le fournisseur avec son ID");
		}

		Utilisateur utilisateur = utilisateurDao.getUtilisateurByID(id_utilisateur);

		if (utilisateur == null) {
			return ResponseEntity.notFound().build();
		}

		return ResponseEntity.ok().body(utilisateur);

	}

	@PutMapping("/utilisateurs/{id_utilisateur}")
	public ResponseEntity<Utilisateur> updateUtilisateur(
			@Validated @PathVariable(name = "id_utilisateur") Long id_utilisateur,
			@RequestBody(required = false) Utilisateur utilisateur) {
		if (utilisateur == null) {
			return ResponseEntity.notFound().build();

		}
		utilisateur.setId_utilisateur(id_utilisateur);
		utilisateurDao.updateUtilisateur(utilisateur);
		return ResponseEntity.ok().body(utilisateur);
	}

	@DeleteMapping("/utilisateurs/{id_utilisateur}")
	public ResponseEntity<Utilisateur> deleteUtilisateur(
			@Validated @PathVariable(name = "id_utilisateur") Long id_utilisateur) {

		Utilisateur utilisateur = utilisateurDao.getUtilisateurByID(id_utilisateur);

		if (utilisateur == null) {
			return ResponseEntity.notFound().build();

		}
		utilisateurDao.deleteUtilisateur(utilisateur);
		return ResponseEntity.ok().body(utilisateur);

	}
}