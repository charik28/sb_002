package dz.ibnrochd.master14.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Patient extends BaseModel {

	private static final long serialVersionUID = -3415388341943341473L;

	@Override
	public String toString() {
		return "Patient{" +
				"id=" + getId() +
				", nom='" + nom + '\'' +
				", prenom='" + prenom + '\'' +
				", sexe='" + sexe + '\'' +
				", dateNaissance=" + dateNaissance +
				", numeroTelephone='" + numeroTelephone + '\'' +
				", adresse='" + adresse + '\'' +
				", consultations=" + consultations +
				", rendezVous=" + rendezVous +
				"}";
	}

	/*private Long id;*/

    private String nom;

    private String prenom;

    private String sexe;


    private Date dateNaissance;

    private String numeroTelephone;

    private String adresse;
    
    private List<Consultation> consultations = new ArrayList<>();
    
    private List<RendezVous> rendezVous = new ArrayList<>();
    
    /////////////////////////////////////////////////////////
    
    public Patient() {		
	}

	public Patient(Long id, String nom, String prenom, String sexe, Date dateNaissance, String numeroTelephone,
			String adresse) {
		super.setId(id );
		this.nom = nom;
		this.prenom = prenom;
		this.sexe = sexe;
		this.dateNaissance = dateNaissance;
		this.numeroTelephone = numeroTelephone;
		this.adresse = adresse;
	}
	
	//////////////////////////////////////////////////////

	/*public Long getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
*/
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	public Date getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public String getNumeroTelephone() {
		return numeroTelephone;
	}

	public void setNumeroTelephone(String numeroTelephone) {
		this.numeroTelephone = numeroTelephone;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public List<Consultation> getConsultations() {
		return consultations;
	}

	public void setConsultations(List<Consultation> consultations) {
		this.consultations = consultations;
	}

	public List<RendezVous> getRendezVous() {
		return rendezVous;
	}

	public void setRendezVous(List<RendezVous> rendezVous) {
		this.rendezVous = rendezVous;
	}

}
