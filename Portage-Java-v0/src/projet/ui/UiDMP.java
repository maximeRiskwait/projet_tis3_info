/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet.ui;

import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;
import princetonPlainsboro.DossierMedical;
import princetonPlainsboro.FicheDeSoins;
import princetonPlainsboro.Patient;

/**
 *
 * @author maximeriskwait
 */
public class UiDMP extends javax.swing.JFrame {

    
    private DossierMedical dm; 
    private Patient p; 
    private ArrayList<FicheDeSoins> liste_fiche; 
    private String[] liste; 
    /**
     * Creates new form uiDMP
     */
    public UiDMP(DossierMedical dm, Patient p) {
        initComponents();
        this.setVisible(true); 
        this.dm = dm; 
        this.p = p; 
        this.liste_fiche =new ArrayList<FicheDeSoins>(); 
        this.liste = new String[3];
        
        this.nomPat.setText(p.getNom());
        this.prenomPat.setText(p.getPrenom());
        this.ddNPat.setText(p.getDateDeNaissance().toString()); 
        this.numSecuSoc.setText(p.getNumSS());
        this.adresse.setText(p.getAdresse());
        this.numTelephone.setText(p.getNumTel()); 
        
        this.liste[0] = "Fiche de soins";
        this.liste[1] = "Médecin"; 
        this.liste[2] = "Date";
        ajouterListe(p, dm); 
        
        Object  [][] data = new Object[liste_fiche.size()][this.liste.length];
        for (int i = 0; i < liste_fiche.size(); i++) {
            data[i][0] = i+1;
            data[i][1] = liste_fiche.get(i).getMedecin().getNom() + " "
                    + liste_fiche.get(i).getMedecin().getPrenom();
            data[i][2] = liste_fiche.get(i).getDate().toString();
            
        }
        this.tabFiche.setModel(new DefaultTableModel(data, liste));
        this.adresse.setEditable(false);
        
        this.jLabel2.setText(coutTotalPatient(dm, p));

    }

    public void refreshListe(ArrayList<FicheDeSoins> liste_fiche){
        Object  [][] data = new Object[liste_fiche.size()][this.liste.length];
        for (int i = 0; i < liste_fiche.size(); i++) {
            data[i][0] = i+1;
            data[i][1] = liste_fiche.get(i).getMedecin().getNom() + " "
                    + liste_fiche.get(i).getMedecin().getPrenom();
            data[i][2] = liste_fiche.get(i).getDate().toString();
            
        }
        this.tabFiche.setModel(new DefaultTableModel(data, liste));
    }
    
    public String coutTotalPatient(DossierMedical dm, Patient p){
        String s = ""; 
        Double b = new Double(dm.coutPatient(p)); 
        s = b.toString(); 

        return s; 
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
        labNomPat = new javax.swing.JLabel();
        labPrenomPat = new javax.swing.JLabel();
        nomPat = new javax.swing.JLabel();
        prenomPat = new javax.swing.JLabel();
        labDdN = new javax.swing.JLabel();
        ddNPat = new javax.swing.JLabel();
        labNumSecu = new javax.swing.JLabel();
        numSecuSoc = new javax.swing.JLabel();
        labAdresse = new javax.swing.JLabel();
        spAdresse = new javax.swing.JScrollPane();
        adresse = new javax.swing.JTextArea();
        labNumTel = new javax.swing.JLabel();
        numTelephone = new javax.swing.JLabel();
        spFdSoins = new javax.swing.JScrollPane();
        tabFiche = new javax.swing.JTable(){
            public boolean isCellEditable(int d, int c){
                return false;
            }
        };
        addFdSoins = new javax.swing.JButton();
        butOK = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Dossier médical Patient");

        labNomPat.setText("Nom : ");

        labPrenomPat.setText("Prénom : ");

        nomPat.setText("SMITH");
        nomPat.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        prenomPat.setText("Will");
        prenomPat.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        labDdN.setText("Date de naissance :");

        ddNPat.setText("17/07/1967");
        ddNPat.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        labNumSecu.setText("Numéro Sécurité Sociale");

        numSecuSoc.setText("1 67 05 75 006 084 36");
        numSecuSoc.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        labAdresse.setText("Adresse :");

        spAdresse.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        adresse.setColumns(20);
        adresse.setRows(5);
        adresse.setText("18 rue de la fac, 38000, Grenoble ");
        spAdresse.setViewportView(adresse);

        labNumTel.setText("Numéro de téléphone :");

        numTelephone.setText("06 56 56 56 56");
        numTelephone.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tabFiche.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "Fred", "02/02/2020"},
                {"2", "Jules", "04/07/2002"},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Feuille de soins", "Médecin", "Date"
            }
        ));
        tabFiche.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabFicheMouseClicked(evt);
            }
        });
        spFdSoins.setViewportView(tabFiche);

        addFdSoins.setText("Nouvelle fiche de soin");
        addFdSoins.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addFdSoinsActionPerformed(evt);
            }
        });

        butOK.setText("OK");
        butOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butOKActionPerformed(evt);
            }
        });

        jLabel1.setText("Coût :");

        jLabel2.setText("jLabel2");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spFdSoins, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 659, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(nomPat, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(labNomPat, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(labDdN, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ddNPat, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(labAdresse, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spAdresse, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(numTelephone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(numSecuSoc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(prenomPat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(labPrenomPat)
                                    .addComponent(labNumTel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(labNumSecu, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(addFdSoins)
                .addGap(37, 37, 37)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(butOK))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labNomPat)
                    .addComponent(labPrenomPat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomPat)
                    .addComponent(prenomPat))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labDdN)
                    .addComponent(labNumSecu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ddNPat)
                    .addComponent(numSecuSoc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labAdresse)
                    .addComponent(labNumTel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(numTelephone)
                    .addComponent(spAdresse, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spFdSoins, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addFdSoins)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(21, 21, 21))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(butOK)
                .addContainerGap())
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

    private void addFdSoinsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addFdSoinsActionPerformed
        NouvelleFicheDeSoins f = new NouvelleFicheDeSoins("Nouvelle fiche de soin", dm, p, this);
    }//GEN-LAST:event_addFdSoinsActionPerformed

    private void butOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butOKActionPerformed
        this.dispose();
    }//GEN-LAST:event_butOKActionPerformed

    private void tabFicheMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabFicheMouseClicked
        if (evt.getClickCount()==2){
            new AffichageFicheSoin(dm, liste_fiche.get(tabFiche.getSelectedRow()));
        }
    }//GEN-LAST:event_tabFicheMouseClicked

    public void ajouterListe(Patient p, DossierMedical dm){
        
        for(int i = 0; i < dm.getFiches().size(); i++){
            if(p.equals(dm.getFiches().get(i).getPatient())){
                FicheDeSoins fs = dm.getFiches().get(i);
                this.getListe_fiche().add(fs);
            }
        }
        this.jLabel2.setText(coutTotalPatient(dm, p));

    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addFdSoins;
    private javax.swing.JTextArea adresse;
    private javax.swing.JButton butOK;
    private javax.swing.JLabel ddNPat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labAdresse;
    private javax.swing.JLabel labDdN;
    private javax.swing.JLabel labNomPat;
    private javax.swing.JLabel labNumSecu;
    private javax.swing.JLabel labNumTel;
    private javax.swing.JLabel labPrenomPat;
    private javax.swing.JLabel nomPat;
    private javax.swing.JLabel numSecuSoc;
    private javax.swing.JLabel numTelephone;
    private javax.swing.JLabel prenomPat;
    private javax.swing.JScrollPane spAdresse;
    private javax.swing.JScrollPane spFdSoins;
    private javax.swing.JTable tabFiche;
    // End of variables declaration//GEN-END:variables

    
    public ArrayList<FicheDeSoins> getListe_fiche() {
        return liste_fiche;
    }
    
    public JLabel getJLabel2(){
        return this.jLabel2;
    }
}
