/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet.ui;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import princetonPlainsboro.DossierMedical;
import princetonPlainsboro.FicheDeSoins;
import princetonPlainsboro.Patient; 
import princetonPlainsboro.Acte; 
import princetonPlainsboro.Date;
import princetonPlainsboro.Medecin;
/**
 *
 * @author melin
 */
public class NouvelleFicheDeSoins extends javax.swing.JFrame {

    private DossierMedical dm; 
    private FicheDeSoins fds; 
    private Patient p;
    private Medecin m; 
    private ArrayList<Acte> liste_acte;
    String[] liste; 
    
    /**
     * Creates new form FicheDeSoins
     */
    public NouvelleFicheDeSoins(String title, DossierMedical dm, Patient p) {
        super(title);
        initComponents();
        this.setSize(650,450);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.dm = dm;
        
        liste = new String[2]; 
        
        this.liste[0] = "Code";
        this.liste[1] = "cout"; 
         
        
        Object  [][] data = new Object[this.liste_acte.size()][2];
        for (int i = 0; i < liste_acte.size(); i++) {
            data[i][0] = liste_acte.get(i).getCode();
            Double b = new Double(liste_acte.get(i).cout());
            data[i][1] = b.toString();
            
        }
        
        tabActe.setModel(new DefaultTableModel(data, liste));
        
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
        labNom = new javax.swing.JLabel();
        labPrenom = new javax.swing.JLabel();
        labDdN = new javax.swing.JLabel();
        labMed = new javax.swing.JLabel();
        dataMed = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        addActe = new javax.swing.JButton();
        labDate = new javax.swing.JLabel();
        dateActe = new javax.swing.JTextField();
        valider = new javax.swing.JButton();
        annuler = new javax.swing.JButton();
        dateNaissancePat = new javax.swing.JLabel();
        prenomPat = new javax.swing.JLabel();
        nomPat2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabActe = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Nouvelle fiche de soins ");

        labNom.setText("Nom:");

        labPrenom.setText("Prénom:");

        labDdN.setText("Date de naissance:");

        labMed.setText("Médecin:");

        dataMed.setFont(new java.awt.Font("Lucida Grande", 2, 13)); // NOI18N
        dataMed.setText("Nom+prénom");

        jLabel5.setText("Acte(s):");

        addActe.setText("Ajouter acte");
        addActe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActeActionPerformed(evt);
            }
        });

        labDate.setText("Date:");

        dateActe.setFont(new java.awt.Font("Lucida Grande", 2, 13)); // NOI18N
        dateActe.setText("JJ/MM/AAAA");
        dateActe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateActeActionPerformed(evt);
            }
        });

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

        dateNaissancePat.setText("DateNaissancePat");
        dateNaissancePat.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        prenomPat.setText("PrenomduPatient ");
        prenomPat.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        nomPat2.setText("NomduPatient");
        nomPat2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tabActe.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        jScrollPane3.setViewportView(tabActe);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labNom)
                    .addComponent(labPrenom)
                    .addComponent(prenomPat, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomPat2, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addActe)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 148, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labDdN)
                    .addComponent(labMed)
                    .addComponent(dataMed, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateNaissancePat, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(valider)))
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(annuler)
                        .addGap(158, 158, 158))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(labDate)
                        .addGap(177, 177, 177))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(dateActe, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labNom)
                    .addComponent(labDdN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dateNaissancePat, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomPat2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labMed)
                    .addComponent(labPrenom))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dataMed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prenomPat, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labDate, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dateActe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(7, 7, 7)
                .addComponent(addActe)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(annuler)
                    .addComponent(valider))
                .addContainerGap(101, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void annulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_annulerActionPerformed
        dispose();
    }//GEN-LAST:event_annulerActionPerformed

    private void validerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_validerActionPerformed
        // cr�er une FicheDeSoins avec des getText puis l'ajouter a la liste / au xml si on est chaud
       this.nomPat2.setText(getP().getNom()); 
       this.prenomPat.setText(getP().getPrenom());
       this.dateNaissancePat.setText(getP().getDateDeNaissance().toString());
        
       String[] tab = this.dateActe.getText().split("/"); 
       // JJ/MM/AA
       Date dateActe = new Date(Integer.parseInt(tab[0]),Integer.parseInt(tab[1]),Integer.parseInt(tab[2])); 
       
       String[] tabMed = this.dataMed.getText().split("+"); 
        
       m = obtenirMedecin(tabMed[0], tabMed[1]); 
       
       fds = new FicheDeSoins(p, m, dateActe); 
       
       for(int i =0 ; i < liste_acte.size(); i++){
           fds.ajouterActe(liste_acte.get(i));
           
       }
       
        dispose();
    }//GEN-LAST:event_validerActionPerformed

    private void addActeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActeActionPerformed
        new NouvelActe("Nouvel Acte", getDm(), this); 
    }//GEN-LAST:event_addActeActionPerformed

    private void dateActeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateActeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateActeActionPerformed
    
    public Medecin obtenirMedecin(String nom, String prenom){
        Medecin m; 
        int i =0; 
        while(i<getDm().getListe_medecin().size() &&
                !nom.equals(dm.getListe_medecin().get(i).getNom()) &&
                    !prenom.equals(dm.getListe_medecin().get(i).getPrenom())){
            i++; 
        }
        if(i<getDm().getListe_patient().size()){
            m = getDm().getListe_medecin().get(i); 
        }
        else m = null; 
        
        return m; 
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addActe;
    private javax.swing.JButton annuler;
    private javax.swing.JTextField dataMed;
    private javax.swing.JTextField dateActe;
    private javax.swing.JLabel dateNaissancePat;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel labDate;
    private javax.swing.JLabel labDdN;
    private javax.swing.JLabel labMed;
    private javax.swing.JLabel labNom;
    private javax.swing.JLabel labPrenom;
    private javax.swing.JLabel nomPat2;
    private javax.swing.JLabel prenomPat;
    private javax.swing.JTable tabActe;
    private javax.swing.JButton valider;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the dm
     */
    public DossierMedical getDm() {
        return dm;
    }

    /**
     * @return the fds
     */
    public FicheDeSoins getFds() {
        return fds;
    }

    /**
     * @return the p
     */
    public Patient getP() {
        return p;
    }

    /**
     * @return the m
     */
    public Medecin getM() {
        return m;
    }

    /**
     * @return the liste_acte
     */
    public ArrayList<Acte> getListe_acte() {
        return liste_acte;
    }
}
