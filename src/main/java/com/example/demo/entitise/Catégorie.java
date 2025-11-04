package com.example.demo.entitise;
import java.util.ArrayList;
import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Catégorie {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String Nom;
	private String description;
	public Catégorie() {}
	public Catégorie(Long idproduct, String nom, String description) {
		super();
		this.id = idproduct;
		Nom = nom;
		this.description = description;
	}
	public Long getIdproduct() {
		return id;
	}
	public void setIdproduct(Long idproduct) {
		this.id = idproduct;
	}
	public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		Nom = nom;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Catégorie [idproduct=" + id + ", Nom=" + Nom + ", description=" + description + "]";
	}
	@OneToMany(mappedBy="categorie")
	private List<produit> produits=new ArrayList<>();
	
	
}
