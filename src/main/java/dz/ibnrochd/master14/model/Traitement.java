package dz.ibnrochd.master14.model;




public class Traitement extends BaseModel {

	private static final long serialVersionUID = 8248365590951840055L;

	private String nom;

	public Traitement(long id) {
		this.setId(id);
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getNom() {
		return nom;
	}
}
