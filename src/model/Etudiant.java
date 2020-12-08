package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the etudiants database table.
 * 
 */
@Entity
@Table(name="etudiants")
@NamedQuery(name="Etudiant.findAll", query="SELECT e FROM Etudiant e")
@NamedQuery(name="Etudiant.findOne",query="SELECT e FROM Etudiant e WHERE e.cin=:cin")
public class Etudiant implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int cin;

	@Column(name="adresse_postale")
	private String adressePostale;

	private String email;

	private String nom;

	@Column(name="num_inscription")
	private int numInscription;

	@Column(name="num_tel")
	private int numTel;

	private String prenom;

	public Etudiant() {
	}

	public int getCin() {
		return this.cin;
	}

	public void setCin(int cin) {
		this.cin = cin;
	}

	public String getAdressePostale() {
		return this.adressePostale;
	}

	public void setAdressePostale(String adressePostale) {
		this.adressePostale = adressePostale;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getNumInscription() {
		return this.numInscription;
	}

	public void setNumInscription(int numInscription) {
		this.numInscription = numInscription;
	}

	public int getNumTel() {
		return this.numTel;
	}

	public void setNumTel(int numTel) {
		this.numTel = numTel;
	}

	public String getPrenom() {
		return this.prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

}