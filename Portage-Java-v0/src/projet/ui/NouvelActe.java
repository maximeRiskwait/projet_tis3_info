/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet.ui;

import java.util.ArrayList;
import princetonPlainsboro.Acte;
import princetonPlainsboro.DossierMedical;
import princetonPlainsboro.Medecin;
import princetonPlainsboro.Code;
import princetonPlainsboro.Patient;

/**
 *
 * @author maximeriskwait
 */
public class NouvelActe extends javax.swing.JFrame {

    private DossierMedical dm;
    private Medecin m;
    private Acte acte;
    private Code code;
    private NouvelleFicheDeSoins nfs;
    private Patient p;
    private boolean b;

    /**
     * Creates new form NouvelActe
     */
    public NouvelActe(String title, DossierMedical dm, NouvelleFicheDeSoins nfs, Patient p) {
        super(title);
        initComponents();
        this.setVisible(true);
        this.dm = dm;
        this.m = m;
        this.nfs = nfs;
        this.p = p;
        this.b = false;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        comboType = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        valider = new javax.swing.JButton();
        annuler = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        nomActe = new javax.swing.JLabel();
        coutActe = new javax.swing.JLabel();
        codeActe = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtObs = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Nom de l'acte:");

        jLabel2.setText("Type de l'acte:");

        comboType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Diagnostique", "Thérapeutique" }));

        jLabel5.setText("Observation:");

        jLabel6.setText("Coût de l'acte:");

        valider.setText("Valider");
        valider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validerActionPerformed(evt);
            }
        });

        annuler.setText("Annuler");
        annuler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                annulerActionPerformed(evt);
            }
        });

        jLabel7.setText("Code acte :");

        nomActe.setText("Consultation au cabinet");
        nomActe.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        coutActe.setText("23.0");
        coutActe.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        codeActe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CS", "CSC", "FP", "KC", "KE", "K", "KFA", "KFB", "ORT", "PRO" }));
        codeActe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codeActeActionPerformed(evt);
            }
        });

        txtObs.setColumns(20);
        txtObs.setRows(5);
        jScrollPane2.setViewportView(txtObs);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(valider)
                        .addComponent(nomActe, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2)
                    .addComponent(comboType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(codeActe, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(annuler)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 57, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(coutActe, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(codeActe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomActe)
                    .addComponent(coutActe))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valider)
                    .addComponent(annuler))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void validerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_validerActionPerformed
        String typeActe = (String) comboType.getSelectedItem();
        String observation = txtObs.getText();
        acte = (b) ? new Acte(code, 1, typeActe, observation) 
                : new Acte(Code.CS, 1, "Diagnostique", "");
        ArrayList<Acte> liste_actes = nfs.getListe_acte();
        liste_actes.add(acte);

        this.dispose();
        nfs.refreshList(liste_actes);
        //nfs = new NouvelleFicheDeSoins("Nouvelle fiche de soins", dm, p, liste_actes);

    }//GEN-LAST:event_validerActionPerformed

    private void annulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_annulerActionPerformed
        this.dispose();
    }//GEN-LAST:event_annulerActionPerformed

    private void codeActeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codeActeActionPerformed

        String s = (String) codeActe.getSelectedItem();
        this.b = true;
        switch (s) {
            case "CS":
                this.code = Code.CS;
                break;
            case "CSC":
                this.code = Code.CSC;
                break;
            case "FP":
                this.code = Code.FP;
                break;
            case "KC":
                this.code = Code.KC;
                break;
            case "KE":
                this.code = Code.KE;
                break;
            case "K":
                this.code = Code.K;
                break;
            case "KFA":
                this.code = Code.KFA;
                break;
            case "KFB":
                this.code = Code.KFB;
                break;
            case "ORT":
                this.code = Code.ORT;
                break;
            case "PRO":
                this.code = Code.PRO;
                break;
        }

        this.nomActe.setText(code.getLibelle());
        Double b = new Double(code.getCout());
        this.coutActe.setText(b.toString());

        this.revalidate();

    }//GEN-LAST:event_codeActeActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton annuler;
    private javax.swing.JComboBox<String> codeActe;
    private javax.swing.JComboBox<String> comboType;
    private javax.swing.JLabel coutActe;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel nomActe;
    private javax.swing.JTextArea txtObs;
    private javax.swing.JButton valider;
    // End of variables declaration//GEN-END:variables
}
