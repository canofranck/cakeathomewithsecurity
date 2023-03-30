package com.cakeathome.domain;


import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity 
@Table(name="COMMENTAIRE")

public class Commentaire implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name = "ID_COMMENTAIRE")
	private long id_commentaire;
	
	@Column(name = "ID_RECETTE")
	private Long id_recette;
	
	@Column(name = "ID_UTILISATEUR")
	private Long id_utilisateur;
	
	
//	@Column(name = "COMMENTAIRE", length = 500) permet de depasser les 255 caracteres
	@Column(name = "COMMENTAIRE")
	private String commentaire;
	
//	@Column(name = "IMAGECOMMENTAIRE")
//	private String imagecommentaire;
	
	@Column(name = "NOTECOMMENTAIRE")
	private int notecommentaire;
	
	@Column(name = "DATECOMMENTAIRE")
	private Date datecommentaire;
	
	// ASSOCIATION
	
	/*
	 * @ManyToOne(cascade = CascadeType.MERGE)
	 * 
	 * @JoinColumn(name = "id_utilisateur") private Utilisateur utilisateur;
	 */
	
	/*
	 * @ManyToOne(cascade = CascadeType.MERGE)
	 * 
	 * @JoinColumn(name = "id_recette") private Recette recette;
	 */

	
	//GETTER
	
	
	public Commentaire() {
		super();
	}

	public long getId_commentaire() {
		return id_commentaire;
	}

	public void setId_commentaire(long id_commentaire) {
		this.id_commentaire = id_commentaire;
	}

	public Long getId_recette() {
		return id_recette;
	}

	public void setId_recette(Long id_recette) {
		this.id_recette = id_recette;
	}

	public Long getId_utilisateur() {
		return id_utilisateur;
	}

	public void setId_utilisateur(Long id_utilisateur) {
		this.id_utilisateur = id_utilisateur;
	}

	public String getCommentaire() {
		return commentaire;
	}

	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}

//	public String getImagecommentaire() {
//		return imagecommentaire;
//	}
//
//	public void setImagecommentaire(String imagecommentaire) {
//		this.imagecommentaire = imagecommentaire;
//	}

	public int getNotecommentaire() {
		return notecommentaire;
	}

	public void setNotecommentaire(int notecommentaire) {
		this.notecommentaire = notecommentaire;
	}

	public Date getDatecommentaire() {
		return datecommentaire;
	}

	public void setDatecommentaire(Date datecommentaire) {
		this.datecommentaire = datecommentaire;
	}

	public Commentaire(long id_commentaire, Long id_recette, Long id_utilisateur, String commentaire,
			 int notecommentaire, Date datecommentaire) {
		super();
		this.id_commentaire = id_commentaire;
		this.id_recette = id_recette;
		this.id_utilisateur = id_utilisateur;
		this.commentaire = commentaire;
		
		this.notecommentaire = notecommentaire;
		this.datecommentaire = datecommentaire;
	}



	
	
	
	
	
	
	
	
	
}
