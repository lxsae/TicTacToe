
package Ventanas;

import Jugador.Jugador;

/**
 *
 * @author ivan
 */
public class Menu extends javax.swing.JFrame {
    int Partidas = 0;
    public Menu() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnregresar = new javax.swing.JButton();
        JugadorvsJugador = new javax.swing.JButton();
        JvsPc = new javax.swing.JButton();
        Ronda1 = new javax.swing.JButton();
        Ronda4 = new javax.swing.JButton();
        Ronda2 = new javax.swing.JButton();
        Ronda3 = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnregresar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnregresar.setBorder(null);
        btnregresar.setBorderPainted(false);
        btnregresar.setContentAreaFilled(false);
        btnregresar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnregresar.setFocusPainted(false);
        btnregresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregresarActionPerformed(evt);
            }
        });
        jPanel1.add(btnregresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 60, 40));

        JugadorvsJugador.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        JugadorvsJugador.setBorderPainted(false);
        JugadorvsJugador.setContentAreaFilled(false);
        JugadorvsJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JugadorvsJugadorActionPerformed(evt);
            }
        });
        jPanel1.add(JugadorvsJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 80, 50));

        JvsPc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        JvsPc.setBorderPainted(false);
        JvsPc.setContentAreaFilled(false);
        JvsPc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JvsPcActionPerformed(evt);
            }
        });
        jPanel1.add(JvsPc, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, 70, 50));

        Ronda1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Ronda1.setBorderPainted(false);
        Ronda1.setContentAreaFilled(false);
        Ronda1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ronda1ActionPerformed(evt);
            }
        });
        jPanel1.add(Ronda1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 40, 30));

        Ronda4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Ronda4.setBorderPainted(false);
        Ronda4.setContentAreaFilled(false);
        Ronda4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ronda4ActionPerformed(evt);
            }
        });
        jPanel1.add(Ronda4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 190, 40, 30));

        Ronda2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Ronda2.setBorderPainted(false);
        Ronda2.setContentAreaFilled(false);
        Ronda2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ronda2ActionPerformed(evt);
            }
        });
        jPanel1.add(Ronda2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, 40, 30));

        Ronda3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Ronda3.setBorderPainted(false);
        Ronda3.setContentAreaFilled(false);
        Ronda3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ronda3ActionPerformed(evt);
            }
        });
        jPanel1.add(Ronda3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, 40, 30));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/menu.png"))); // NOI18N
        jPanel1.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -20, 520, 370));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JugadorvsJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JugadorvsJugadorActionPerformed
        Jugador jugador = new Jugador();
        jugador.numPartidas = Partidas;    
        JugadorvsJugador JvsJ= new JugadorvsJugador(jugador);
        JvsJ.setVisible(true);
        JvsJ.setLocationRelativeTo(null);
        
        this.dispose();    
    }//GEN-LAST:event_JugadorvsJugadorActionPerformed

    private void JvsPcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JvsPcActionPerformed
         // TODO add your handling code here:
        Jugador jugador = new Jugador();
        jugador.numPartidas = Partidas;
        jugador.automatic = true;
        JugadorvsPc JvsPc = new JugadorvsPc(jugador);
        JvsPc.setVisible(true);
        JvsPc.setLocationRelativeTo(null);
        this.dispose();
       
         
    }//GEN-LAST:event_JvsPcActionPerformed

    private void Ronda1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ronda1ActionPerformed
        Partidas = 1;
    }//GEN-LAST:event_Ronda1ActionPerformed

    private void btnregresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregresarActionPerformed
        VentanaPrincipal ventanaPrincipal = new VentanaPrincipal();
        ventanaPrincipal.setVisible(true);
        ventanaPrincipal.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_btnregresarActionPerformed

    private void Ronda2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ronda2ActionPerformed
        Partidas = 2;
    }//GEN-LAST:event_Ronda2ActionPerformed

    private void Ronda3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ronda3ActionPerformed
        Partidas = 3;
    }//GEN-LAST:event_Ronda3ActionPerformed

    private void Ronda4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ronda4ActionPerformed
        Partidas = 4;
    }//GEN-LAST:event_Ronda4ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton JugadorvsJugador;
    private javax.swing.JButton JvsPc;
    private javax.swing.JButton Ronda1;
    private javax.swing.JButton Ronda2;
    private javax.swing.JButton Ronda3;
    private javax.swing.JButton Ronda4;
    private javax.swing.JButton btnregresar;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
