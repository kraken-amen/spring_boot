package com.example.demo.Repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entitise.produit;
@Repository
public interface ProdRepository extends JpaRepository<produit, Long>{
produit findByNomProduit(String nomProduit);
}
