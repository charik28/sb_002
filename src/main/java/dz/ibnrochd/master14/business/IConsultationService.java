package dz.ibnrochd.master14.business;

import dz.ibnrochd.master14.model.Patient;

/**
 * @project sb_002
 * @Author Abdessamie Charik on 29/04/2024
 */
public interface IConsultationService {
    Patient creerConsultation(Patient patient);

    boolean supprimerConsultation(Patient patient);
}
