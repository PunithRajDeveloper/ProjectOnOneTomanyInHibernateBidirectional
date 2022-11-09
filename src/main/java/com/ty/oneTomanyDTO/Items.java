package com.ty.oneTomanyDTO;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Items {
	
	@Id
private int id;
private String name;
private int price;
private String manufac;

@ManyToOne
@JoinColumn
private ShoppingCart  cart;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getPrice() {
	return price;
}

public void setPrice(int price) {
	this.price = price;
}

public String getManufac() {
	return manufac;
}

public void setManufac(String manufac) {
	this.manufac = manufac;
}

public ShoppingCart getCart() {
	return cart;
}

public void setCart(ShoppingCart cart) {
	this.cart = cart;
}

@Override
public String toString() {
	return "Items [id=" + id + ", name=" + name + ", price=" + price + ", manufac=" + manufac + "]";
}



}
