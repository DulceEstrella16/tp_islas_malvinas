
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
public class TPMalvinas_5 extends javax.swing.JFrame {

    /**
     * Creates new form TPMalvinas_5
     */
    public TPMalvinas_5() {
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

        jLabel2 = new javax.swing.JLabel();
        ppvl = new javax.swing.JButton();
        pcvp = new javax.swing.JButton();
        pbcl = new javax.swing.JButton();
        sig5 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("¿QUE PAISES APOYABAN A ARGETINA EN ESTA GUERRA?");

        ppvl.setText("Panamá, Perú, Venezuela y la unión Soviética ");
        ppvl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ppvlMouseClicked(evt);
            }
        });

        pcvp.setText("Panamá, Colombia, Venezuela y Paraguay");
        pcvp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pcvpMouseClicked(evt);
            }
        });
        pcvp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pcvpActionPerformed(evt);
            }
        });

        pbcl.setText("Panamá, Brasil, Chile y la unión Soviética");
        pbcl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pbclMouseClicked(evt);
            }
        });

        sig5.setText("siguiente pregunta");
        sig5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sig5MouseClicked(evt);
            }
        });
        sig5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sig5ActionPerformed(evt);
            }
        });

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC01\\Documents\\GitHub\\tp_islas_malvinas\\TPMalvinas\\Imagenes\\pregunta-5.png")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 880, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ppvl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pcvp, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pbcl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(sig5, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(ppvl, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pcvp, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pbcl, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(sig5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pcvpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pcvpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pcvpActionPerformed

    private void sig5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sig5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sig5ActionPerformed

    private void ppvlMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ppvlMouseClicked
        ppvl.setBackground(Color.GREEN);
        pcvp.setBackground(Color.RED);
        pbcl.setBackground(Color.RED);

        ppvl.setEnabled(false);
        pcvp.setEnabled(false);
        pbcl.setEnabled(false);
        
        TPMalvinas.c ++;                   
    }//GEN-LAST:event_ppvlMouseClicked

    private void pcvpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pcvpMouseClicked
        pcvp.setBackground(Color.RED);
        ppvl.setBackground(Color.GREEN);
        pbcl.setBackground(Color.RED);

        ppvl.setEnabled(false);
        pcvp.setEnabled(false);
        pbcl.setEnabled(false);
        
    }//GEN-LAST:event_pcvpMouseClicked

    private void pbclMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pbclMouseClicked
        pcvp.setBackground(Color.RED);
        ppvl.setBackground(Color.GREEN);
        pbcl.setBackground(Color.RED);
        
       ppvl.setEnabled(false);
       pcvp.setEnabled(false);
       pbcl.setEnabled(false);
    }//GEN-LAST:event_pbclMouseClicked

    private void sig5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sig5MouseClicked
        setVisible(false);
        new TPMalvinas_6().setVisible(true);
    }//GEN-LAST:event_sig5MouseClicked

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
            java.util.logging.Logger.getLogger(TPMalvinas_5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TPMalvinas_5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TPMalvinas_5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TPMalvinas_5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TPMalvinas_5().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton pbcl;
    private javax.swing.JButton pcvp;
    private javax.swing.JButton ppvl;
    private javax.swing.JButton sig5;
    // End of variables declaration//GEN-END:variables
}
