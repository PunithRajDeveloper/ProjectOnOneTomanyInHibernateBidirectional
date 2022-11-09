package com.ty.oneTomany.controller;

import java.util.ArrayList;
import java.util.List;

import com.ty.oneTomanyDAO.ShoppingCartDao;
import com.ty.oneTomanyDTO.Items;
import com.ty.oneTomanyDTO.ShoppingCart;

public class ShoppintCartConteroller {
public static void main(String[] args) {
//	 ShoppingCart cart=new ShoppingCart();
//	 cart.setName("punith");
//	 cart.setEmail("punith@gmail.com");
//	 cart.setAdress("Bangalore");
//	 cart.setId(1);
//	 
//	 
//	 Items items=new Items();
//	 items.setId(101);
//	 items.setName("iphone");
//	 items.setPrice(130000);
//	 items.setManufac("Apple");
//	 items.setCart(cart);
//	 
//	 Items items2=new Items();
//	 items2.setId(102);
//	 items2.setManufac("dell");
//	 items2.setPrice(250000);
//	 items2.setName("laptop");
//	 items2.setCart(cart);
//	 
//	 
//	 List<Items> items3=new ArrayList<Items>();
//	 
//	 items3.add(items2);
//	 items3.add(items);
//	 
//	 cart.setItems(items3);
//	 
	 
	 ShoppingCartDao cartDao=new ShoppingCartDao();
	// cartDao.saveShoppingCart(cart);
	 ShoppingCart cart=cartDao.getShoppingCart(1);
	 System.out.println(cart);
}
}
