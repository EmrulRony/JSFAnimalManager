package com.solutionia.controller;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import com.solutionia.model.Animal;
import com.solutionia.services.AnimalServiceLocal;

@Named
@ViewScoped
public class AnimalController implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@EJB
	AnimalServiceLocal animalService;
	private List<Animal> animalList;
	private Animal currentAnimal;
	
	public AnimalController() {
		System.out.println("JSF Bean created");
	}
	@PostConstruct
	void init() {
		animalList=animalService.getAnimals();
	}
	public List<Animal> getAnimalList() {
		return animalList;
	}
	public void setAnimalList(List<Animal> animalList) {
		this.animalList = animalList;
	}
	
	// This method deletes animal row from animal table
	public String deleteAnimal(int animalId) {
		animalService.deleteAnimal(animalId);
		animalList=animalService.getAnimals();
		return null;
	}
	// This method updates animal table in the database
	public String modifyAnimal() {
		animalService.updateAnimal(currentAnimal);
		animalList=animalService.getAnimals();
		return null;
	}
	
	public Animal getCurrentAnimal() {
		return currentAnimal;
	}
	public void currentAnimal(Animal currentAnimal) {
		this.currentAnimal = currentAnimal;
	}
	@PreDestroy
	void destroy() {
		System.out.println("Bean destroyed!!");
	}


}
