package com.cakeathome.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cakeathome.domain.Utilisateur;


public interface IUtilisateurRepository extends JpaRepository<Utilisateur, Long> {
}
