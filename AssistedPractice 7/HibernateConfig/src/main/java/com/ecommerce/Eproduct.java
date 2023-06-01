package com.ecommerce;

import java.math.BigDecimal;
import java.util.*;


public class Eproduct {

	
	private long ID;
	private String name;

	private BigDecimal price;

	private Date dateAdded;
	
	
	//Component mapping
	
	ProductParts parts;
	
	public ProductParts getParts() {
		return parts;
	}

	public void setParts(ProductParts parts) {
		this.parts = parts;
	}
	
	
	
	
	//Collection mapping
	
	private List<Color> colors;

	private Set<OS> os;

	private Collection<ScreenSizes> screenSizes;

	private Map finance;

	public Eproduct() {

	}
	public long getID() {
		return ID;
	}

	public void setID(long iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Date getDateAdded() {
		return dateAdded;
	}

	public void setDateAdded(Date dateAdded) {
		this.dateAdded = dateAdded;
	}
	public List<Color> getColors() {
		return colors;
	}
	public void setColors(List<Color> colors) {
		this.colors = colors;
	}
	public Set<OS> getOS() {
		return os;
	}
	public void setOS(Set<OS> os) {
		this.os = os;
	}
	public Collection<ScreenSizes> getScreenSizes() {
		return screenSizes;
	}
	public void setScreenSizes(Collection<ScreenSizes> screenSizes) {
		this.screenSizes = screenSizes;
	}
	public Set<OS> getOs() {
		return os;
	}
	public void setOs(Set<OS> os) {
		this.os = os;
	}
	public Map getFinance() {
		return finance;
	}
	public void setFinance(Map finance) {
		this.finance = finance;
	}

}