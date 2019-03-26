package com.solutionia.services;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import com.solutionia.model.Animal;

@Stateless
public class AnimalService implements AnimalServiceLocal {
	
	@PersistenceContext
	EntityManager em;

	@Override
	public List<Animal> getAnimals() {
		TypedQuery<Animal> query= em.createNamedQuery("Animal.findAll", Animal.class);
		return query.getResultList(); 
	}

	@Override
	public void deleteAnimal(int id) {
		Animal animal=em.find(Animal.class, id);
		if (animal !=null) {
			em.remove(animal);	
		}
		
	}

	@Override
	public void updateAnimal(Animal animal) {
		em.merge(animal);
	}

}
