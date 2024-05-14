package com.conejosys.products.models;

import java.io.Serializable;
import jakarta.persistence.*;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonBackReference;


/**
 * The persistent class for the producttypes database table.
 * 
 */
@Entity
@Table(name="producttypes")
@NamedQuery(name="Producttype.findAll", query="SELECT p FROM Producttype p")
public class Producttype implements Serializable {
	@Override
	public String toString() {
		return "Producttype [id=" + id + ", " + (description != null ? "description=" + description + ", " : "") +  "]";
	}

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String description;
    /*
	//bi-directional many-to-one association to Product
	@JsonBackReference
	@OneToMany(fetch = FetchType.LAZY, mappedBy="producttype")
	private List<Product> products;
    */
	public Producttype() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	/*
	public List<Product> getProducts() {
		return this.products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public Product addProduct(Product product) {
		getProducts().add(product);
		product.setProducttype(this);

		return product;
	}
	public Product removeProduct(Product product) {
		getProducts().remove(product);

		return product;
	}
    */

}