package com.example.Diamondapi;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="diamondinfo")
public class diamondinfo {
	
	@Id
	private String barcode;
	@Column(name="name")
	private String name;
	@Column(name="shape")
	private String shape;
	@Column(name="size")
	private String size;
	@Column(name="clarity")
	private String clarity;
	
	public String getBarcode() {
		return barcode;
	}
	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public diamondinfo() {}
	public diamondinfo(String barcode, String name, String shape, String size, String clarity) {
		super();
		this.barcode = barcode;
		this.name = name;
		this.shape = shape;
		this.size = size;
		this.clarity = clarity;
	}
	public String getShape() {
		return shape;
	}
	public void setShape(String shape) {
		this.shape = shape;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getClarity() {
		return clarity;
	}
	public void setClarity(String clarity) {
		this.clarity = clarity;
	}
	

}
