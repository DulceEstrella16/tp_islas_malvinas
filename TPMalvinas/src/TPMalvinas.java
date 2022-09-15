

import java.awt.Color;


public class TPMalvinas extends javax.swing.JFrame {
public static int c= 0;
    public TPMalvinas() {
        initComponents();
        siguiente.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Japon = new javax.swing.JButton();
        España = new javax.swing.JButton();
        Reino_unido = new javax.swing.JButton();
        siguiente = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC01\\Documents\\GitHub\\tp_islas_malvinas\\TPMalvinas\\Imagenes\\pregunta-1.png")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 18, 880, 190));

        Japon.setText("Japon");
        Japon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JaponMouseClicked(evt);
            }
        });
        getContentPane().add(Japon, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 880, 35));

        España.setText("España");
        España.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EspañaMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                EspañaMousePressed(evt);
            }
        });
        getContentPane().add(España, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 401, 880, 32));

        Reino_unido.setText("Reino Unido");
        Reino_unido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Reino_unidoMouseClicked(evt);
            }
        });
        getContentPane().add(Reino_unido, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 444, 880, 35));

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
        getContentPane().add(siguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(659, 531, 231, -1));

        jLabel2.setBackground(new java.awt.Color(204, 204, 204));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("¿CON QUE PAIS ARGENTINA ESTUVO EN GUERRA EN LAS ISLAS MALVINAS?");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, 430, 20));

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC01\\Documents\\GitHub\\tp_islas_malvinas\\TPMalvinas\\Imagenes\\000_blanco_blanco_7000.jpg")); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, 450, 40));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC01\\Documents\\GitHub\\tp_islas_malvinas\\TPMalvinas\\Imagenes\\malv.png")); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 570));

        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EspañaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EspañaMouseClicked
        España.setBackground(Color.RED);
        Reino_unido.setBackground (Color.GREEN);
        Japon.setBackground(Color.RED);
        
        España.setEnabled(false);
        Reino_unido.setEnabled(false);
        Japon.setEnabled(false);
        
        siguiente.setEnabled(true);
    }//GEN-LAST:event_EspañaMouseClicked

    private void Reino_unidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Reino_unidoMouseClicked
        España.setBackground(Color.RED);
        Reino_unido.setBackground (Color.GREEN);
        Japon.setBackground(Color.RED);
        
        España.setEnabled(false);
        Reino_unido.setEnabled(false);
        Japon.setEnabled(false);
        
        siguiente.setEnabled(true);
        c = c+1;
    }//GEN-LAST:event_Reino_unidoMouseClicked

    private void JaponMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JaponMouseClicked
        España.setBackground(Color.RED);
        Reino_unido.setBackground (Color.GREEN);
        Japon.setBackground(Color.RED);
        
        España.setEnabled(false);
        Reino_unido.setEnabled(false);
        Japon.setEnabled(false);
        
        siguiente.setEnabled(true);
    }//GEN-LAST:event_JaponMouseClicked

    private void EspañaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EspañaMousePressed
        
    }//GEN-LAST:event_EspañaMousePressed

    private void siguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguienteActionPerformed
setVisible(false);
     new TPMalvinas_2().setVisible(true);
    }//GEN-LAST:event_siguienteActionPerformed

    private void siguienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_siguienteMouseClicked
     
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton siguiente;
    // End of variables declaration//GEN-END:variables
}
