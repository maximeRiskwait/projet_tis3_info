/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package princetonPlainsboro;

import java.util.Vector;

/**
 *
 * @author maximeriskwait
 */
public class ListeMedecin {
    
    private Vector<Medecin> liste_medecin; 
    
    public ListeMedecin() {
        
        liste_medecin = new Vector<Medecin>(); 
        
    }
    
    public void ajouterMedecin(Medecin m){
          liste_medecin.add(m); 
            
    }
    
}
