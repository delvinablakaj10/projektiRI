/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

/**
 *
 * @author INFO PC
 */
public class Faturat extends javax.swing.JFrame {

    /**
     * Creates new form Faturat
     */
    public Faturat() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtSasia = new javax.swing.JTextField();
        txtCmimiNjesi = new javax.swing.JTextField();
        txtZbritja = new javax.swing.JTextField();
        txtShuma = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtTotali = new javax.swing.JTextField();
        txtKonsumatoriID = new javax.swing.JTextField();
        txtArtikulliID = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtStafiID = new javax.swing.JTextField();
        txtRuaj = new javax.swing.JButton();
        txtMbylle = new javax.swing.JButton();
        dtDataFaturimit = new org.jdesktop.swingx.JXDatePicker();
        btnReseto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("FATURA");

        jLabel3.setText("Data e faturimit:");

        jLabel4.setText("Sasia:");

        jLabel5.setText("Cmimi Njesi:");

        jLabel6.setText("Zbritja:");

        jLabel7.setText("Shuma:");

        txtSasia.setText(" ");
        txtSasia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSasiaActionPerformed(evt);
            }
        });

        txtCmimiNjesi.setText("  ");
        txtCmimiNjesi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCmimiNjesiActionPerformed(evt);
            }
        });

        txtZbritja.setText("  ");
        txtZbritja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtZbritjaActionPerformed(evt);
            }
        });

        txtShuma.setText("  ");
        txtShuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtShumaActionPerformed(evt);
            }
        });

        jLabel8.setText("Totali:");

        jLabel9.setText("KonsumatoriID:");

        jLabel10.setText("ArtikulliID:");

        txtTotali.setText(" ");
        txtTotali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotaliActionPerformed(evt);
            }
        });

        txtKonsumatoriID.setText(" ");
        txtKonsumatoriID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKonsumatoriIDActionPerformed(evt);
            }
        });

        txtArtikulliID.setText(" ");
        txtArtikulliID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtArtikulliIDActionPerformed(evt);
            }
        });

        jLabel11.setText("StafiID:");

        txtStafiID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStafiIDActionPerformed(evt);
            }
        });

        txtRuaj.setText("Ruaj");
        txtRuaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRuajActionPerformed(evt);
            }
        });

        txtMbylle.setText("Mbylle");

        btnReseto.setText("Reseto");
        btnReseto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel11))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(184, 184, 184)
                                .addComponent(txtRuaj)
                                .addGap(4, 4, 4)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addGap(108, 108, 108))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(42, 42, 42)
                                        .addComponent(txtMbylle)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnReseto))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(300, 300, 300)
                                        .addComponent(jLabel1))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtSasia, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(dtDataFaturimit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtCmimiNjesi, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                                    .addComponent(txtZbritja)
                                    .addComponent(txtShuma))))
                        .addGap(73, 73, 73)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtTotali, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                        .addComponent(txtKonsumatoriID)
                        .addComponent(txtArtikulliID))
                    .addComponent(txtStafiID, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(txtCmimiNjesi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8)
                                    .addComponent(txtTotali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(dtDataFaturimit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtZbritja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(txtKonsumatoriID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSasia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtShuma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txtArtikulliID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtStafiID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRuaj)
                    .addComponent(txtMbylle)
                    .addComponent(btnReseto))
                .addGap(0, 25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSasiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSasiaActionPerformed
        String text = txtSasia.getText();
        if (text != null) {
            if (!text.matches("[0-9]*")) {
                txtSasia.setText(" ");
            }
        }

    }//GEN-LAST:event_txtSasiaActionPerformed

    private void txtCmimiNjesiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCmimiNjesiActionPerformed
        String text = txtCmimiNjesi.getText();
        if (text != null) {
            if (!text.matches("[0-9]*")) {
                txtCmimiNjesi.setText(" ");
            }
        }

    }//GEN-LAST:event_txtCmimiNjesiActionPerformed

    private void txtZbritjaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtZbritjaActionPerformed
        String text = txtZbritja.getText();
        if (text != null) {
            if (!text.matches("[0-9]*")) {
                txtZbritja.setText(" ");
            }
    }//GEN-LAST:event_txtZbritjaActionPerformed
    }
    private void txtShumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtShumaActionPerformed

        String text = txtShuma.getText();
        if (text != null) {
            if (!text.matches("[0-9]*")) {
                txtShuma.setText(" ");
            }
        }
    }//GEN-LAST:event_txtShumaActionPerformed

    private void txtTotaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotaliActionPerformed
     String text = txtTotali.getText();
    if(text != null) {
        if(!text.matches("[0-9]*")) {
            txtTotali.setText(" ");  }}
    }//GEN-LAST:event_txtTotaliActionPerformed

    private void txtKonsumatoriIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKonsumatoriIDActionPerformed
        String text = txtKonsumatoriID.getText();
    if(text != null) {
        if(!text.matches("[0-9]*")) {
            txtKonsumatoriID.setText(" ");  }}
    }//GEN-LAST:event_txtKonsumatoriIDActionPerformed

    private void txtArtikulliIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtArtikulliIDActionPerformed
        String text = txtArtikulliID.getText();
    if(text != null) {
        if(!text.matches("[0-9]*")) {
            txtArtikulliID.setText(" "); }} 
    }//GEN-LAST:event_txtArtikulliIDActionPerformed

    private void txtStafiIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStafiIDActionPerformed
         String text = txtStafiID.getText();
    if(text != null) {
        if(!text.matches("[0-9]*")) {
            txtStafiID.setText(" ");  }}
    }//GEN-LAST:event_txtStafiIDActionPerformed

    private void txtRuajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRuajActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRuajActionPerformed

    private void btnResetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetoActionPerformed
txtSasia.setText("");
txtShuma.setText("");
txtCmimiNjesi.setText("");
txtZbritja.setText("");
txtTotali.setText(" ");

    }//GEN-LAST:event_btnResetoActionPerformed

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
            java.util.logging.Logger.getLogger(Faturat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Faturat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Faturat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Faturat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Faturat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReseto;
    private org.jdesktop.swingx.JXDatePicker dtDataFaturimit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtArtikulliID;
    private javax.swing.JTextField txtCmimiNjesi;
    private javax.swing.JTextField txtKonsumatoriID;
    private javax.swing.JButton txtMbylle;
    private javax.swing.JButton txtRuaj;
    private javax.swing.JTextField txtSasia;
    private javax.swing.JTextField txtShuma;
    private javax.swing.JTextField txtStafiID;
    private javax.swing.JTextField txtTotali;
    private javax.swing.JTextField txtZbritja;
    // End of variables declaration//GEN-END:variables
}
