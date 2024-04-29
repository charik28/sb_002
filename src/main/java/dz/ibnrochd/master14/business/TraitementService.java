package dz.ibnrochd.master14.business;

import dz.ibnrochd.master14.Sb002Application;
import dz.ibnrochd.master14.dao.TraitmentRepository;
import dz.ibnrochd.master14.model.Traitement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @project sb_002
 * @Author Abdessamie Charik on 28/04/2024
 */
@Service
public class TraitementService implements TraitementServiceI {

    @Autowired
    TraitmentRepository traitmentRepository;


 @Override
 public  List<Traitement> findAll(){

        return traitmentRepository.findAll();
    }

    @Override
    public boolean supprimerTraitement(Traitement traitement){

        if(traitement.getId() == null) {
            System.err.println("nom must not be null");
            return false;
        }
        traitmentRepository.delete(traitement);

        return true;
    }

    @Override
    public void creerTraitment(Traitement traitement) {

        if(traitement.getNom() == null) {
            System.err.println("nom must not be null");
            return;
            //throw new RuntimeException("nom must not be null");
        }

        traitmentRepository.insertTraitment(traitement);
    }
}
