package com.produits.service;

import com.example.demo.entitise.produit;
import java.util.List;

public interface ProduitService {
	produit saveProduit(produit p);
	produit updateProduit(produit p);
	void deleteProduit(produit p);
	void deleteProduitById(Long id); 
	produit getProduit(Long id); 
	List<produit> getAllProduits(); 

}
