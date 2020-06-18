/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet.ui;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import princetonPlainsboro.DossierMedical;
import princetonPlainsboro.Medecin;
import princetonPlainsboro.Patient;

/**
 *
 * @author maximeriskwait
 */
public class FenetrePatMed extends javax.swing.JFrame {

    private ArrayList<Patient> liste_patient;
    private ArrayList<Medecin> liste_medecin;
    private DossierMedical dm;
    private String[] liste;

    public FenetrePatMed(DossierMedical dm) {
        initComponents();

        this.liste_patient = dm.getListe_patient();
        this.liste_medecin = dm.getListe_medecin();
        this.dm = dm;
        this.liste = new String[6];

        this.liste[0] = "Nom";
        this.liste[1] = "Prénom";
        this.liste[2] = "Date de naissance";
        this.liste[3] = "Numéro tel";
        this.liste[4] = "Adresse";
        this.liste[5] = "Numéro SS";

        Object[][] data = new Object[this.liste_patient.size()][6];
        for (int i = 0; i < liste_patient.size(); i++) {
            data[i][0] = liste_patient.get(i).getNom();
            data[i][1] = liste_patient.get(i).getPrenom();
            data[i][2] = liste_patient.get(i).getDateDeNaissance().toString();
            data[i][3] = liste_patient.get(i).getAdresse();
            data[i][4] = liste_patient.get(i).getNumTel();
            data[i][5] = liste_patient.get(i).getNumSecuSociale();

        }
        tablePat.setModel(new DefaultTableModel(data, liste));

        this.liste = new String[4];
        this.liste[0] = "Nom";
        this.liste[1] = "Prénom";
        this.liste[2] = "Spécialité";
        this.liste[3] = "Numéro tel";

        data = new Object[this.liste_medecin.size()][6];
        for (int i = 0; i < liste_medecin.size(); i++) {
            data[i][0] = liste_medecin.get(i).getNom();
            data[i][1] = liste_medecin.get(i).getPrenom();
            data[i][2] = liste_medecin.get(i).getSpecialite();
            data[i][3] = liste_medecin.get(i).getNumTel();
        }
        tableMed.setModel(new DefaultTableModel(data, liste));

        revalidate();
        this.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ongletPatMed = new javax.swing.JTabbedPane();
        ongletPatient = new javax.swing.JPanel();
        spPat = new javax.swing.JScrollPane();
        tablePat = new javax.swing.JTable(){
            public boolean isCellEditable(int d, int c){
                return false;
            }
        };
        recherchePat = new javax.swing.JTextField();
        afficher = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        ongletMedecin = new javax.swing.JPanel();
        spMed = new javax.swing.JScrollPane();
        tableMed = new javax.swing.JTable(){
            public boolean isCellEditable(int d, int c){
                return false;
            }}
            ;
            rechercheMed = new javax.swing.JTextField();
            jButton3 = new javax.swing.JButton();
            jButton4 = new javax.swing.JButton();

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
            setTitle("Médical");

            ongletPatMed.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    ongletPatMedMouseClicked(evt);
                }
            });

            tablePat.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                    {null, null, null, null, null, null},
                    {null, null, null, null, null, null},
                    {null, null, null, null, null, null},
                    {null, null, null, null, null, null}
                },
                new String [] {
                    "Nom", "Prenom", "Date Naissance", "Adresse", "Numéro tel", "NuméroSS"
                }
            ) {
                Class[] types = new Class [] {
                    java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
                };

                public Class getColumnClass(int columnIndex) {
                    return types [columnIndex];
                }
            });
            tablePat.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    tablePatMouseClicked(evt);
                }
            });
            tablePat.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
                public void propertyChange(java.beans.PropertyChangeEvent evt) {
                    tablePatPropertyChange(evt);
                }
            });
            spPat.setViewportView(tablePat);

            recherchePat.setFont(new java.awt.Font("Lucida Grande", 2, 13)); // NOI18N
            recherchePat.setText("Rechercher un patient");

            afficher.setText("Afficher");
            afficher.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    afficherActionPerformed(evt);
                }
            });

            jButton1.setText("Rechercher");
            jButton1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton1ActionPerformed(evt);
                }
            });

            jButton2.setText("Déconnexion");
            jButton2.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton2ActionPerformed(evt);
                }
            });

            javax.swing.GroupLayout ongletPatientLayout = new javax.swing.GroupLayout(ongletPatient);
            ongletPatient.setLayout(ongletPatientLayout);
            ongletPatientLayout.setHorizontalGroup(
                ongletPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ongletPatientLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(ongletPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(spPat, javax.swing.GroupLayout.DEFAULT_SIZE, 684, Short.MAX_VALUE)
                        .addGroup(ongletPatientLayout.createSequentialGroup()
                            .addComponent(afficher)
                            .addGap(186, 186, 186)
                            .addComponent(recherchePat, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jButton1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2)))
                    .addContainerGap())
            );
            ongletPatientLayout.setVerticalGroup(
                ongletPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ongletPatientLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(spPat, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                    .addGroup(ongletPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(afficher)
                        .addComponent(recherchePat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1)
                        .addComponent(jButton2))
                    .addGap(28, 28, 28))
            );

            ongletPatMed.addTab("Patient", ongletPatient);

            tableMed.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                    {null, null, null},
                    {null, null, null}
                },
                new String [] {
                    "NOM", "Prénom", "Spécialité"
                }
            ));
            tableMed.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    tableMedMouseClicked(evt);
                }
            });
            spMed.setViewportView(tableMed);

            rechercheMed.setFont(new java.awt.Font("Lucida Grande", 2, 13)); // NOI18N
            rechercheMed.setText("Nom+prénom");
            rechercheMed.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    rechercheMedActionPerformed(evt);
                }
            });

            jButton3.setText("Rechercher");
            jButton3.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton3ActionPerformed(evt);
                }
            });

            jButton4.setText("Déconnexion");
            jButton4.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton4ActionPerformed(evt);
                }
            });

            javax.swing.GroupLayout ongletMedecinLayout = new javax.swing.GroupLayout(ongletMedecin);
            ongletMedecin.setLayout(ongletMedecinLayout);
            ongletMedecinLayout.setHorizontalGroup(
                ongletMedecinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ongletMedecinLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(ongletMedecinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(spMed, javax.swing.GroupLayout.DEFAULT_SIZE, 684, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ongletMedecinLayout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addComponent(rechercheMed, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(26, 26, 26)
                            .addComponent(jButton3)
                            .addGap(66, 66, 66)
                            .addComponent(jButton4)))
                    .addContainerGap())
            );
            ongletMedecinLayout.setVerticalGroup(
                ongletMedecinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ongletMedecinLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(spMed, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addGroup(ongletMedecinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rechercheMed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton3)
                        .addComponent(jButton4))
                    .addContainerGap(36, Short.MAX_VALUE))
            );

            ongletPatMed.addTab("Médecin", ongletMedecin);

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(ongletPatMed)
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(ongletPatMed)
            );

            ongletPatMed.getAccessibleContext().setAccessibleName("");

            pack();
        }// </editor-fold>//GEN-END:initComponents

    private void rechercheMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rechercheMedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rechercheMedActionPerformed

    private void tablePatPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tablePatPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_tablePatPropertyChange

    private void ongletPatMedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ongletPatMedMouseClicked


    }//GEN-LAST:event_ongletPatMedMouseClicked

    private void tablePatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablePatMouseClicked

        DefaultTableModel model = (DefaultTableModel) tablePat.getModel();
        int selectedRowIndex = tablePat.getSelectedRow();
        String numSS = model.getValueAt(selectedRowIndex, 5).toString();
    }//GEN-LAST:event_tablePatMouseClicked

    private void afficherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_afficherActionPerformed
        DefaultTableModel model = (DefaultTableModel) tablePat.getModel();
        int selectedRowIndex = tablePat.getSelectedRow();

        String numSS = model.getValueAt(selectedRowIndex, 5).toString();

        new UiDMP(dm, obtenirPatient(numSS));
    }//GEN-LAST:event_afficherActionPerformed

    private void tableMedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMedMouseClicked
        if (evt.getClickCount() == 2) {
            new affichageDetailsMedecin("Détail médecin", dm, liste_medecin.get(tableMed.getSelectedRow()));
        }
    }//GEN-LAST:event_tableMedMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
        new Connexion("Connexion", dm);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            new AffichageFichePatient(obtenirPatient(recherchePat.getText()));
        } catch (NullPointerException e) {
            JOptionPane jop1 = new JOptionPane();
            jop1.showMessageDialog(null, "Numéro de sécurité sociale invalide",
                    "ERREUR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String[] tabMed = new String[2];
        tabMed = rechercheMed.getText().split("\\+");
        try {
            new affichageDetailsMedecin("Détail médecin", dm, obtenirMedecin(tabMed[0], tabMed[1]));
        } catch (NullPointerException e) {
            JOptionPane jop1 = new JOptionPane();
            jop1.showMessageDialog(null, "Ce médecin n'existe pas !",
                    "ERREUR", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.dispose();
        new Connexion("Connexion", dm);
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FenetrePatMed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FenetrePatMed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FenetrePatMed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FenetrePatMed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new FenetrePatMed().setVisible(true);
            }
        });
    }

    public Patient obtenirPatient(String numSS) {
        Patient p;
        int i = 0;
        while (i < dm.getListe_patient().size()
                && !numSS.equals(dm.getListe_patient().get(i).getNumSecuSociale())) {
            i++;
        }
        if (i < dm.getListe_patient().size()) {
            p = dm.getListe_patient().get(i);
        } else {
            p = null;
        }

        return p;
    }

    public Medecin obtenirMedecin(String nom, String prenom) {
        Medecin m;
        int i = 0;
        while (i < dm.getListe_medecin().size()
                && !nom.equals(dm.getListe_medecin().get(i).getNom())
                && !prenom.equals(dm.getListe_medecin().get(i).getPrenom())) {
            i++;
        }
        if (i < dm.getListe_patient().size()) {
            m = dm.getListe_medecin().get(i);
        } else {
            m = null;
        }

        return m;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton afficher;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JPanel ongletMedecin;
    private javax.swing.JTabbedPane ongletPatMed;
    private javax.swing.JPanel ongletPatient;
    private javax.swing.JTextField rechercheMed;
    private javax.swing.JTextField recherchePat;
    private javax.swing.JScrollPane spMed;
    private javax.swing.JScrollPane spPat;
    private javax.swing.JTable tableMed;
    private javax.swing.JTable tablePat;
    // End of variables declaration//GEN-END:variables
}
