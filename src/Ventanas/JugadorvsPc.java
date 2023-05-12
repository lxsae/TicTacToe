
package Ventanas;
import Jugador.Jugador;

/**
 *
 * @author ivan
 */

public class JugadorvsPc extends javax.swing.JFrame {
    
    Jugador jugador;
    
    public JugadorvsPc(Jugador jugador) {
        this.jugador = jugador;
        initComponents();
    }
    
    public JugadorvsPc() {
        initComponents();
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        botonPlay = new javax.swing.JButton();
        txtName = new javax.swing.JTextField();
        lblJ1 = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        lblfondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 102, 102));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonPlay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Juega.png"))); // NOI18N
        botonPlay.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        botonPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPlayActionPerformed(evt);
            }
        });
        jPanel1.add(botonPlay, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 80, 50));

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        jPanel1.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 280, 30));

        lblJ1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblJ1.setText("JUGADOR 1");
        jPanel1.add(lblJ1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, -1, -1));

        lblTitulo.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        lblTitulo.setText("ESCRIBE TU NOMBRE");
        jPanel1.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, -1, -1));

        lblfondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondoo.png"))); // NOI18N
        jPanel1.add(lblfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 290));

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

    private void botonPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPlayActionPerformed
        //Jugador jugadosr = new Jugador();
        String Ingresaname = txtName.getText();
        jugador.name1 = Ingresaname;
        JuegovsPc JvsPc = new JuegovsPc(jugador);
        JvsPc.setVisible(true);
        JvsPc.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_botonPlayActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonPlay;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblJ1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblfondo;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
