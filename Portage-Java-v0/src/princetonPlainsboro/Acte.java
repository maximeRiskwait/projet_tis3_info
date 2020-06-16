package princetonPlainsboro;

class Acte {
    private Code code;      //test de commit :)
    private int coef;
    private String nomActe; 
    private String nomMedecin; 
    private Date dateRealisation; 
    private String type; 
    private String observation; 
    
    public Acte(Code code, int coef) {
        this.code = code;
        this.coef = coef;
        }
    
    public String toString() {
        return getCode().toString() + ", coefficient : " + getCoef();
        }
    
    public double cout() {
        return getCode().calculerCout(getCoef());
        }

    /**
     * @return the code
     */
    public Code getCode() {
        return code;
    }

    /**
     * @return the coef
     */
    public int getCoef() {
        return coef;
    }

    /**
     * @return the nomActe
     */
    public String getNomActe() {
        return nomActe;
    }

    /**
     * @return the nomMedecin
     */
    public String getNomMedecin() {
        return nomMedecin;
    }

    /**
     * @return the dateRéalisation
     */
    public Date getDateRealisation() {
        return dateRealisation;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @return the observation
     */
    public String getObservation() {
        return observation;
    }
    
    }
