/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package princetonPlainsboro;

import java.io.FileWriter;
import java.io.IOException;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;


public class EcritureXML {

    private DossierMedical dossierMed;

    /*!
         *
         *  @brief Constructeur surcharg� d'une EcritureXML.
         *
         *  @param dossierMed Dossier m�dical � �crire en fichier XML.
         *
     */
    public EcritureXML(DossierMedical dossierMed) {
        this.dossierMed = dossierMed;
    }

    /*!
         *
         *  @brief Constructeur de base d'une EcritureXML.
         *
     */
    public EcritureXML() {

    }

    XMLOutputFactory factory = XMLOutputFactory.newInstance();

    /*!
         *
         *  @brief Sauvegarde d'un dossier m�dical
         *  @param dm Dossier m�dical � sauvegarder.
         *
     */
    public void saveFiche(DossierMedical dm) {

        try {
            XMLStreamWriter writer = factory.createXMLStreamWriter(new FileWriter("src/donnees/dossiers.xml"));

            writer.writeStartDocument();
            writer.writeCharacters("\n");
            writer.writeStartElement("dossiers");
            writer.writeCharacters("\n");
 
            for (int i = 0; i < dm.getFiches().size(); i++) {
                writer.writeStartElement("ficheDeSoins");
                writer.writeCharacters("\n");

                writer.writeStartElement("date");
                writer.writeCharacters(dm.getFiches().get(i).getDate().toString());
                writer.writeEndElement();
                writer.writeCharacters("\n");

                writer.writeStartElement("medecin");
                writer.writeCharacters("\n");

                writer.writeStartElement("nom");
                writer.writeCharacters(dm.getFiches().get(i).getMedecin().getNom());
                writer.writeEndElement();
                writer.writeCharacters("\n");

                writer.writeStartElement("prenom");
                writer.writeCharacters(dm.getFiches().get(i).getMedecin().getPrenom());
                writer.writeEndElement();
                writer.writeCharacters("\n");

                writer.writeStartElement("specialite");
                writer.writeCharacters(dm.getFiches().get(i).getMedecin().getSpecialite());
                writer.writeEndElement();
                writer.writeCharacters("\n");

                writer.writeStartElement("numTel");
                writer.writeCharacters(dm.getFiches().get(i).getMedecin().getNumTel());
                writer.writeEndElement();
                writer.writeCharacters("\n");

                writer.writeEndElement();
                writer.writeCharacters("\n");

                writer.writeStartElement("patient");
                writer.writeCharacters("\n");

                writer.writeStartElement("nom");
                writer.writeCharacters(dm.getFiches().get(i).getPatient().getNom());
                writer.writeEndElement();
                writer.writeCharacters("\n");

                writer.writeStartElement("prenom");
                writer.writeCharacters(dm.getFiches().get(i).getPatient().getPrenom());
                writer.writeEndElement();
                writer.writeCharacters("\n");

                writer.writeStartElement("numSS");
                writer.writeCharacters("\n");

                writer.writeEndElement();
                writer.writeCharacters("\n");

                writer.writeStartElement("dateN");
                writer.writeCharacters(dm.getFiches().get(i).getPatient().getDateDeNaissance().toString());
                writer.writeEndElement();
                writer.writeCharacters("\n");

                writer.writeStartElement("adresse");
                writer.writeCharacters(dm.getFiches().get(i).getPatient().getAdresse());
                writer.writeEndElement();
                writer.writeCharacters("\n");

                writer.writeEndElement();
                writer.writeCharacters("\n");

                for (int j = 0; j < dm.getFiches().get(i).getActes().size(); j++) {
                    writer.writeStartElement("acte");
                    writer.writeCharacters("\n");

                    writer.writeStartElement("code");
                    writer.writeCharacters(dm.getFiches().get(i).getActes().get(j).getCode().name());
                    writer.writeEndElement();
                    writer.writeCharacters("\n");

                    writer.writeStartElement("coef");
                    writer.writeCharacters(String.valueOf(dm.getFiches().get(i).getActes().get(j).getCoef()));
                    writer.writeEndElement();
                    writer.writeCharacters("\n");

                    writer.writeStartElement("type");
                    writer.writeCharacters(String.valueOf(dm.getFiches().get(i).getActes().get(j).getType()));
                    writer.writeEndElement();
                    writer.writeCharacters("\n");

                    writer.writeStartElement("remarqueMed");
                    writer.writeCharacters(String.valueOf(dm.getFiches().get(i).getActes().get(j).getObservation()));
                    writer.writeEndElement();
                    writer.writeCharacters("\n");

                    writer.writeEndElement();
                    writer.writeCharacters("\n");
                }
                writer.writeEndElement();
                writer.writeCharacters("\n");
            }

            writer.writeEndElement();
            writer.writeCharacters("\n");
            writer.writeEndDocument();
            writer.flush();
            writer.close();
        } catch (XMLStreamException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();

        }

    }
}
