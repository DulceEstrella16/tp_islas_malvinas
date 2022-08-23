
import java.awt.Color;

public class TPMalvinas_2 extends javax.swing.JFrame {

    public TPMalvinas_2() {
        initComponents();
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

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("INSERTE PREGUNTA");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        milochoveintitres.setText("1823");
        milochoveintitres.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                milochoveintitresMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                milochoveintitresMousePressed(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC01\\Documents\\GitHub\\tp_islas_malvinas\\TPMalvinas\\Imagenes\\pregunta-2.png")); // NOI18N

        milochotreintaytres.setText("1833");
        milochotreintaytres.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                milochotreintaytresMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                milochotreintaytresMousePressed(evt);
            }
        });

        milochocuarentaytres.setText("1843");
        milochocuarentaytres.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                milochocuarentaytresMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                milochocuarentaytresMousePressed(evt);
            }
        });

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

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("EN QUE AÑO REINO UNIDO LLEGO A LAS ISLAS MALVINAS Y ECHO A ARGENTINA?");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(milochoveintitres, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(milochocuarentaytres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(milochotreintaytres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 651, Short.MAX_VALUE)
                        .addComponent(siguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(milochoveintitres, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(milochocuarentaytres, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(milochotreintaytres, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(siguiente, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void milochoveintitresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_milochoveintitresMouseClicked
        milochoveintitres.setBackground(Color.RED);
    }//GEN-LAST:event_milochoveintitresMouseClicked

    private void milochoveintitresMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_milochoveintitresMousePressed

    }//GEN-LAST:event_milochoveintitresMousePressed

    private void milochotreintaytresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_milochotreintaytresMouseClicked
       milochotreintaytres.setBackground(Color.GREEN);
    }//GEN-LAST:event_milochotreintaytresMouseClicked

    private void milochotreintaytresMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_milochotreintaytresMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_milochotreintaytresMousePressed

    private void milochocuarentaytresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_milochocuarentaytresMouseClicked
        milochocuarentaytres.setBackground(Color.RED);
    }//GEN-LAST:event_milochocuarentaytresMouseClicked

    private void milochocuarentaytresMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_milochocuarentaytresMousePressed

    }//GEN-LAST:event_milochocuarentaytresMousePressed

    private void siguienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_siguienteMouseClicked
        setVisible(false);
        new TPMalvinas_3().setVisible(true);
    }//GEN-LAST:event_siguienteMouseClicked

    private void siguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguienteActionPerformed

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
    private javax.swing.JButton milochocuarentaytres;
    private javax.swing.JButton milochotreintaytres;
    private javax.swing.JButton milochoveintitres;
    private javax.swing.JButton siguiente;
    // End of variables declaration//GEN-END:variables
}
