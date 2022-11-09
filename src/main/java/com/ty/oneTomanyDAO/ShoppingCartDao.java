package com.ty.oneTomanyDAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.oneTomanyDTO.Items;
import com.ty.oneTomanyDTO.ShoppingCart;

public class ShoppingCartDao {

	public void saveShoppingCart(ShoppingCart cart) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("punith");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		entityTransaction.begin();
		
		entityManager.persist(cart);
		
		List<Items> items=cart.getItems();
		for(Items items2:items) {
			entityManager.persist(items2);
		}
		
		
		entityTransaction.commit();
		
		
	}
	
	public ShoppingCart  getShoppingCart(int id) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("punith");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		ShoppingCart cart=entityManager.find(ShoppingCart.class, id);
		
		return cart;
		
	}
}
