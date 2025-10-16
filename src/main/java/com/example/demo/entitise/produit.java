package com.example.demo.entitise;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class produit {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idproduct;
	private String nomproduit;
	private Double prixProduit;
	private Date dateCreation;

@Override
	public String toString() {
		return "produit [idproduct=" + idproduct + ", nomproduit=" + nomproduit + ", prixProduit=" + prixProduit
				+ ", dateCreation=" + dateCreation + "]";
	}
public String getNomproduit() {
		return nomproduit;
	}
	public void setNomproduit(String nomproduit) {
		this.nomproduit = nomproduit;
	}
	public Double getPrixProduit() {
		return prixProduit;
	}
	public void setPrixProduit(Double prixProduit) {
		this.prixProduit = prixProduit;
	}
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
}