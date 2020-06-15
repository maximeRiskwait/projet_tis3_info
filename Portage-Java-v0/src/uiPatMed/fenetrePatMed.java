/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uiPatMed;

/**
 *
 * @author maximeriskwait
 */
public class fenetrePatMed extends javax.swing.JFrame {

    /**
     * Creates new form fenetrePatMed
     */
    public fenetrePatMed() {
        initComponents();
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
        tablePat = new javax.swing.JTable();
        recherchePat = new javax.swing.JTextField();
        ongletMedecin = new javax.swing.JPanel();
        spMed = new javax.swing.JScrollPane();
        tableMed = new javax.swing.JTable();
        rechercheMed = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Médical");

        tablePat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"SMITH", "Will", "30/03/2007"},
                {"GAGA", "Lady", "09/08/2000"},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "NOM", "Prenom", "Date de naissance"
            }
        ));
        spPat.setViewportView(tablePat);

        recherchePat.setFont(new java.awt.Font("Lucida Grande", 2, 13)); // NOI18N
        recherchePat.setText("Rechercher un patient");

        javax.swing.GroupLayout ongletPatientLayout = new javax.swing.GroupLayout(ongletPatient);
        ongletPatient.setLayout(ongletPatientLayout);
        ongletPatientLayout.setHorizontalGroup(
            ongletPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ongletPatientLayout.createSequentialGroup()
                .addGroup(ongletPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ongletPatientLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(spPat, javax.swing.GroupLayout.DEFAULT_SIZE, 582, Short.MAX_VALUE))
                    .addGroup(ongletPatientLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(recherchePat, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        ongletPatientLayout.setVerticalGroup(
            ongletPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ongletPatientLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(spPat, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(recherchePat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        ongletPatMed.addTab("Patient", ongletPatient);

        tableMed.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Dujardin", "Jean ", "Cardio"},
                {"Tel", "Sophie", "Neuro"},
                {"Chirac", "Jacque", "Uro"},
                {null, null, null}
            },
            new String [] {
                "NOM", "Prénom", "Spécialité"
            }
        ));
        spMed.setViewportView(tableMed);

        rechercheMed.setFont(new java.awt.Font("Lucida Grande", 2, 13)); // NOI18N
        rechercheMed.setText("Rechercher un medecin");
        rechercheMed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rechercheMedActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ongletMedecinLayout = new javax.swing.GroupLayout(ongletMedecin);
        ongletMedecin.setLayout(ongletMedecinLayout);
        ongletMedecinLayout.setHorizontalGroup(
            ongletMedecinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ongletMedecinLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ongletMedecinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spMed, javax.swing.GroupLayout.DEFAULT_SIZE, 582, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ongletMedecinLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(rechercheMed, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        ongletMedecinLayout.setVerticalGroup(
            ongletMedecinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ongletMedecinLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(spMed, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(rechercheMed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
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
            java.util.logging.Logger.getLogger(fenetrePatMed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fenetrePatMed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fenetrePatMed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fenetrePatMed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fenetrePatMed().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
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
