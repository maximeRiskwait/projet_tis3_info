package princetonPlainsboro;

import java.util.ArrayList;
import projet.ui.*; 

class Test {

    public static void main(String[] args) {
        LectureXML test = new LectureXML("dossiers.xml");
        DossierMedical dm = test.getDossier();
        new Connexion("test", dm).setVisible(true);

        //FenetrePatMed fpm = new FenetrePatMed(dm);
        //NouvelleFicheDeSoins nfds = new NouvelleFicheDeSoins("Nouvelle fiche de soins", dm, p1); 
        //new AcceuilAdmin("Accueil", dm);
        //new UiDMP(dm, dm.getListe_patient().get(0));
        
       
    }
}
