package com.cakeathome.domain;



import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
@Entity 
@Table(name="ABONNEMENT")
public class Abonnement implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_ABONNEMENT")
	private long id_abonnement;
	/*
	 * @Column(name = "IDABONNEMENT_UTILISATEUR") private long
	 * IdAbonnemment_Utilisateur;
	 */
	@Column(name = "ABONNEMENTPRIS")
	private boolean abonnementpris;
	
	@Column(name = "ABONNEMENTDATEDEBUT")
	private Date abonnementdatedebut;
	
	@Column(name = "ABONNEMENTDUREE")
	private int abonnementduree;

	//ASSOCIATION
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_utilisateur")
	private Utilisateur utilisateur;

	public long getId_abonnement() {
		return id_abonnement;
	}

	public void setId_abonnement(long id_abonnement) {
		this.id_abonnement = id_abonnement;
	}

	public boolean isAbonnementpris() {
		return abonnementpris;
	}

	public void setAbonnementpris(boolean abonnementpris) {
		this.abonnementpris = abonnementpris;
	}

	public Date getAbonnementdatedebut() {
		return abonnementdatedebut;
	}

	public void setAbonnementdatedebut(Date abonnementdatedebut) {
		this.abonnementdatedebut = abonnementdatedebut;
	}

	public int getAbonnementduree() {
		return abonnementduree;
	}

	public void setAbonnementduree(int abonnementduree) {
		this.abonnementduree = abonnementduree;
	}

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	public Abonnement(long id_abonnement, boolean abonnementpris, Date abonnementdatedebut, int abonnementduree,
			Utilisateur utilisateur) {
		super();
		this.id_abonnement = id_abonnement;
		this.abonnementpris = abonnementpris;
		this.abonnementdatedebut = abonnementdatedebut;
		this.abonnementduree = abonnementduree;
		this.utilisateur = utilisateur;
	}

	public Abonnement() {
		super();
	}

	

	
	// GETTER
	
	
	
	
	// CONSTRUCTOR
	
	
	
	
	
	
	
	

}
