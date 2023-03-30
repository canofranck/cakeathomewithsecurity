package com.cakeathome.domain;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "RECETTE")
//@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id_recette")

public class Recette implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name = "ID_RECETTE")
	private Long id_recette;
	
	@Column(name = "ID_UTILISATEUR")
	private Long id_utilisateur;

	@Column(name = "TITRE_RECETTE")
	private String titre_recette;
	

	@Column(name = "DESCRIPTION_RECETTE")
	private String description_recette;

	@Column(name = "CATEGORIE_RECETTE")
	private String categorie_recette;
	
	@Column(name = "NBPERSONNE_RECETTE")
	private String nbpersonne_recette;

	@Column(name = "NIVEAUDIFFICULTE_RECETTE")
	private String niveaudifficulte_recette;

	@Column(name = "TEMPSPREPARATION_RECETTE")
	private String tempspreparation_recette;

	@Column(name = "TEMPSCUISSON_RECETTE")
	private String tempscuisson_recette;

	@Column(name = "TEMPSTOTAL_RECETTE")
	private String tempstotal_recette;


	@Column(name = "RECETTEPRENIUM_RECETTE")
	private boolean recettepremium_recette;

	@Column(name = "DATE_RECETTE")
	private LocalDate date_recette;

	@Column(name = "NBVUE")
	private Long nbvuerecette;
	
	@Column(name = "NBLIKE")
	private Long nblike;
	
	@Column(name = "NOTEMOYENNE") //, columnDefinition = "LONG DEFAULT 0"
	private Long notemoyenne;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "id_recette")
	private List<Ingredient> listIngredient = new ArrayList<>();
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "id_recette")
	private List<Etape> listEtape = new ArrayList<>();
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "id_recette")
	private List<Commentaire> listCommentaire = new ArrayList<>();
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "id_recette")
	private List<Gallerie> listGalerie = new ArrayList<>();
	
	













	public Recette(Long id_recette, Long id_utilisateur, String titre_recette, String description_recette,
			String categorie_recette, String nbpersonne_recette, String niveaudifficulte_recette,
			String tempspreparation_recette, String tempscuisson_recette, String tempstotal_recette,
			boolean recettepremium_recette, LocalDate date_recette, Long nbvuerecette, Long nblike, Long notemoyenne,
			List<Ingredient> listIngredient, List<Etape> listEtape, List<Commentaire> listCommentaire,
			List<Gallerie> listGalerie) {
		super();
		this.id_recette = id_recette;
		this.id_utilisateur = id_utilisateur;
		this.titre_recette = titre_recette;
		this.description_recette = description_recette;
		this.categorie_recette = categorie_recette;
		this.nbpersonne_recette = nbpersonne_recette;
		this.niveaudifficulte_recette = niveaudifficulte_recette;
		this.tempspreparation_recette = tempspreparation_recette;
		this.tempscuisson_recette = tempscuisson_recette;
		this.tempstotal_recette = tempstotal_recette;
		this.recettepremium_recette = recettepremium_recette;
		this.date_recette = date_recette;
		this.nbvuerecette = nbvuerecette;
		this.nblike = nblike;
		this.notemoyenne = notemoyenne;
		this.listIngredient = listIngredient;
		this.listEtape = listEtape;
		this.listCommentaire = listCommentaire;
		this.listGalerie = listGalerie;
	}







	public Long getNotemoyenne() {
		return notemoyenne;
	}







	public void setNotemoyenne(Long notemoyenne) {
		this.notemoyenne = notemoyenne;
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







	public String getTitre_recette() {
		return titre_recette;
	}







	public void setTitre_recette(String titre_recette) {
		this.titre_recette = titre_recette;
	}







	public String getDescription_recette() {
		return description_recette;
	}







	public void setDescription_recette(String description_recette) {
		this.description_recette = description_recette;
	}







	public String getCategorie_recette() {
		return categorie_recette;
	}







	public void setCategorie_recette(String categorie_recette) {
		this.categorie_recette = categorie_recette;
	}







	public String getNbpersonne_recette() {
		return nbpersonne_recette;
	}







	public void setNbpersonne_recette(String nbpersonne_recette) {
		this.nbpersonne_recette = nbpersonne_recette;
	}







	public String getNiveaudifficulte_recette() {
		return niveaudifficulte_recette;
	}







	public void setNiveaudifficulte_recette(String niveaudifficulte_recette) {
		this.niveaudifficulte_recette = niveaudifficulte_recette;
	}







	public String getTempspreparation_recette() {
		return tempspreparation_recette;
	}







	public void setTempspreparation_recette(String tempspreparation_recette) {
		this.tempspreparation_recette = tempspreparation_recette;
	}







	public String getTempscuisson_recette() {
		return tempscuisson_recette;
	}







	public void setTempscuisson_recette(String tempscuisson_recette) {
		this.tempscuisson_recette = tempscuisson_recette;
	}







	public String getTempstotal_recette() {
		return tempstotal_recette;
	}







	public void setTempstotal_recette(String tempstotal_recette) {
		this.tempstotal_recette = tempstotal_recette;
	}







	public boolean isRecettepremium_recette() {
		return recettepremium_recette;
	}







	public void setRecettepremium_recette(boolean recettepremium_recette) {
		this.recettepremium_recette = recettepremium_recette;
	}







	public LocalDate getDate_recette() {
		return date_recette;
	}







	public void setDate_recette(LocalDate date_recette) {
		this.date_recette = date_recette;
	}







	public Long getNbvuerecette() {
		return nbvuerecette;
	}







	public void setNbvuerecette(Long nbvuerecette) {
		this.nbvuerecette = nbvuerecette;
	}







	public Long getNblike() {
		return nblike;
	}







	public void setNblike(Long nblike) {
		this.nblike = nblike;
	}







	public List<Ingredient> getListIngredient() {
		return listIngredient;
	}







	public void setListIngredient(List<Ingredient> listIngredient) {
		this.listIngredient = listIngredient;
	}







	public List<Etape> getListEtape() {
		return listEtape;
	}







	public void setListEtape(List<Etape> listEtape) {
		this.listEtape = listEtape;
	}







	public List<Commentaire> getListCommentaire() {
		return listCommentaire;
	}







	public void setListCommentaire(List<Commentaire> listCommentaire) {
		this.listCommentaire = listCommentaire;
	}







	public List<Gallerie> getListGalerie() {
		return listGalerie;
	}







	public void setListGalerie(List<Gallerie> listGalerie) {
		this.listGalerie = listGalerie;
	}







	public Recette() {
		super();
	}


	
	
//	 @OneToMany(fetch = FetchType.LAZY, mappedBy = "id_ingredient")
//	 private List<Ingredient> lisingredients= new ArrayList<>();







	/*
	 * @ManyToMany(fetch = FetchType.LAZY, cascade = {CascadeType.DETACH,
	 * CascadeType.MERGE, CascadeType.REFRESH, CascadeType.PERSIST} )
	 * 
	 * 
	 * 
	 * private List<Ingredient> ingredients = new ArrayList<>();
	 */
	 

	// Getter and Setter


}
