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

import com.cakeathome.dao.CommentaireDao;
import com.cakeathome.domain.Commentaire;


@RestController
@RequestMapping
@CrossOrigin("*")
public class CommentaireController {
	@Autowired
	CommentaireDao commentaireDao;
	
	@GetMapping("/commentaire")
	public List<Commentaire> getAllCommentaires(@Validated @RequestBody(required = false) Commentaire commentaire) {
		return commentaireDao.getCommentaires();	
}
	@PostMapping("/commentaire")
	public Commentaire createCommentaire(@Validated @RequestBody(required = false) Commentaire commentaire) {
		return commentaireDao.saveCommentaire(commentaire);
	
}
	@GetMapping("/commentaire/{id_commentaire}")
	public ResponseEntity findcommentaireById(@PathVariable(name = "IdCommentaire")Long id_commentaire){
		if (id_commentaire== null) {
			return ResponseEntity.badRequest().body("Je ne trouve pas le fournisseur avec son ID");
		}
		
		Commentaire commentaire= commentaireDao.getCommentaireByID(id_commentaire);
		
		if (commentaire == null) {
			return ResponseEntity.notFound().build();
		}
		
		return ResponseEntity.ok().body(commentaire); 
		
	}
	@PutMapping("/commentaires/{id_commentaire}")
	public ResponseEntity<Commentaire> updateCommentaire (@Validated @PathVariable(name = "id_commentaire")Long id_commentaire, @RequestBody(required = false) Commentaire commentaire) {
		if (commentaire == null) {
			return ResponseEntity.notFound().build();
			
		}
		commentaire.setId_commentaire(id_commentaire);
		commentaireDao.updateCommentaire(commentaire);
		return ResponseEntity.ok().body(commentaire);
	}
	
	@DeleteMapping("/commentaires/{id_commentaire}")
	public ResponseEntity<Commentaire> deleteCommentaire (@Validated @PathVariable(name = "id_commentaire")Long id_commentaire) {
		
		Commentaire commentaire = commentaireDao.getCommentaireByID(id_commentaire) ;
		
		if (commentaire == null) {
			return ResponseEntity.notFound().build();
		
	}
		commentaireDao.deleteCommentaire(commentaire);
		return ResponseEntity.ok().body(commentaire); 
	
	}
}