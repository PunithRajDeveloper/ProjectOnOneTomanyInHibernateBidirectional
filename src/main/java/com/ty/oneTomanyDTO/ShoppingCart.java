package com.ty.oneTomanyDTO;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class ShoppingCart {
	
	@Id
 private int id;
 private String name;
 private String adress;
 private String email;
 
 @OneToMany(mappedBy = "cart")
 private List<Items> items;

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

public String getAdress() {
	return adress;
}

public void setAdress(String adress) {
	this.adress = adress;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public List<Items> getItems() {
	return items;
}

public void setItems(List<Items> items) {
	this.items = items;
}

@Override
public String toString() {
	return "ShoppingCart [id=" + id + ", name=" + name + ", adress=" + adress + ", email=" + email + ", items=" + items
			+ "]";
}
 
 
 
}
