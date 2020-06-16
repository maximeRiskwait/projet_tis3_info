package princetonPlainsboro;

import java.util.ArrayList;
import java.util.List;


public class DossierMedical {

    private ArrayList<FicheDeSoins> fiches;     // contient des objets de classe 'FicheDeSoins'
    private ArrayList<Patient> liste_patient; 
    private ArrayList<Medecin> liste_medecin; 

    public DossierMedical() {
        fiches = new ArrayList<FicheDeSoins>();  // liste vide
        liste_patient = new ArrayList<Patient>(); 
        liste_medecin = new ArrayList<Medecin>(); 
    }

    public void ajouterFiche(FicheDeSoins fiche) {
        getFiches().add(fiche);
    }
    
    public void ajouterPatient(Patient p){
        getListe_patient().add(p); 
    }

    public void afficher() {
        System.out.println("Dossier medical informatise :");
        System.out.println("-----------------------------");
        for (int i = 0; i < getFiches().size(); i++) {
            FicheDeSoins f = getFiches().get(i);
            f.afficher();
            // pour separer les fiches de soins :
            System.out.println("--------------------------------------");
        }
    }

    public double coutPatient(Patient p) {
        double cout = 0;
        for (int i = 0; i < getFiches().size(); i++) {
            FicheDeSoins f = getFiches().get(i);
            if (p.equals(f.getPatient())) {
                cout += f.coutTotal();
            }
        }
        return cout;
    }

    public double coutMedecin(Medecin m) {
        double cout = 0;
        for (int i = 0; i < getFiches().size(); i++) {
            FicheDeSoins f = getFiches().get(i);
            if (m.equals(f.getMedecin())) {
                cout += f.coutTotal();
            }
        }
        return cout;
    }

    public double coutSpecialite(String specialite) {
        double cout = 0;
        for (int i = 0; i < getFiches().size(); i++) {
            FicheDeSoins f = getFiches().get(i);
            if (specialite.equals(f.getMedecin().getSpecialite())) {
                cout += f.coutTotal();
            }
        }
        return cout;
    }

    public void afficherListePatients(Medecin m) {
        System.out.println("> liste des patients du " + m.toString() + " :");
        ArrayList<Patient> liste = new ArrayList<Patient>();
        // 'liste' contient tous les patients deja affiches
        // --> ceci permet de ne pas reafficher un patient deja affiche
        for (int i = 0; i < getFiches().size(); i++) {
            FicheDeSoins f = getFiches().get(i);
            if (m.equals(f.getMedecin())) {
                Patient p = f.getPatient();
                if (!liste.contains(p)) {
                    System.out.println(" - " + p.toString());
                    liste.add(p);
                }
            }
        }
    }

    public int nombreFichesIntervalle(Date d1, Date d2) {
        int n = 0;
        for (int i = 0; i < getFiches().size(); i++) {
            FicheDeSoins f = getFiches().get(i);
            Date d = f.getDate();
            if (d.compareTo(d1) >= 0 && d.compareTo(d2) <= 0) {
                n++;
            }
        }
        return n;
    }

    public void trierDates() {
        ArrayList<FicheDeSoins> copieFiches = new ArrayList<FicheDeSoins>(getFiches());

        while (!copieFiches.isEmpty()) {
            // on cherche la fiche de soins de date minimale :
            int imin = 0;
            FicheDeSoins f1 = copieFiches.get(imin);
            for (int i = 1; i < copieFiches.size(); i++) {
                FicheDeSoins f2 = copieFiches.get(i);
                if (f2.getDate().compareTo(f1.getDate()) < 0) {
                    imin = i;
                    f1 = f2;
                }
            }
            // on affiche la fiche de soins trouvee :
            f1.afficher();
            System.out.println("------------------------");
            //on la supprime de la liste :
            copieFiches.remove(imin);
        }
    }

    // tri generique :
    public void trier(ComparaisonFiches c) {
        ArrayList<FicheDeSoins> copieFiches = new ArrayList<FicheDeSoins>(getFiches());

        while (!copieFiches.isEmpty()) {
            // on cherche la fiche de soins minimale :
            int imin = 0;
            FicheDeSoins f1 = copieFiches.get(imin);
            for (int i = 1; i < copieFiches.size(); i++) {
                FicheDeSoins f2 = copieFiches.get(i);
                if (c.comparer(f2, f1) < 0) {
                    imin = i;
                    f1 = f2;
                }
            }
            // on affiche la fiche de soins trouvee :
            f1.afficher();
            System.out.println("------------------------");
            //on la supprime de la liste :
            copieFiches.remove(imin);
        }
    }

    /**
     * @return the fiches
     */
    public ArrayList<FicheDeSoins> getFiches() {
        return fiches;
    }

    /**
     * @return the liste_patient
     */
    public ArrayList<Patient> getListe_patient() {
        return liste_patient;
    }

    /**
     * @return the liste_medecin
     */
    public ArrayList<Medecin> getListe_medecin() {
        return liste_medecin;
    }
}

