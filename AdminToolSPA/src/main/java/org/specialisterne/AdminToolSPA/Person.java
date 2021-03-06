package org.specialisterne.AdminToolSPA;

import java.util.List;

public class Person {
	private int id;
	private String vorname;
	private String nachname;
	private List<String> telefonNummern;
	private Adresse adresse;
	private String mail;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getVorname() {
		return vorname;
	}
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}
	public String getNachname() {
		return nachname;
	}
	public void setNachname(String nachname) {
		this.nachname = nachname;
	}
	public List<String> getTelefonNummern() {
		return telefonNummern;
	}
	public void setTelefonNummern(List<String> telefonNummern) {
		this.telefonNummern = telefonNummern;
	}
	public Adresse getAdresse() {
		return adresse;
	}
	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
}
