package com.cakeathome.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cakeathome.domain.Utilisateur;
import com.cakeathome.repository.IUtilisateurRepository;


@Service
public class UtilisateurDao {
	@Autowired
	IUtilisateurRepository utilisateurRepository;

	// Liste Utilisateur

	public List<Utilisateur> getUtilisateurs() {
		return utilisateurRepository.findAll();
	}
	
	
	// create un utilisateur
	public Utilisateur saveUtilisateur(Utilisateur utilisateur) {
		return utilisateurRepository.save(utilisateur);
	}

	// recupere un utilisateur par ID 
	public Utilisateur getUtilisateurByID(Long id_utilisateur) {
		return utilisateurRepository.findById(id_utilisateur).get();
	}
	// Delete un Utilisateur
	
	public void deleteUtilisateur(Utilisateur utilisateur) {
		utilisateurRepository.delete(utilisateur);
	}

	// modifier un User
	
	public Utilisateur updateUtilisateur(Utilisateur utilisateur) {
		return utilisateurRepository.save(utilisateur);
		
	}
}
