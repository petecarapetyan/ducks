package org.catchup.ducks.domain;

import java.util.UUID;

public class Duck {
	private String id;
	private String name;
	private String color;
	
	public Duck(String name, String color) {
		super();
		this.id = UUID.randomUUID().toString();
		this.name = name;
		this.color = color;
	}
	@Override
	public String toString() {
		return "Duck [id=" + id + ", name=" + name + ", color=" + color + "]";
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

}
