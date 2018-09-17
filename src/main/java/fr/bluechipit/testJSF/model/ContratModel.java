package fr.bluechipit.testJSF.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import fr.bluechipit.testJSF.entity.Contrat;
@Component
@Scope("singleton")
public class ContratModel {

	private Contrat contrat;
	private Long contratId;
	public Contrat getContrat() {
		return contrat;
	}
	public void setContrat(Contrat contrat) {
		this.contrat = contrat;
	}
	public Long getContratId() {
		return contratId;
	}
	public void setContratId(Long contratId) {
		this.contratId = contratId;
	}
	
}
