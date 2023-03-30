package com.cakeathome.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cakeathome.domain.Abonnement;
import com.cakeathome.repository.IAbonnementRepository;


@Service
public class AbonnementDao {
	@Autowired
	IAbonnementRepository abonnementRepository;
	
	// Liste abonnements

		public List<Abonnement> getAbonnements() {
			return abonnementRepository.findAll();
		}
		
		
		// create un abonnements
		
		public Abonnement saveAbonnement(Abonnement abonnement) {
			return abonnementRepository.save(abonnement);
		}

		// recupere un abonnements par ID 
		
		public Abonnement getAbonnementByID(Long id_abonnement) {
			return abonnementRepository.findById(id_abonnement).get();
		}
		// Delete un abonnements
		
		public void deleteAbonnement(Abonnement abonnement) {
			abonnementRepository.delete(abonnement);
		}

		// modifier un abonnement
		
		public Abonnement updateAbonnement(Abonnement abonnement) {
			return abonnementRepository.save(abonnement);
			
		}
	}
