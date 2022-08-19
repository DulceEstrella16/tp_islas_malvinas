

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
        siguiente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("INSERTE PREGUNTA");
        jLabel1.setIcon(new ImageIcon('C:\Users\PC01\Documents\GitHub\tp_islas_malvinas\TPMalvinas\Imagenes\pregunta-1.png'));

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(España, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Japon, javax.swing.GroupLayout.PREFERRED_SIZE, 921, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Reino_unido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 921, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(siguiente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(siguiente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EspañaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EspañaMouseClicked
        España.setBackground(Color.RED);
    }//GEN-LAST:event_EspañaMouseClicked

    private void Reino_unidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Reino_unidoMouseClicked
        Reino_unido.setBackground (Color.GREEN);
    }//GEN-LAST:event_Reino_unidoMouseClicked

    private void JaponMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JaponMouseClicked
        Japon.setBackground(Color.RED);
    }//GEN-LAST:event_JaponMouseClicked

    private void EspañaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EspañaMousePressed
        
    }//GEN-LAST:event_EspañaMousePressed

    private void siguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguienteActionPerformed

    }//GEN-LAST:event_siguienteActionPerformed

    private void siguienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_siguienteMouseClicked
     setVisible(false);
     new TPMalvinas_2().setVisible(true);
    }//GEN-LAST:event_siguienteMouseClicked

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
    private javax.swing.JButton siguiente;
    // End of variables declaration//GEN-END:variables
}
