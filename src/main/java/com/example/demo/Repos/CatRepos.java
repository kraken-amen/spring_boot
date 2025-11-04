package com.example.demo.Repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entitise.Catégorie;
import com.example.demo.entitise.produit;

public interface CatRepos extends JpaRepository<Catégorie, Long>{

}
