package com.ty.oneTomanyDAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.oneTomanyDTO.Items;

public class ItemsDao {
public void saveItems(Items items) {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("punith");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	
	
	
}
}
