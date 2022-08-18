package tpmalvinas;

import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TPMalvinas extends javax.swing.JFrame {

    public TPMalvinas() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Japon = new javax.swing.JButton();
        España = new javax.swing.JButton();
        Reino_unido = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("INSERTE PREGUNTA");

        Japon.setText("Japon");
        Japon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JaponMouseClicked(evt);
            }
        });

        España.setText("España");
        España.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EspañaMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                EspañaMousePressed(evt);
            }
        });

        Reino_unido.setText("Reino Unido");
        Reino_unido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Reino_unidoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(España, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Reino_unido, javax.swing.GroupLayout.PREFERRED_SIZE, 921, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Japon, javax.swing.GroupLayout.PREFERRED_SIZE, 921, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(España, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Reino_unido, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Japon, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EspañaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EspañaMouseClicked
        España.setBackground(Color.RED);
        setVisible(false);
    }//GEN-LAST:event_EspañaMouseClicked

    private void Reino_unidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Reino_unidoMouseClicked
        Reino_unido.setBackground (Color.GREEN);
        setVisible(false);
    }//GEN-LAST:event_Reino_unidoMouseClicked

    private void JaponMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JaponMouseClicked
        Japon.setBackground(Color.RED);
        setVisible(false);
    }//GEN-LAST:event_JaponMouseClicked

    private void EspañaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EspañaMousePressed
        
    }//GEN-LAST:event_EspañaMousePressed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TPMalvinas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton España;
    private javax.swing.JButton Japon;
    private javax.swing.JButton Reino_unido;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
