package com.solutionia.model;

public class AnimalOLD {
	private int animalId;
	private String animalName;
	private String scienteficName;
	private int quantity;
	
	public AnimalOLD() {
		
	}
	
	public AnimalOLD(int animalId, String animalName, String scienteficName, int quantity) {
		super();
		this.animalId = animalId;
		this.animalName = animalName;
		this.scienteficName = scienteficName;
		this.quantity = quantity;
	}
	public int getAnimalId() {
		return animalId;
	}
	public void setAnimalId(int animalId) {
		this.animalId = animalId;
	}
	public String getAnimalName() {
		return animalName;
	}
	public void setAnimalName(String animalName) {
		this.animalName = animalName;
	}
	public String getScienteficName() {
		return scienteficName;
	}
	public void setScienteficName(String scienteficName) {
		this.scienteficName = scienteficName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	

}
