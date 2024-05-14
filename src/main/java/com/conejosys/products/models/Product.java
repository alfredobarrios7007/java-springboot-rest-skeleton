package com.conejosys.products.models;

import java.io.Serializable;
import jakarta.persistence.*;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonBackReference;


/**
 * The persistent class for the products database table.
 * 
 */
@Entity
@Table(name="products")
@NamedQuery(name="Product.findAll", query="SELECT p FROM Product p")
public class Product implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private byte active;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="CREATE_DATE")
	private Date createDate;

	private String description;

	private String uuid;

	/*
	//bi-directional many-to-one association to Producttype
	@JsonBackReference
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="ProductTypeId")
	private Producttype producttype;
	*/
	
	private int producttypeid;
	

	/**
	 * @return the producttypeid
	 */
	public int getProductTypeId() {
		return producttypeid;
	}

	/**
	 * @param producttypeid the producttypeid to set
	 */
	public void setProductTypeId(int producttypeid) {
		this.producttypeid = producttypeid;
	}

	public Product() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public byte getActive() {
		return this.active;
	}

	public void setActive(byte active) {
		this.active = active;
	}

	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getUuid() {
		return this.uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	/*
	public Producttype getProducttype() {
		return this.producttype;
	}

	public void setProducttype(Producttype producttype) {
		this.producttype = producttype;
	}
    */
	
	@Override
	public String toString() {
		return "Product [id=" + id + ", active=" + active + ", "
				+ (createDate != null ? "createDate=" + createDate + ", " : "")
				+ (description != null ? "description=" + description + ", " : "")
				+ (uuid != null ? "uuid=" + uuid + ", " : "")
				+ "producttypeid=" + producttypeid + "]";
	}	

}