
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
public class TPMalvinas_4 extends javax.swing.JFrame {

    /**
     * Creates new form TPMalvinas_4
     */
    public TPMalvinas_4() {
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
        jLabel2 = new javax.swing.JLabel();
        veintiochom = new javax.swing.JButton();
        dieciochom = new javax.swing.JButton();
        dieciochoa = new javax.swing.JButton();
        sig = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC01\\Documents\\GitHub\\tp_islas_malvinas\\TPMalvinas\\Imagenes\\preunta-4.png")); // NOI18N

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("EN QUE AÑO LA FLOTA ARGENTINA ");

        veintiochom.setText("28 de Marzo de 1982");
        veintiochom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                veintiochomMouseClicked(evt);
            }
        });

        dieciochom.setText("18 de Marzo de 1982");
        dieciochom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dieciochomMouseClicked(evt);
            }
        });

        dieciochoa.setText("18 de Abril de 1982");
        dieciochoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dieciochoaMouseClicked(evt);
            }
        });

        sig.setText("siguiente pregunta");
        sig.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sigMouseClicked(evt);
            }
        });
        sig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sigActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(veintiochom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dieciochom, javax.swing.GroupLayout.DEFAULT_SIZE, 880, Short.MAX_VALUE)
                    .addComponent(dieciochoa, javax.swing.GroupLayout.DEFAULT_SIZE, 880, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(sig, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(dieciochom, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(veintiochom, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(dieciochoa, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(sig)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sigActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sigActionPerformed

    private void dieciochomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dieciochomMouseClicked
       veintiochom.setBackground(Color.GREEN);
        dieciochoa.setBackground(Color.RED);
        dieciochom.setBackground(Color.RED);
        
        veintiochom.setEnabled(false);
       dieciochoa.setEnabled(false);
       dieciochom.setEnabled(false);
    }//GEN-LAST:event_dieciochomMouseClicked

    private void veintiochomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_veintiochomMouseClicked
        veintiochom.setBackground(Color.GREEN);
        dieciochoa.setBackground(Color.RED);
        dieciochom.setBackground(Color.RED);
        
        veintiochom.setEnabled(false);
       dieciochoa.setEnabled(false);
       dieciochom.setEnabled(false);
       
       TPMalvinas.c ++; 
    }//GEN-LAST:event_veintiochomMouseClicked

    private void dieciochoaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dieciochoaMouseClicked
        veintiochom.setBackground(Color.GREEN);
        dieciochoa.setBackground(Color.RED);
        dieciochom.setBackground(Color.RED);
        
        veintiochom.setEnabled(false);
       dieciochoa.setEnabled(false);
       dieciochom.setEnabled(false);
    }//GEN-LAST:event_dieciochoaMouseClicked

    private void sigMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sigMouseClicked
        setVisible(false);
        new TPMalvinas_5().setVisible(true);
    }//GEN-LAST:event_sigMouseClicked

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
            java.util.logging.Logger.getLogger(TPMalvinas_4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TPMalvinas_4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TPMalvinas_4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TPMalvinas_4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TPMalvinas_4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton dieciochoa;
    private javax.swing.JButton dieciochom;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton sig;
    private javax.swing.JButton veintiochom;
    // End of variables declaration//GEN-END:variables
}