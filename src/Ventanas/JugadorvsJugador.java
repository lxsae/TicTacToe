package Ventanas;

import Jugador.Jugador;

/**
 *
 * @author ivan
 */

public class JugadorvsJugador extends javax.swing.JFrame {

    Jugador jugador;
    
    public JugadorvsJugador(Jugador jugador) {
        this.jugador = jugador;
        initComponents();
    }
    
    public JugadorvsJugador() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        botonPlay = new javax.swing.JButton();
        txtname2 = new javax.swing.JTextField();
        txtname1 = new javax.swing.JTextField();
        lblJ2 = new javax.swing.JLabel();
        lblJ1 = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonPlay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Juega.png"))); // NOI18N
        botonPlay.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        botonPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPlayActionPerformed(evt);
            }
        });
        jPanel1.add(botonPlay, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 120, 50));
        jPanel1.add(txtname2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 280, 30));
        jPanel1.add(txtname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 280, 30));

        lblJ2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblJ2.setText("JUGADOR 2");
        jPanel1.add(lblJ2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, -1, -1));

        lblJ1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblJ1.setText("JUGADOR 1");
        jPanel1.add(lblJ1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, -1, -1));

        lblTitulo.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        lblTitulo.setText("ESCRIBE TU NOMBRE");
        jPanel1.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondoo.png"))); // NOI18N
        jPanel1.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 290));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPlayActionPerformed
        //Jugador jugador = new Jugador();
        String Ingresaname1 = txtname1.getText();
        String Ingresaname2 = txtname2.getText();
        jugador.name1 = Ingresaname1;
        jugador.name2 = Ingresaname2;
        Juego j = new Juego(jugador);
        j.setVisible(true);
        j.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_botonPlayActionPerformed

    /**
     * @param args the command line arguments
     */
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonPlay;
    private javax.swing.JLabel fondo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblJ1;
    private javax.swing.JLabel lblJ2;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtname1;
    private javax.swing.JTextField txtname2;
    // End of variables declaration//GEN-END:variables
}
