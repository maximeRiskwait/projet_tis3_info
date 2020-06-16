/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package princetonPlainsboro;

import java.util.List;
import java.util.Vector;

/**
 *
 * @author maximeriskwait
 */
public class ListePatient {
    
    private List<Patient> liste_patient; 
    
    
    public ListePatient(){
        
        liste_patient = new Vector<Patient>(); 
        
    }
    
    public void ajouterPatient(Patient p){
        liste_patient.add(p); 
        
    }
    
    
}
