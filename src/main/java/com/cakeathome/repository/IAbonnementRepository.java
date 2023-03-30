package com.cakeathome.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cakeathome.domain.Abonnement;

public interface IAbonnementRepository extends JpaRepository<Abonnement, Long> {

}
