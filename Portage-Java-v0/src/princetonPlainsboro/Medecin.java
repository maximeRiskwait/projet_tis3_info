package princetonPlainsboro;

public class Medecin {
    private String nom;
    private String prenom;
    private String specialite;
    private String numTel; 
    //Mot de passe pour acceder au systeme
    
    public Medecin(String nom, String prenom, String specialite) {
        this.nom = nom;
        this.prenom = prenom;
        this.specialite = specialite;
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
    }


