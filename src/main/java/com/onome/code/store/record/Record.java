package com.onome.code.store.record;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import io.onome.code.model.Buyer;
import io.onome.code.model.Product;

@Document(collection="Records")
public class Record {
@Id	
private String id;
private String username;
private Date purchase;
private Date recieved;
private Product item;
private String store;
private Buyer buyer;

	public Record() {
	
	}
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getPurchase() {
		return purchase;
	}

	public void setPurchase(Date purchase) {
		this.purchase = purchase;
	}

	public Date getRecieved() {
		return recieved;
	}

	public void setRecieved(Date recieved) {
		this.recieved = recieved;
	}

	public Product getItem() {
		return item;
	}

	public void setItem(Product item) {
		this.item = item;
	}

	public Buyer getBuyer() {
		return buyer;
	}

	public void setBuyer(Buyer buyer) {
		this.buyer = buyer;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getStore() {
		return store;
	}
	public void setStore(String store) {
		this.store = store;
	}


	
}
