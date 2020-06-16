package princetonPlainsboro;

public class Patient {

    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @return the prenom
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * @return the dateDeNaissance
     */
    public Date getDateDeNaissance() {
        return dateDeNaissance;
    }

    /**
     * @return the adresse
     */
    public String getAdresse() {
        return adresse;
    }

    /**
     * @return the numSecuSociale
     */
    public String getNumSecuSociale() {
        return numSecuSociale;
    }

    /**
     * @return the numTel
     */
    public String getNumTel() {
        return numTel;
    }

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
        return getPrenom() + " " + getNom();
    }
    
    public String afficherDateNaissance(){
        String s = ""; 
        s = this.getDateDeNaissance().toString(); 
        return s; 
    }

    public boolean equals(Object o) {
        if (o instanceof Patient) {
            Patient p = (Patient) o;
            return getNom().equals(p.getNom()) && getPrenom().equals(p.getPrenom());
        } else {
            return false;
        }
    }
}
