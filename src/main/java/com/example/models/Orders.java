package com.example.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Orders {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private Users user;
	private Product product;
	
	@Override
	public String toString() {
		return "Orders [user=" + user + ", product=" + product + "]";
	}
	public Orders() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Orders(int id, Users user, Product product) {
		super();
		this.id = id;
		this.user = user;
		this.product = product;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Users getUser() {
		return user;
	}
	public void setUser(Users user) {
		this.user = user;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
}
