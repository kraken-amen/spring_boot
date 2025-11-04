package com.example.demo;
import java.sql.Date;
import java.util.List;
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
			produit prod=new produit("PC DELL",2200.500,new Date(System.currentTimeMillis()));
		prodRepos.save(prod);
	}
	@Test
	 public void testFindProduit() {
	 produit p = prodRepos.findById(12L).get();
	 System.out.println(p); }
	 @Test 
	public void testUpdateProduit() { 
	produit p = prodRepos.findById(12L).get(); 
	p.setPrixProduit(1000.0); 
	prodRepos.save(p);} 
	@Test
	 public void testDeleteProduit()
	{ prodRepos.deleteById(12L); } 
	@Test 
	public void testListerTousProduits() { 
	List<produit> prods = prodRepos.findAll();
	for (produit p : prods) {
	 System.out.println(p);
	} }


}
