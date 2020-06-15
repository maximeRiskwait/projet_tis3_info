/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package princetonPlainsboro;

import javax.swing.JLabel;

/**
 *
 * @author maximeriskwait
 */
public class ConnexionProcess {

    private String login;
    private String password;
    private boolean success;
     
    
    public boolean connexionReussie (JLabel labelLog, JLabel labelPass){  
        
        this.login = labelLog.getText().toUpperCase(); 
        this.password = labelPass.getText(); 
        this.success=false; 
        
        switch(login){
            case "SECRETAIREMED":
                if(password.equals("SMED135")){
                    success = true; 
                }
                // ajouter un else avec un popup qui s'ouvre pour dire que c'est pas bon
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
