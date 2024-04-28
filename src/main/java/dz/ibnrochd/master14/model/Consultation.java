package dz.ibnrochd.master14.model;


import java.util.Date;

//@Entity
//@Table(schema = "cabinet", name = "consultation")
public class Consultation extends BaseModel {

	private static final long serialVersionUID = -3669998604878710274L;

	//
	private Long id;

	private String motif ;


	private Date dateConsultation;

	private  Patient patient;
	public void setId(Long id) {
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public String getMotif() {
		return motif;
	}

	public Date getDateConsultation() {
		return dateConsultation;
	}

	public Patient getPatient() {
		return patient;
	}

	public Consultation(Long id, String motif, Date dateConsultation) {
		this.id = id;
		this.motif = motif;
		this.dateConsultation = dateConsultation;
	}

	public void setMotif(String motif) {
		this.motif = motif;
	}

	public void setDateConsultation(Date dateConsultation) {
		this.dateConsultation = dateConsultation;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	@Override
	public String toString() {
		return "Consultation{" +
				"id=" + id +
				", motif='" + motif + '\'' +
				", dateConsultation=" + dateConsultation +
				", patient=" + patient +
				'}';
	}
}
