/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet.ui;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import princetonPlainsboro.Date;
import princetonPlainsboro.DossierMedical;
import princetonPlainsboro.FicheDeSoins;
import princetonPlainsboro.Medecin;
import princetonPlainsboro.Patient;

/**
 *
 * @author maximeriskwait
 */
public class affichageDetailsMedecin extends javax.swing.JFrame {

    private DossierMedical dm;
    private Medecin m;
    private ArrayList<Patient> liste_patient;
    private String[] liste;

    /**
     * Creates new form affichageDetailsMedecin
     */
    public affichageDetailsMedecin(String title, DossierMedical dm, Medecin m) {
        super(title);
        initComponents();
        this.setVisible(true);

        this.dm = dm;
        this.m = m;
        this.liste = new String[2];
        this.jLabel2.setText(m.getNom());
        this.jLabel4.setText(m.getPrenom());
        this.jLabel6.setText(m.getSpecialite());
        this.numTel.setText(m.getNumTel());

        liste_patient = new ArrayList<>();
        ajouterPatient(m);

        this.liste[0] = "Patient";
        this.liste[1] = "Coût";
        //System.out.println(liste_patient.size());
        Object[][] data = new Object[liste_patient.size()][this.liste.length];
        for (int i = 0; i < liste_patient.size(); i++) {
            data[i][0] = liste_patient.get(i).getNom() + " "
                    + liste_patient.get(i).getPrenom();
            Double d = dm.coutPatient(liste_patient.get(i));
            data[i][1] = d.toString();
            //data[i][2] = liste_patient.get(i).getDate().toString();

        }
        this.jTable1.setModel(new DefaultTableModel(data, liste));

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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable(){
            public boolean isCellEditable(int d, int c){
                return false;
            }};
            jLabel8 = new javax.swing.JLabel();
            numTel = new javax.swing.JLabel();

            setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

            jLabel1.setText("NOM :");

            jLabel2.setText("SMITH");
            jLabel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

            jLabel3.setText("Prénom :");

            jLabel4.setText("Will");
            jLabel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

            jLabel5.setText("Spécialité : ");

            jLabel6.setText("Cardiologie ");
            jLabel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

            jLabel7.setText("Liste Patient");

            jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                    {null, null, null},
                    {null, null, null},
                    {null, null, null},
                    {null, null, null}
                },
                new String [] {
                    "Patient", "Date", "Coût"
                }
            ));
            jScrollPane1.setViewportView(jTable1);

            jLabel8.setText("Numéro de téléphone :");

            numTel.setText("0666666666");
            numTel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

            javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
            jPanel1.setLayout(jPanel1Layout);
            jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7))
                            .addGap(39, 39, 39)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel3))
                                    .addGap(0, 0, Short.MAX_VALUE))
                                .addComponent(numTel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
            jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel3))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel4))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(jLabel8))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(numTel))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel7)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(64, Short.MAX_VALUE))
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

    public void ajouterPatient(Medecin m) {

        for (int i = 0; i < dm.getFiches().size(); i++) {
            FicheDeSoins f = dm.getFiches().get(i);
            if (m.equals(f.getMedecin())) {
                Patient p = f.getPatient();
                if (!liste_patient.contains(p)) {
                    liste_patient.add(p);
                }
                System.out.println("1");
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel numTel;
    // End of variables declaration//GEN-END:variables
}
