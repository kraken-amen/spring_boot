package com.example.demo;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.Repos.ProdRepos;
import com.example.demo.entitise.produit;

@SpringBootTest
class GestionProduitApplicationTests {
	@Autowired
		private ProdRepos prodRepos;
	@Test
	public void testCreateProduit()
	{
		produit prod=new produit("PC DELL",2200.500,new Date());
		prodRepos.save(prod);
	}

}
