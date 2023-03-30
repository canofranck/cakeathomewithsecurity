package com.cakeathome.domain;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "GALLERIE")
public class Gallerie implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "GALLERIE_ID")
	private Long id_gallerie;
	
	@Column(name = "ID_RECETTE")
	private Long id_recette;

	@Column(name = "GALLERIEFILENAME")
	private String galleriefilename;

	@Column(name = "ID_UTILISATEUR")
	private Long id_utilisateur;

	

	public Gallerie(Long id_gallerie, Long id_recette, String galleriefilename, Long id_utilisateur) {
		super();
		this.id_gallerie = id_gallerie;
		this.id_recette = id_recette;
		this.galleriefilename = galleriefilename;
		this.id_utilisateur = id_utilisateur;
	}



	public Long getId_gallerie() {
		return id_gallerie;
	}



	public void setId_gallerie(Long id_gallerie) {
		this.id_gallerie = id_gallerie;
	}



	public Long getId_recette() {
		return id_recette;
	}



	public void setId_recette(Long id_recette) {
		this.id_recette = id_recette;
	}



	public String getGalleriefilename() {
		return galleriefilename;
	}



	public void setGalleriefilename(String galleriefilename) {
		this.galleriefilename = galleriefilename;
	}



	public Long getId_utilisateur() {
		return id_utilisateur;
	}



	public void setId_utilisateur(Long id_utilisateur) {
		this.id_utilisateur = id_utilisateur;
	}



	public Gallerie() {
		super();
	}

	// GETTER

}