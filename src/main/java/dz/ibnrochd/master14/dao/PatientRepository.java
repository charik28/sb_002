package dz.ibnrochd.master14.dao;

import dz.ibnrochd.master14.model.Consultation;
import dz.ibnrochd.master14.model.RendezVous;
import org.apache.ibatis.annotations.*;


import dz.ibnrochd.master14.model.Patient;

import java.util.List;
import java.util.Optional;

@Mapper
public interface PatientRepository   {

	// TODOs ajouter la signature d'une méthode pour rechercher des patients par leurs noms (convention Spring Data)

    @Select("SELECT id, nom, prenom, sexe, date_naissance, numero_telephone, adresse FROM cabinet.patient where nom = #{nom}")
    List<Patient> findByNom(String nom);

    @Results(id="PatientResultMap" ,value = {
            @Result(property = "id", column = "id"),

            @Result(property = "nom", column = "nom"),

            @Result(property = "prenom", column = "prenom"),
            @Result(property = "sexe", column = "sexe"),
            @Result(property = "dateNaissance", column = "date_naissance"),

      //      @Result(property = "consultations", column = "id", many = @Many(select = "findConsultationsByPatientId")),
       //     @Result(property = "rendezVous", column = "id", many = @Many(select = "findRendezVousByPatientId"))
    })
    @Select("select * from cabinet.patient")
    List<Patient> findAll();

    @Select("SELECT * FROM cabinet.consultation WHERE id_patient = #{patientId}")
    List<Consultation> findConsultationsByPatientId(int patientId);

    @Select("SELECT * FROM cabinet.rendez_vous WHERE id_patient = #{patientId}")
    List<RendezVous> findRendezVousByPatientId(int patientId);


    void insert(Patient p);


    void delete(int id);
}
