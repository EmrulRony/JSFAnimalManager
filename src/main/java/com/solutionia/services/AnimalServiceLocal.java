package com.solutionia.services;

import java.util.List;

import javax.ejb.Local;

import com.solutionia.model.Animal;

@Local
public interface AnimalServiceLocal {
	public List<Animal> getAnimals();
	public void deleteAnimal(int id);
	public void updateAnimal(Animal animal);

}
