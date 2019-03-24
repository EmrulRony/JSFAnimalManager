package com.solutionia.services;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import com.solutionia.model.AnimalOLD;

@Named
@RequestScoped
public class AnimalBean {
	private List<AnimalOLD> animalList;
	
	@PostConstruct
	void init() {
		animalList = new ArrayList<AnimalOLD>();
		animalList.add(new AnimalOLD(1,"Bengle Tiger","Panthera tigris",400));
		animalList.add(new AnimalOLD(2,"BLion","Panthera leo",100));
		animalList.add(new AnimalOLD(3,"Elephant","Elephas maximus",700));
	}

	public List<AnimalOLD> getAnimalList() {
		return animalList;
	}

	public void setAnimalList(List<AnimalOLD> animalList) {
		this.animalList = animalList;
	}
}
