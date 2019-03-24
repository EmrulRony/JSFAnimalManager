package com.solutionia.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the animal database table.
 * 
 */
@Entity
@NamedQuery(name="Animal.findAll", query="SELECT a FROM Animal a")
public class Animal implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int animalid;

	private String animalname;

	private String scienteficname;

	private int totalnumber;

	public Animal() {
	}

	public int getAnimalid() {
		return this.animalid;
	}

	public void setAnimalid(int animalid) {
		this.animalid = animalid;
	}

	public String getAnimalname() {
		return this.animalname;
	}

	public void setAnimalname(String animalname) {
		this.animalname = animalname;
	}

	public String getScienteficname() {
		return this.scienteficname;
	}

	public void setScienteficname(String scienteficname) {
		this.scienteficname = scienteficname;
	}

	public int getTotalnumber() {
		return this.totalnumber;
	}

	public void setTotalnumber(int totalnumber) {
		this.totalnumber = totalnumber;
	}

}