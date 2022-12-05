package com.codes.ivandeoliveira.ProductStock.ententies;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "tb_product")
public class Product implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private Instant mDate;
	private Instant eDate;
	
	private Stock stock; 
	
	public Product() {
	
}

	public Product(String name, Instant mDate, Instant eDate) {
		this.name = name;
		this.mDate = mDate;
		this.eDate = eDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Instant getmDate() {
		return mDate;
	}

	public void setmDate(Instant mDate) {
		this.mDate = mDate;
	}

	public Instant geteDate() {
		return eDate;
	}

	public void seteDate(Instant eDate) {
		this.eDate = eDate;
	}

	public Stock setStock (Stock stock) {
		return stock;
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return id == other.id;
	}
	
	
	
	
}