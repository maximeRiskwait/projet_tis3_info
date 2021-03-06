/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet.ui;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;
import princetonPlainsboro.Acte;
import princetonPlainsboro.DossierMedical;
import princetonPlainsboro.FicheDeSoins;

/**
 *
 * @author maximeriskwait
 */
public class AffichageFicheSoin extends javax.swing.JFrame {

    
    private DossierMedical dm;
    private FicheDeSoins fs;
    private ArrayList<Acte> liste_acte;   
    /**
     * Creates new form AffichageFicheSoin
     */
    public AffichageFicheSoin(DossierMedical dm, FicheDeSoins fs) {
        initComponents();
        this.setVisible(true);
        this.dm = dm; 
        this.fs = fs; 
        liste_acte = new ArrayList<Acte>(); 
        
        ajouterActeListe(fs); 
        
        this.nomPat.setText(fs.getPatient().getNom());
        this.prenomPat.setText(fs.getPatient().getPrenom()); 
        this.dateNaissancePat.setText(fs.getPatient().getDateDeNaissance().toString()); 
        this.nomPrenomMedecin.setText(fs.getMedecin().getNom()+" "+
                fs.getMedecin().getPrenom()); 
        this.dateFs.setText(fs.getDate().toString());
        
        DefaultListModel model = new DefaultListModel(); 
        
        for(int i = 0; i < liste_acte.size(); i++){   
            model.addElement(liste_acte.get(i).getCode().getLibelle());       
        }
        
        this.listActe.setModel(model); 
        Double b = coutFiche(liste_acte); 
        this.coutFiche.setText(b.toString()); 
        
        
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
        nomPat = new javax.swing.JLabel();
        labPrenom = new javax.swing.JLabel();
        prenomPat = new javax.swing.JLabel();
        labDdN = new javax.swing.JLabel();
        dateNaissancePat = new javax.swing.JLabel();
        labMedecin = new javax.swing.JLabel();
        nomPrenomMedecin = new javax.swing.JLabel();
        labActe = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listActe = new javax.swing.JList<>();
        labComMedecin1 = new javax.swing.JLabel();
        dateFs = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        coutFiche = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Fiche de soin ");

        labNom.setText("NOM :");

        nomPat.setText("SMITH");
        nomPat.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        labPrenom.setText("Prénom :");

        prenomPat.setText("Will");
        prenomPat.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        labDdN.setText("Date de naissance :");

        dateNaissancePat.setText("07/07/2007");
        dateNaissancePat.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        labMedecin.setText("Médecin :");

        nomPrenomMedecin.setText("Jean Luc DAMIEN");
        nomPrenomMedecin.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        labActe.setText("Actes(s) :");

        listActe.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listActe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listActeMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(listActe);

        labComMedecin1.setText("Date :");

        dateFs.setText("18/04/2020");
        dateFs.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Coût :");

        coutFiche.setText("000");
        coutFiche.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jScrollPane2)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(labPrenom)
                                            .addGap(0, 0, Short.MAX_VALUE))
                                        .addComponent(nomPat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(prenomPat, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(labNom)
                                    .addGap(159, 159, 159)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(labActe)
                                .addGap(140, 140, 140)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dateNaissancePat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nomPrenomMedecin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dateFs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labComMedecin1)
                                    .addComponent(labDdN)
                                    .addComponent(labMedecin)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(coutFiche, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 122, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labNom, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labDdN, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nomPat)
                    .addComponent(dateNaissancePat, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labMedecin, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prenomPat)
                    .addComponent(nomPrenomMedecin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labActe)
                    .addComponent(labComMedecin1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(dateFs)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(coutFiche)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(jButton1))
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void listActeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listActeMouseClicked
        if (evt.getClickCount()==2){
            new AffichageActe(liste_acte.get(listActe.getSelectedIndex()));
        }
    }//GEN-LAST:event_listActeMouseClicked

   
    
    public void ajouterActeListe(FicheDeSoins fs){
        
        for(int i = 0; i < fs.getActes().size(); i++){
                Acte a = fs.getActes().get(i);
                this.liste_acte.add(a);
                String libelle = a.getCode().getLibelle(); 
        }
        
    }
    
    public double coutFiche(ArrayList<Acte> la){
       double cout = 0; 
        
        for(int i = 0; i < la.size(); i++){
            cout += la.get(i).cout();  
        }
        
        return cout; 
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel coutFiche;
    private javax.swing.JLabel dateFs;
    private javax.swing.JLabel dateNaissancePat;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labActe;
    private javax.swing.JLabel labComMedecin1;
    private javax.swing.JLabel labDdN;
    private javax.swing.JLabel labMedecin;
    private javax.swing.JLabel labNom;
    private javax.swing.JLabel labPrenom;
    private javax.swing.JList<String> listActe;
    private javax.swing.JLabel nomPat;
    private javax.swing.JLabel nomPrenomMedecin;
    private javax.swing.JLabel prenomPat;
    // End of variables declaration//GEN-END:variables
}
