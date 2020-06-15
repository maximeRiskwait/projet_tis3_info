package princetonPlainsboro;

public class Patient {

    private String nom;
    private String prenom;
    private Date dateDeNaissance;
    private String adresse;
    private String numSecuSociale;
    private String numTel; 

    public Patient(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }
    
    public Patient(String nom, String prenom, Date dateNaissance,String num, String adresse, String numSecu){
        this.nom= nom; 
        this.prenom = prenom; 
        this.dateDeNaissance = dateNaissance; 
        this.numTel = num; 
        this.adresse = adresse; 
        this.numSecuSociale = numSecu; 
        
    }

    public String toString() {
        return prenom + " " + nom;
    }

    public boolean equals(Object o) {
        if (o instanceof Patient) {
            Patient p = (Patient) o;
            return nom.equals(p.nom) && prenom.equals(p.prenom);
        } else {
            return false;
        }
    }
}
