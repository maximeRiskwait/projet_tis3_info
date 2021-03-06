package princetonPlainsboro;

public class Medecin {
    private String nom;
    private String prenom;
    private String specialite;
    private String numTel; 
    private String mdp; 
    
    //Mot de passe pour acceder au systeme
    
    public Medecin(String nom, String prenom, String specialite, String numTel) {
        this.nom = nom;
        this.prenom = prenom;
        this.specialite = specialite;
        this.numTel = numTel; 
        this.mdp = nom.toUpperCase();
        }
    
    public String getSpecialite() { return specialite; }
    
    public String toString() {
        return "Dr " + getPrenom() + " " + getNom() + ", " + specialite;
        }
    
    public boolean equals(Object o) {
        if (o instanceof Medecin) {
            Medecin p = (Medecin)o;
            return getNom().equals(p.getNom()) && getPrenom().equals(p.getPrenom());
            }
        else
            return false;
        }    

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
     * @return the numTel
     */
    public String getNumTel() {
        return numTel;
    }
    
    public String getLogin(){
        return nom.toLowerCase() + prenom.toLowerCase() + "1";
    }
    
    public String getMdp(){
        return mdp;
    }
}


