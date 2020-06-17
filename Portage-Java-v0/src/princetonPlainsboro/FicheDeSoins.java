package princetonPlainsboro;

import java.util.ArrayList;
import java.util.Vector;

public class FicheDeSoins {
    private Patient patient;
    private Medecin medecin;
    private Date date;
    private String comMed; 
    private ArrayList<Acte> actes;       // contient des objets de classe 'Acte'
    
    public FicheDeSoins(Patient patient, Medecin medecin, Date dateActe) {
        this.patient = patient;
        this.medecin = medecin;
        this.date = dateActe;
        this.comMed = comMed; 
        actes = new ArrayList<Acte>();   // liste vide
        }
    
    public Patient getPatient() { return patient; }
    public Medecin getMedecin() { return medecin; }
    public Date    getDate()    { return date; }
    
    public void ajouterActe(Acte acte) {
        getActes().add(acte);
        }
    
    public void ajouterActe(Code code, int coefficient, String typeActe, String obs) {
        Acte acte = new Acte(code, coefficient, typeActe, obs);
        getActes().add(acte);
        }
    
    public void afficher() {
        System.out.println("Fiche de soins du " + date.toString());
        System.out.println("- medecin : " + medecin.toString());
        System.out.println("- patient : " + patient.toString());
        System.out.println("- actes medicaux :");
        for (int i=0; i<getActes().size(); i++) {
            Acte a = getActes().get(i);
            System.out.println("    > " + a.toString());
            }
        }
    
    public double coutTotal() {
        double total = 0;
        for (int i=0; i<getActes().size(); i++) {
            Acte a = getActes().get(i);
            total += a.cout();
            }
        return total;
        }

    /**
     * @return the actes
     */
    public ArrayList<Acte> getActes() {
        return actes;
    }
    
    public void ajouterListeActe(ArrayList<Acte> listeActe) {
        this.actes = listeActe;
    }

    
    }

