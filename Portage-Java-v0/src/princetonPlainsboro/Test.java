package princetonPlainsboro;

import java.util.ArrayList;
import projet.ui.*; 

class Test {

    public static void main(String[] args) {
        LectureXML test = new LectureXML("dossiers.xml");
        DossierMedical dm = test.getDossier();
        dm.afficher();
        /*Date date = new Date(13, 06, 1978); 

        System.out.println("\n********\n");

        Patient p1 = new Patient("Bole", "Pat", date, "18 rue de la fac, grenoble", "0656565656", "1298129172");
        dm.ajouterPatient(p1);
        System.out.println("> cout de " + p1.toString() + " : " + dm.coutPatient(p1));

        System.out.println("\n********\n");

        String spe = "Cardiologue";
        System.out.println("> cout de la specialite '" + spe + "' : " + dm.coutSpecialite(spe));

        System.out.println("\n********\n");

        Medecin m1 = new Medecin("Deblouze", "Agathe", "Cardiologue");
        dm.afficherListePatients(m1);

        System.out.println("\n********\n");

        Date d1 = new Date(1, 11, 2005);
        Date d2 = new Date(5, 1, 2006);
        System.out.println("> nombre de fiches entre " + d1 + " et " + d2 + " : " + dm.nombreFichesIntervalle(d1, d2));

        System.out.println("\n********\n");

        System.out.println();
        System.out.println("Dossier trie selon les dates :");
        dm.trierDates();

        System.out.println("\n********\n");

        System.out.println();
        System.out.println("Dossier trie selon les couts :");
        dm.trier(new ComparaisonFichesCouts());*/
         


        //FenetrePatMed fpm = new FenetrePatMed(dm); 
        new Connexion("test", dm).setVisible(true);
        
        /*for(int i = 0; i<dm.getListe_patient().size();i++){
                System.out.println(dm.getListe_patient().get(i).getNom());
        }
        System.out.println("");
        for(int i = 0; i<list_patient.size();i++){
                System.out.println(dm.getListe_patient().get(i).getNom());
        }*/
    }
}
