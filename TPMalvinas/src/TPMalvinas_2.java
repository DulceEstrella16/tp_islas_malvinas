
import java.awt.Color;

public class TPMalvinas_2 extends javax.swing.JFrame {

    public TPMalvinas_2() {
        initComponents();
        siguiente.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        milochoveintitres = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        milochotreintaytres = new javax.swing.JButton();
        milochocuarentaytres = new javax.swing.JButton();
        siguiente = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("INSERTE PREGUNTA");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        milochoveintitres.setText("1823");
        milochoveintitres.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                milochoveintitresMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                milochoveintitresMousePressed(evt);
            }
        });
        getContentPane().add(milochoveintitres, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 387, 880, 32));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC01\\Documents\\GitHub\\tp_islas_malvinas\\TPMalvinas\\Imagenes\\pregunta-2.png")); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 880, -1));

        milochotreintaytres.setText("1833");
        milochotreintaytres.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                milochotreintaytresMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                milochotreintaytresMousePressed(evt);
            }
        });
        getContentPane().add(milochotreintaytres, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 468, 880, 32));

        milochocuarentaytres.setText("1843");
        milochocuarentaytres.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                milochocuarentaytresMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                milochocuarentaytresMousePressed(evt);
            }
        });
        getContentPane().add(milochocuarentaytres, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 425, 880, 32));

        siguiente.setText("siguiente pregunta");
        siguiente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                siguienteMouseClicked(evt);
            }
        });
        siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siguienteActionPerformed(evt);
            }
        });
        getContentPane().add(siguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(659, 509, 231, 24));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("¿EN QUE AÑO EL REINO UNIDO TOMO A LA FUERZA LAS ISLAS MALVINAS?");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, 470, 20));

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC01\\Documents\\GitHub\\tp_islas_malvinas\\TPMalvinas\\Imagenes\\000_blanco_blanco_7000.jpg")); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, 480, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC01\\Documents\\GitHub\\tp_islas_malvinas\\TPMalvinas\\Imagenes\\malv.png")); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents
  
    private void milochoveintitresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_milochoveintitresMouseClicked
       milochotreintaytres.setBackground(Color.GREEN);
       milochoveintitres.setBackground(Color.RED);
       milochocuarentaytres.setBackground(Color.RED);
       
       milochotreintaytres.setEnabled(false);
       milochoveintitres.setEnabled(false);
       milochocuarentaytres.setEnabled(false);
       
       siguiente.setEnabled(true);
    }//GEN-LAST:event_milochoveintitresMouseClicked
        
    private void milochoveintitresMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_milochoveintitresMousePressed

    }//GEN-LAST:event_milochoveintitresMousePressed

    private void milochotreintaytresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_milochotreintaytresMouseClicked
       milochotreintaytres.setBackground(Color.GREEN);
       milochoveintitres.setBackground(Color.RED);
       milochocuarentaytres.setBackground(Color.RED);
       
       milochotreintaytres.setEnabled(false);
       milochoveintitres.setEnabled(false);
       milochocuarentaytres.setEnabled(false);
       
       siguiente.setEnabled(true);
       TPMalvinas.c ++; 
    }//GEN-LAST:event_milochotreintaytresMouseClicked

    private void milochotreintaytresMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_milochotreintaytresMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_milochotreintaytresMousePressed

    private void milochocuarentaytresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_milochocuarentaytresMouseClicked
        milochotreintaytres.setBackground(Color.GREEN);
       milochoveintitres.setBackground(Color.RED);
       milochocuarentaytres.setBackground(Color.RED);
       
       milochotreintaytres.setEnabled(false);
       milochoveintitres.setEnabled(false);
       milochocuarentaytres.setEnabled(false);
       
       siguiente.setEnabled(true);
    }//GEN-LAST:event_milochocuarentaytresMouseClicked

    private void milochocuarentaytresMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_milochocuarentaytresMousePressed

    }//GEN-LAST:event_milochocuarentaytresMousePressed

    private void siguienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_siguienteMouseClicked
        
    }//GEN-LAST:event_siguienteMouseClicked

    private void siguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguienteActionPerformed
setVisible(false);
        new TPMalvinas_3().setVisible(true);
    }//GEN-LAST:event_siguienteActionPerformed

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
            java.util.logging.Logger.getLogger(TPMalvinas_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TPMalvinas_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TPMalvinas_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TPMalvinas_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TPMalvinas_2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton milochocuarentaytres;
    private javax.swing.JButton milochotreintaytres;
    private javax.swing.JButton milochoveintitres;
    private javax.swing.JButton siguiente;
    // End of variables declaration//GEN-END:variables
}
