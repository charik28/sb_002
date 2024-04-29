package dz.ibnrochd.master14;

import dz.ibnrochd.master14.business.TraitementService;
import dz.ibnrochd.master14.dao.*;
import dz.ibnrochd.master14.model.*;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Scanner;


@SpringBootApplication
public class Sb002Application implements CommandLineRunner {
	/*
	@Autowired
	PatientRepository patientRepository;
	
	// TODOf : déclarer les autres repository de la même façon que PatientRepository

	@Autowired
	ConsultationRepository consultationRepository;

	@Autowired
	RendezVousRepository rendezVousRepository;

	@Autowired
	TraitmentRepository traitmentRepository;

	@Autowired
	LigneConsultationMapper  ligneConsultationMapper;
*/

	@Autowired
	TraitementService traitementService;

	public static void main(String[] args) {
		SpringApplication.run(Sb002Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {


		Scanner scanner = new Scanner(System.in);
		/*
		// TODOf : récupérer la liste de tous les patients puis afficher leurs noms


		List<Patient> patients = patientRepository.findAll();

		for (Patient p :patients
			 ) {
			println(p.getNom());
		}
		
		// TODOf : rechercher les patients ayant le nom "Yahi" puis leurs prénoms

		  patients = patientRepository.findByNom("Yahi");

		for (Patient p :patients
		) {
			println(p);
		}
		// TODO : créer un nouveau patient (valeurs au choix)  PUIS enregistrer-le

		Patient p = new Patient(230676 , "Charik" , "Abdessamie" , "M" ,new Date("01/01/1995")   ,
				"123456" , "Msila");

		//patientRepository.insert(p);
		// TODOf : rechercher la consultation ayant id=3

		Consultation c =  consultationRepository.findById(3);

		// TODOf : parcourir les lignes de la consultation trouvée et afficher les noms des médicaments

		List<LigneConsultation>  ligneConsultations=ligneConsultationMapper.findById(c.getId());

		for (LigneConsultation ligne : ligneConsultations
			 ) {
			println(ligne);

		}

		*/

		boolean insertTraitment ;
		do {
			println("entrer un id pour nouvel traitement --> ");

			Traitement traitement = new Traitement(scanner.nextLong());

			println("entrer un nom pour nouvel traitement? --> ");
			traitement.setNom(scanner.next());

			traitementService.creerTraitment(traitement);



			println("ajouter encours nouvel traitement? --> ");

			insertTraitment =scanner.nextBoolean();

		}while (insertTraitment );

		println("choisi un id pour supprimer traitement? --> ");
		printList(traitementService.findAll());

		Traitement traitement = new Traitement(scanner.nextLong());

		traitementService.supprimerTraitement(traitement);


		
	}

	public static void println(Object o){
		System.out.println(o);
	}

	static  void printList(List<Traitement> list){
		for (Traitement traitement : list
		) {
			println(traitement);

		}
	}


}
