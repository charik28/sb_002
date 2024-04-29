package dz.ibnrochd.master14.business;

import dz.ibnrochd.master14.dao.PatientRepository;
import dz.ibnrochd.master14.model.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @project sb_002
 * @Author Abdessamie Charik on 28/04/2024
 */
@Service
public class ConsultationService implements ConsultationServiceI {

    @Autowired
    PatientRepository patientRepository;

    @Override
    public Patient creerPatient(Patient patient){

        patientRepository.insert(patient);

        return  patient;

    }

    @Override
    public boolean supprimerPatient(Patient patient){

        patientRepository.delete(patient.getId());

        return  true;
    }


}
