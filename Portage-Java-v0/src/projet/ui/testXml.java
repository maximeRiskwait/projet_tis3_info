package projet.ui;

import princetonPlainsboro.*;
import static princetonPlainsboro.CreateXMLFileJava.ecritureDossier;
import projet.ui.*; 

public class testXml {

    public static void main(String[] args) {
        LectureXML test = new LectureXML("dossiers.xml");
        DossierMedical dm = test.getDossier();
        ecritureDossier(dm);
    }
    
}
