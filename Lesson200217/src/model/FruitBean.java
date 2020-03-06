package model;

import java.io.Serializable;

public class FruitBean implements Serializable{
	private String name;
	private int price;

	public FruitBean() {
		super();
	}

	public FruitBean(String name, int price) {
		super();
		this.name = name;
		this.price = price;
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


}
