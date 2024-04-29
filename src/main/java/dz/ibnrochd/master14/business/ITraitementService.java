package dz.ibnrochd.master14.business;

import dz.ibnrochd.master14.model.Traitement;

import java.util.List;

/**
 * @project sb_002
 * @Author Abdessamie Charik on 29/04/2024
 */
public interface ITraitementService {
    List<Traitement> findAll();

    boolean supprimerTraitement(Traitement traitement);

    void creerTraitment(Traitement traitement);
}
