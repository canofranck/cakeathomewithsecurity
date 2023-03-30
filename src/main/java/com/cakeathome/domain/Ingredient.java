package com.cakeathome.domain;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity 
@Table(name="INGREDIENT")
//@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id_ingredient")
public class Ingredient  implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name = "ID_INGREDIENT")
	private Long id_ingredient;
	
	@Column(name = "ID_RECETTE")
	private Long id_recette;
	@Column(name = "QUANTITEINGREDIENT")
	private String quantiteingredient;


	public Ingredient() {
		super();
	}


	public Long getId_ingredient() {
		return id_ingredient;
	}


	public void setId_ingredient(Long id_ingredient) {
		this.id_ingredient = id_ingredient;
	}


	public Long getId_recette() {
		return id_recette;
	}


	public void setId_recette(Long id_recette) {
		this.id_recette = id_recette;
	}


	public String getQuantiteingredient() {
		return quantiteingredient;
	}


	public void setQuantiteingredient(String quantiteingredient) {
		this.quantiteingredient = quantiteingredient;
	}


	public Ingredient(Long id_ingredient, Long id_recette, String quantiteingredient) {
		super();
		this.id_ingredient = id_ingredient;
		this.id_recette = id_recette;
		this.quantiteingredient = quantiteingredient;
	}







	/*
	 * @OneToMany(fetch = FetchType.LAZY, mappedBy = "id_recetteingredients")
	 * private List<RecetteIngredients> listRecetteIngredients= new ArrayList<>();
	 */

	


	
	


	// ASSOCIATION
	/*
	 * @ManyToOne(cascade = CascadeType.ALL)
	 * 
	 * @JoinColumn(name = "id_recette") private Recette recette;
	 */

	/*
	 * @ManyToMany(cascade = CascadeType.ALL, mappedBy = "id_recette") private
	 * List<Recette> recettes= new ArrayList<>();
	 */


	  
	 
	// GETTER
	
	

	
	
	
	
	
	
	
	

}
