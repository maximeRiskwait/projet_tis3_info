/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package princetonPlainsboro;
 
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author maximeriskwait
 */
public class ConnexionProcess {

    private String login;
    private String password;
    private boolean success;
    
    public ConnexionProcess(JTextField login, JPasswordField password){
        
        this.login = login.getText().toUpperCase(); 
        this.password = new String(password.getPassword()); 
        this.success=false; 
        
    }
     
    
    public boolean connexionReussie (){  
        
        this.success=false; 
        JOptionPane jop1 = new JOptionPane(); 
        
        switch(login){
            case "SECRETAIREMED":
                if(password.equals("SMED135")){
                    success = true; 
                } 
                
                break; 
            case "MEDECIN": 
                if(password.equals("Medecin123")){
                    success = true; 
                }
                
                break; 
            case "SECRETAIREADM":
                if(password.equals("SAdmin369")){
                    success = true; 
                } 
                break; 
            default :
                jop1.showMessageDialog(null, "ERREUR ! Le nom d'utilisateur ou le mot de passe sont INCORRECT",
                            "ERREUR", JOptionPane.ERROR_MESSAGE);
            
        }
        
        
        return success; 
        
    }
    
    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

}
