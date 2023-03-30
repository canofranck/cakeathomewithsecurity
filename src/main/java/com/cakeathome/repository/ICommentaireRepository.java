package com.cakeathome.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cakeathome.domain.Commentaire;

public interface ICommentaireRepository extends JpaRepository<Commentaire, Long>{

}
