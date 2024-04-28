package dz.ibnrochd.master14.model;

import java.io.Serializable;



public class LigneConsultation implements Serializable {

	private static final long serialVersionUID = -1882485395538957648L;
	
	private Long id;



	Consultation consultation;
	Traitement traitement;

	private String posologie;
	private String uniteTemps;
	private String quantite;

	public void setId(Long id) {
		this.id = id;
	}

	public Long getId() {
		return id;
	}
}
