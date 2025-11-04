package com.produits.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repos.ProdRepos;
import com.example.demo.entitise.produit;
import java.util.List;

@Service
public class ProduitServiceImpl implements ProduitService{
	@Autowired
	ProdRepos prodRepos; 
	@Override 
	public produit saveProduit(produit p) { 
	return prodRepos.save(p); 
	}
	@Override 
	public produit updateProduit(produit p) { 
	return prodRepos.save(p); 
	} 
	@Override 
	public void deleteProduit(produit p) { 
		prodRepos.delete(p); 
	} 
	@Override 
	public void deleteProduitById(Long id) { 
		prodRepos.deleteById(id); 
	} 
	@Override 
	public produit getProduit(Long id) {
	return prodRepos.findById(id).get();
	} 
	@Override 
	public List<produit> getAllProduits() { 
	return prodRepos.findAll(); 
	}}

