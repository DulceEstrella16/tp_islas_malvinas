
import java.awt.Color;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author PC01
 */
public class TPMalvinas_7 extends javax.swing.JFrame {

    /**
     * Creates new form TPMalvinas_7
     */
    public TPMalvinas_7() {
        initComponents();
        siggg.setEnabled(false);
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
        jLabel2 = new javax.swing.JLabel();
        veintisiete = new javax.swing.JButton();
        primero = new javax.swing.JButton();
        dieciseis = new javax.swing.JButton();
        siggg = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC01\\Documents\\GitHub\\tp_islas_malvinas\\TPMalvinas\\Imagenes\\pregunta-7.png")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 880, 254));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("CUANDO SUCEDEN LOS PRIMEROS COMBATES EN LAS ISLAS MALVINAS?");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, 430, 40));

        veintisiete.setText("27 de Abril");
        veintisiete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                veintisieteMouseClicked(evt);
            }
        });
        veintisiete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                veintisieteActionPerformed(evt);
            }
        });
        getContentPane().add(veintisiete, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 363, 890, 36));

        primero.setText("1 de Mayo ");
        primero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                primeroMouseClicked(evt);
            }
        });
        getContentPane().add(primero, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 419, 890, 36));

        dieciseis.setText("16 de Mayo");
        dieciseis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dieciseisMouseClicked(evt);
            }
        });
        getContentPane().add(dieciseis, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 466, 890, 38));

        siggg.setText("siguiente pregunta");
        siggg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sigggMouseClicked(evt);
            }
        });
        siggg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sigggActionPerformed(evt);
            }
        });
        getContentPane().add(siggg, new org.netbeans.lib.awtextra.AbsoluteConstraints(608, 510, 282, 21));

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC01\\Documents\\GitHub\\tp_islas_malvinas\\TPMalvinas\\Imagenes\\000_blanco_blanco_7000.jpg")); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, 410, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC01\\Documents\\GitHub\\tp_islas_malvinas\\TPMalvinas\\Imagenes\\malv.png")); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 540));

        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, 400, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void veintisieteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_veintisieteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_veintisieteActionPerformed

    private void sigggActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sigggActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sigggActionPerformed

    private void veintisieteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_veintisieteMouseClicked
        veintisiete.setBackground(Color.RED);
        primero.setBackground(Color.GREEN);
        dieciseis.setBackground(Color.RED);

        veintisiete.setEnabled(false);
        primero.setEnabled(false);
        dieciseis.setEnabled(false);
        
        siggg.setEnabled(true);
    }//GEN-LAST:event_veintisieteMouseClicked

    private void sigggMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sigggMouseClicked
        setVisible(false);
        new TPMalvinas_8().setVisible(true);
    }//GEN-LAST:event_sigggMouseClicked

    private void primeroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_primeroMouseClicked
        veintisiete.setBackground(Color.RED);
        primero.setBackground(Color.GREEN);
        dieciseis.setBackground(Color.RED);

        veintisiete.setEnabled(false);
        primero.setEnabled(false);
        dieciseis.setEnabled(false);
        
        siggg.setEnabled(true);
        
        TPMalvinas.c ++; 
    }//GEN-LAST:event_primeroMouseClicked

    private void dieciseisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dieciseisMouseClicked
        veintisiete.setBackground(Color.RED);
        primero.setBackground(Color.GREEN);
        dieciseis.setBackground(Color.RED);

        veintisiete.setEnabled(false);
        primero.setEnabled(false);
        dieciseis.setEnabled(false);
        
        siggg.setEnabled(true);
    }//GEN-LAST:event_dieciseisMouseClicked

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
            java.util.logging.Logger.getLogger(TPMalvinas_7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TPMalvinas_7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TPMalvinas_7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TPMalvinas_7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TPMalvinas_7().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton dieciseis;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton primero;
    private javax.swing.JButton siggg;
    private javax.swing.JButton veintisiete;
    // End of variables declaration//GEN-END:variables
}
