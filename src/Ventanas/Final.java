package Ventanas;

import Jugador.Jugador;
import javax.swing.JLabel;
/**
 *
 * @author ivan
 */

public class Final extends javax.swing.JFrame {

    Jugador jugador;
    
    public Final(Jugador jugador) {
        this.jugador = jugador;
        initComponents();
        jPanel1.repaint();
        Player1.setText(jugador.name1);
        Player2.setText(jugador.name2);
        String Gano1 = Integer.toString(jugador.vJugador1);
        String Gano2 = Integer.toString(jugador.vJugador2);
        
        vJugador1.setText(Gano1);
        vJugador2.setText(Gano2);
        
        
    }
    
    public Final() {
        initComponents();
       
       
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnplay = new javax.swing.JButton();
        Player2 = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        Player1 = new javax.swing.JLabel();
        vJugador1 = new javax.swing.JLabel();
        vJugador2 = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnplay.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        btnplay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Juega.png"))); // NOI18N
        btnplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnplayActionPerformed(evt);
            }
        });
        jPanel1.add(btnplay, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 130, 50));

        Player2.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        Player2.setForeground(new java.awt.Color(51, 255, 0));
        Player2.setText("PLAYER 2");
        jPanel1.add(Player2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, -1, -1));

        lblTitulo.setFont(new java.awt.Font("Algerian", 1, 36)); // NOI18N
        lblTitulo.setText("VICTORIA");
        jPanel1.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, -1, -1));

        Player1.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        Player1.setForeground(new java.awt.Color(255, 0, 0));
        Player1.setText("PLAYER 1");
        jPanel1.add(Player1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, -1, -1));

        vJugador1.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        vJugador1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(vJugador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 30, -1));

        vJugador2.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        vJugador2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(vJugador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, 60, -1));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Resultado.png"))); // NOI18N
        jPanel1.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 310));

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

    private void btnplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnplayActionPerformed
        Menu inicio = new Menu();
        inicio.setVisible(true);
        inicio.setLocationRelativeTo(null);
        this.setVisible(false);
        
    }//GEN-LAST:event_btnplayActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel Player1;
    private javax.swing.JLabel Player2;
    private javax.swing.JButton btnplay;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel vJugador1;
    private javax.swing.JLabel vJugador2;
    // End of variables declaration//GEN-END:variables
}
