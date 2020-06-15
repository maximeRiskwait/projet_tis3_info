package princetonPlainsboro;

class Acte {
    private Code code;
    private int coef;
    private String nomActe; 
    private String nomMedecin; 
    private Date dateRéalisation; 
    private String type; 
    private String observation; 
    
    public Acte(Code code, int coef) {
        this.code = code;
        this.coef = coef;
        }
    
    public String toString() {
        return code.toString() + ", coefficient : " + coef;
        }
    
    public double cout() {
        return code.calculerCout(coef);
        }
    }
