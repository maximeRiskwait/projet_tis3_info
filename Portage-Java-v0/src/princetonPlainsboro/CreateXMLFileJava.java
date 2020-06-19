package princetonPlainsboro;

import java.io.File;
import java.util.ArrayList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

public class CreateXMLFileJava {

    public static final String xmlFilePath = "src/donnees/dossiers.xml";
    private DossierMedical dm;

    public static void ecritureDossier(DossierMedical dm) {

        try {

            DocumentBuilderFactory documentFactory = DocumentBuilderFactory.newInstance();

            DocumentBuilder documentBuilder = documentFactory.newDocumentBuilder();

            Document document = documentBuilder.newDocument();

            // root element
            Element root = document.createElement("dossiers");
            document.appendChild(root);

            //for fiche de soins
            for (int i = 0; i < dm.getFiches().size(); i++) {
                FicheDeSoins f = dm.getFiches().get(i);
                // ficheDeSoins
                Element ficheDeSoins = document.createElement("ficheDeSoins");
                //ficheDeSoins.appendChild(document.createTextNode("\n  "));
                root.appendChild(ficheDeSoins);

                // date element
                Element date = document.createElement("date");
                date.appendChild(document.createTextNode(f.getDate().toXml()));
                //ficheDeSoins.appendChild(document.createTextNode("\n    "));
                ficheDeSoins.appendChild(date);

                //medecin
                Element medecin = document.createElement("medecin");
                ficheDeSoins.appendChild(medecin);

                //nom medecin
                Element nomMed = document.createElement("nom");
                nomMed.appendChild(document.createTextNode(f.getMedecin().getNom()));
                medecin.appendChild(nomMed);

                //prenom medecin
                Element prenomMed = document.createElement("prenom");
                prenomMed.appendChild(document.createTextNode(f.getMedecin().getPrenom()));
                medecin.appendChild(prenomMed);

                //specialite medecin
                Element specialite = document.createElement("specialite");
                specialite.appendChild(document.createTextNode(f.getMedecin().getSpecialite()));
                medecin.appendChild(specialite);

                //numTel medecin
                Element numTelMed = document.createElement("numTel");
                numTelMed.appendChild(document.createTextNode(f.getMedecin().getNumTel()));
                medecin.appendChild(numTelMed);

                //patient
                Element patient = document.createElement("patient");
                ficheDeSoins.appendChild(patient);

                //nom patient
                Element nomPat = document.createElement("nom");
                nomPat.appendChild(document.createTextNode(f.getPatient().getNom()));
                patient.appendChild(nomPat);

                //prenom patient
                Element prenomPat = document.createElement("prenom");
                prenomPat.appendChild(document.createTextNode(f.getPatient().getPrenom()));
                patient.appendChild(prenomPat);

                //specialite patient
                Element dateNaissance = document.createElement("dateNaissance");
                dateNaissance.appendChild(document.createTextNode(f.getPatient().getDateDeNaissance().toXml()));
                patient.appendChild(dateNaissance);

                //adresse patient
                Element adresse = document.createElement("adresse");
                adresse.appendChild(document.createTextNode(f.getPatient().getAdresse()));
                patient.appendChild(adresse);

                //numTel patient
                Element numTelPat = document.createElement("numTel");
                numTelPat.appendChild(document.createTextNode(f.getPatient().getNumTel()));
                patient.appendChild(numTelPat);

                //numSS patient
                Element numSS = document.createElement("numSS");
                numSS.appendChild(document.createTextNode(f.getPatient().getNumSS()));
                patient.appendChild(numSS);

                ArrayList<Acte> actes = f.getActes();

                for (int j = 0; j < actes.size(); j++) {
                    Acte a = actes.get(j);
                    Element acte = document.createElement("acte");
                    ficheDeSoins.appendChild(acte);

                    //code
                    Element code = document.createElement("code");
                    code.appendChild(document.createTextNode(a.getCode().codeToString()));
                    acte.appendChild(code);

                    //coef
                    Element coef = document.createElement("coef");
                    coef.appendChild(document.createTextNode(Integer.toString(a.getCoef())));
                    acte.appendChild(coef);

                    //type
                    if (a.getType() != "") {
                        Element type = document.createElement("type");
                        type.appendChild(document.createTextNode(a.getType()));
                        acte.appendChild(type);
                    }

                    //obeservation
                    if (a.getObservation() != "") {
                        Element obeservation = document.createElement("observation");
                        obeservation.appendChild(document.createTextNode(a.getObservation()));
                        acte.appendChild(obeservation);
                    }

                }
            }

            // create the xml file
            //transform the DOM Object to an XML File
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource domSource = new DOMSource(document);
            StreamResult streamResult = new StreamResult(new File(xmlFilePath));

            // If you use
            // StreamResult result = new StreamResult(System.out);
            // the output will be pushed to the standard output ...
            // You can use that for debugging 
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.transform(domSource, streamResult);

            System.out.println("Done creating XML File");

        } catch (ParserConfigurationException pce) {
            pce.printStackTrace();
        } catch (TransformerException tfe) {
            tfe.printStackTrace();
        }
    }
}
