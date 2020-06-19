package princetonPlainsboro;

public class Acte {

    private Code code;
    private int coef;
    private String nomActe;
    private String nomMedecin;
    private Date dateRealisation;
    private String type;
    private String observation;

    public Acte(Code code, int coef) {
        this.code = code;
        this.coef = coef;
        this.type = "";
        this.observation = "";
    }

    public Acte(Code code, int coef, String typeActe, String observation) {
        this.code = code;
        this.coef = coef;
        this.type = typeActe;
        this.observation = observation;
    }

    public String toString() {
        return code.toString() + ", coefficient : " + coef;
    }

    public double cout() {
        return code.calculerCout(coef);
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

    /**
     * @param code the code to set
     */
    public void setCode(Code code) {
        this.code = code;
    }

    /**
     * @param coef the coef to set
     */
    public void setCoef(int coef) {
        this.coef = coef;
    }

    /**
     * @param nomActe the nomActe to set
     */
    public void setNomActe(String nomActe) {
        this.nomActe = nomActe;
    }

    /**
     * @param nomMedecin the nomMedecin to set
     */
    public void setNomMedecin(String nomMedecin) {
        this.nomMedecin = nomMedecin;
    }

    /**
     * @param dateRealisation the dateRealisation to set
     */
    public void setDateRealisation(Date dateRealisation) {
        this.dateRealisation = dateRealisation;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @param observation the observation to set
     */
    public void setObservation(String observation) {
        this.observation = observation;
    }

}
