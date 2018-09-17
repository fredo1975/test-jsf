package fr.bluechipit.testJSF.entity;

import java.io.Serializable;

public class Contrat implements Serializable{

	private static final long serialVersionUID = 1L;

	private Long contratId;
	private String hubId;
	private String auteur;
	private String compteNo;
	
	
	public Contrat() {
	}
	public Long getContratId() {
		return contratId;
	}
	public void setContratId(Long contratId) {
		this.contratId = contratId;
	}
	public String getHubId() {
		return hubId;
	}
	public void setHubId(String hubId) {
		this.hubId = hubId;
	}
	public String getAuteur() {
		return auteur;
	}
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}
	public String getCompteNo() {
		return compteNo;
	}
	public void setCompteNo(String compteNo) {
		this.compteNo = compteNo;
	}
	
}
