/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package princetonPlainsboro;

import java.util.ArrayList;
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
    private ArrayList<Medecin> liste_medecin;

    public ConnexionProcess(String login, String password, ArrayList<Medecin> liste_medecin) {

        this.login = login;
        this.password = new String(password);
        this.success = false;
        this.liste_medecin = liste_medecin;
    }

    public boolean connexionReussie() {

        this.success = false;
        int i = 0;
        while (i < liste_medecin.size() && !liste_medecin.get(i).getLogin().equals(login)) {
            i++;
        }
        if (i == liste_medecin.size()) {
            success = false;
        } else {
            if (liste_medecin.get(i).getMdp().equals(password)) { // on vérifie maintenant que le password est bien correct
                success = true;
            }
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
