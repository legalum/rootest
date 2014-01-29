package com.leo.rootest.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the rootest database table.
 * 
 */
@Entity
@Table(name = "rootest")
@NamedQuery(name="Rootest.findAll", query="SELECT r FROM Rootest r")
public class Rootest implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id" ,insertable=false, updatable = false)
	private Integer id;

	private String nom;

	private String prenom;

	public Rootest() {
	}
	
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return this.prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

}