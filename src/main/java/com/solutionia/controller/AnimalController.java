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
@RequestScoped
public class AnimalController implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@EJB
	AnimalServiceLocal animalService;
	private List<Animal> animalList;
	
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
	public String deleteAnimal(int animalId) {
		animalService.deleteAnimal(animalId);
		animalList=animalService.getAnimals();
		return null;
	}
	
	@PreDestroy
	void destroy() {
		System.out.println("Bean destroyed!!");
	}

}
