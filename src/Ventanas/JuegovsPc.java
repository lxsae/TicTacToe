package Ventanas;

import Jugador.Jugador;
import java.awt.Color;
import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;

import javax.swing.JLabel;
import java.util.Random;
import javax.swing.BorderFactory;

/**
 *
 * @author ivan
 */
public class JuegovsPc extends javax.swing.JFrame implements KeyEventDispatcher {

    public int posicion;
    boolean automatico = false, automaticoAux = false, estado = true;
    String continua = "O";
    int cuentaPartidas = 1, J1Gana = 0, J2Gana = 0;
    private int Selecciona = -1;

    String turno = "X";
    JLabel lbl[] = new JLabel[9];
    Jugador jugador;
    int combinaciones[][] = {
        //Estan son las distintas formas de ganar una ronda
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9},
        {1, 4, 7},
        {2, 5, 8},
        {3, 6, 9},
        {3, 5, 7},
        {1, 5, 9},};

    public JuegovsPc(Jugador jugador) {

        this.jugador = jugador;
        initComponents();
        if (jugador.automatic == true) {
            automatico = true;
            automaticoAux = true;
        }
        lblJugador.setText(jugador.name1);
        lblPc.setText(jugador.name2);
        Rondas.setText("RONDA # " + Integer.toString(cuentaPartidas));
        KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(this);
        this.requestFocus();

        lbl[0] = lbl1;
        lbl[1] = lbl2;
        lbl[2] = lbl3;
        lbl[3] = lbl4;
        lbl[4] = lbl5;
        lbl[5] = lbl6;
        lbl[6] = lbl7;
        lbl[7] = lbl8;
        lbl[8] = lbl9;

    }

    public JuegovsPc() {
        initComponents();
        KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(this);
        this.requestFocus();
    }

    public void presionar(int posicion) {
        int contador = 0;
        if (lbl[posicion - 1].getText().equals("") && estado == true) {
            lbl[posicion - 1].setText(turno);
            comprobarGanador();
            otroTurno();
            if (automatico == true) {

                while (contador == 0) {
                    Random rand = new Random();
                    int numAleatorio = rand.nextInt(9);
                    if (lbl[numAleatorio].getText().equals("") && estado == true) {
                        lbl[numAleatorio].setText(turno);
                        comprobarGanador();
                        otroTurno();
                        contador = 1;
                    }
                }
            }
        }
    }

    public void otroTurno() {
        if (turno == "X") {
            turno = "O";
        } else {
            turno = "X";
        }
    }

    public void comprobarGanador() {
        for (int i = 0; i < combinaciones.length; i++) {
            if (lbl[combinaciones[i][0] - 1].getText().equals("X")
                    && lbl[combinaciones[i][1] - 1].getText().equals("X")
                    && lbl[combinaciones[i][2] - 1].getText().equals("X")) {
                J1Gana++;
                automatico = false;
                estado = false;
            }
            if (lbl[combinaciones[i][0] - 1].getText().equals("O")
                    && lbl[combinaciones[i][1] - 1].getText().equals("O")
                    && lbl[combinaciones[i][2] - 1].getText().equals("O")) {
                J2Gana++;
                automatico = false;
                estado = false;
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnSalir = new javax.swing.JButton();
        btnSiguiente = new javax.swing.JButton();
        lblGanaJ1 = new javax.swing.JLabel();
        lblGanaJ2 = new javax.swing.JLabel();
        Rondas = new javax.swing.JLabel();
        lbl1 = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        lbl3 = new javax.swing.JLabel();
        lbl4 = new javax.swing.JLabel();
        lbl5 = new javax.swing.JLabel();
        lbl6 = new javax.swing.JLabel();
        lbl7 = new javax.swing.JLabel();
        lbl8 = new javax.swing.JLabel();
        lbl9 = new javax.swing.JLabel();
        lblTablero = new javax.swing.JLabel();
        lblPc = new javax.swing.JLabel();
        lblJugador = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Salir.png"))); // NOI18N
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, 80, 60));

        btnSiguiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Siguiente.png"))); // NOI18N
        btnSiguiente.setText("OTRA RONDA");
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });
        jPanel1.add(btnSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 310, 130, 40));

        lblGanaJ1.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        lblGanaJ1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGanaJ1.setText("0");
        lblGanaJ1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(lblGanaJ1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, 70, 40));

        lblGanaJ2.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        lblGanaJ2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGanaJ2.setText("0");
        lblGanaJ2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(lblGanaJ2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, 70, 40));

        Rondas.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jPanel1.add(Rondas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        lbl1.setBackground(new java.awt.Color(255, 255, 255));
        lbl1.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        lbl1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl1MousePressed(evt);
            }
        });
        lbl1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lbl1KeyPressed(evt);
            }
        });
        jPanel1.add(lbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 60, 50));

        lbl2.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        lbl2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl2MousePressed(evt);
            }
        });
        lbl2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lbl2KeyPressed(evt);
            }
        });
        jPanel1.add(lbl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 60, 50));

        lbl3.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        lbl3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl3MousePressed(evt);
            }
        });
        jPanel1.add(lbl3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, 50, 50));

        lbl4.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        lbl4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl4MousePressed(evt);
            }
        });
        jPanel1.add(lbl4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 60, 50));

        lbl5.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        lbl5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl5MousePressed(evt);
            }
        });
        jPanel1.add(lbl5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 60, 60));

        lbl6.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        lbl6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl6MousePressed(evt);
            }
        });
        jPanel1.add(lbl6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, 50, 60));

        lbl7.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        lbl7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 102, 0), 0));
        lbl7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl7MousePressed(evt);
            }
        });
        jPanel1.add(lbl7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 60, 50));

        lbl8.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        lbl8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl8MousePressed(evt);
            }
        });
        jPanel1.add(lbl8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 50, 50));

        lbl9.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        lbl9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl9MousePressed(evt);
            }
        });
        jPanel1.add(lbl9, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, 50, 50));

        lblTablero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoJuego.png"))); // NOI18N
        jPanel1.add(lblTablero, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 280, 200));

        lblPc.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jPanel1.add(lblPc, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 280, 50, 20));

        lblJugador.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jPanel1.add(lblJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 70, 30));

        Fondo.setBackground(new java.awt.Color(255, 255, 255));
        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondoo.png"))); // NOI18N
        Fondo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                FondoKeyPressed(evt);
            }
        });
        jPanel1.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 520, 370));

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

    private void lbl1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl1MousePressed
        presionar(1);
    }//GEN-LAST:event_lbl1MousePressed

    private void lbl2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl2MousePressed
        presionar(2);
    }//GEN-LAST:event_lbl2MousePressed

    private void lbl4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl4MousePressed
        presionar(4);
    }//GEN-LAST:event_lbl4MousePressed

    private void lbl5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl5MousePressed
        presionar(5);
    }//GEN-LAST:event_lbl5MousePressed

    private void lbl6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl6MousePressed
        presionar(6);
    }//GEN-LAST:event_lbl6MousePressed

    private void lbl7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl7MousePressed
        presionar(7);
    }//GEN-LAST:event_lbl7MousePressed

    private void lbl8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl8MousePressed
        presionar(8);
    }//GEN-LAST:event_lbl8MousePressed

    private void lbl9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl9MousePressed
        presionar(9);
    }//GEN-LAST:event_lbl9MousePressed


    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        
        /*  Actualiza la etiqueta "Rondas" para mostrar el número de la ronda actual 
            y también actualiza los marcadores de cada jugador.
        */
        Rondas.setText("RONDA # " + Integer.toString(cuentaPartidas));
        jugador.vJugador1 = J1Gana;
        jugador.vJugador2 = J2Gana;
        lblGanaJ1.setText(Integer.toString(jugador.vJugador1));
        lblGanaJ2.setText(Integer.toString(jugador.vJugador2));
        
        
        if (J1Gana == 0 && J2Gana == 0) {
            cuentaPartidas--;
        }
       
        /*  Incrementa la cuenta de partidas en uno y establece el estado del juego en "verdadero". 
            actualizamos el valor de la variable "turno" a "continua", que es el jugador que tendrá el próximo turno. 
            Si el jugador actual es "O", cambia "continua" a "X", y viceversa.
        */
        
        cuentaPartidas++;
        estado = true;
        turno = continua;
        if (continua.equals("O")) {
            continua = "X";
        } else {
            continua = "O";
        }
        

        
        
        /*  Si aún quedan partidas por jugar, se borran todos los textos en los componentes 
            de la interfaz de usuario "lbl" para prepararse para la siguiente ronda. 
            Si ya se han jugado todas las partidas, se muestra una ventana emergente con 
            los resultados finales del juego.   
        */
        if (cuentaPartidas < jugador.numPartidas + 1) {
            for (int i = 0; i < lbl.length; i++) {
                lbl[i].setText("");
            }
        } else {
            Final resultado = new Final(jugador);
            resultado.setVisible(true);
            resultado.setLocationRelativeTo(null);
            this.setVisible(false);
        }


    }//GEN-LAST:event_btnSiguienteActionPerformed

    private void lbl1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lbl1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_lbl1KeyPressed

    private void lbl2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lbl2KeyPressed
        // TODO add your handling code here:   
    }//GEN-LAST:event_lbl2KeyPressed

    private void FondoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FondoKeyPressed
        // TODO add your handling code here:            
    }//GEN-LAST:event_FondoKeyPressed

    private void lbl3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl3MousePressed
        presionar(3);
    }//GEN-LAST:event_lbl3MousePressed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);

    }//GEN-LAST:event_btnSalirActionPerformed
    private void nextIndex(int delta, int limit, int inIndex, int outIndex) {
        final int difference = ((Selecciona + delta) < limit) ? inIndex : outIndex;
        Selecciona += difference;
    }

    @Override
    public boolean dispatchKeyEvent(KeyEvent e) {

        final int key = e.getKeyCode();
        final boolean isPressed = (e.getID() == KeyEvent.KEY_PRESSED);

        final boolean isMovementKey = (key == KeyEvent.VK_W) || (key == KeyEvent.VK_S) || (key == KeyEvent.VK_A) || (key == KeyEvent.VK_D) || (key == KeyEvent.VK_UP) || (key == KeyEvent.VK_DOWN) || (key == KeyEvent.VK_LEFT) || (key == KeyEvent.VK_RIGHT);

        if (isMovementKey && (Selecciona == -1)) {
            lbl1.setBorder(BorderFactory.createLineBorder(Color.black));
            Selecciona = 0;
            e.consume();
        }

        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
            presionar(Selecciona + 1);
            e.consume();
        }
        if (isPressed && key == KeyEvent.VK_UP || key == KeyEvent.VK_W) {
            lbl[Selecciona].setBorder(BorderFactory.createEmptyBorder());
            nextIndex(-3, 0, 6, -3);
            lbl[Selecciona].setBorder(BorderFactory.createLineBorder(Color.black));
            e.consume();
        }
        if (isPressed && e.getKeyCode() == KeyEvent.VK_DOWN || e.getKeyCode() == KeyEvent.VK_S) {
            lbl[Selecciona].setBorder(BorderFactory.createEmptyBorder());
            nextIndex(3, 9, 3, -6);
            lbl[Selecciona].setBorder(BorderFactory.createLineBorder(Color.black));
            e.consume();
        }
        if (isPressed && e.getKeyCode() == KeyEvent.VK_LEFT || e.getKeyCode() == KeyEvent.VK_A) {
            lbl[Selecciona].setBorder(BorderFactory.createEmptyBorder());
            nextIndex(-1, 0, 8, -1);
            lbl[Selecciona].setBorder(BorderFactory.createLineBorder(Color.black));
            e.consume();
        }
        if (isPressed && e.getKeyCode() == KeyEvent.VK_RIGHT || e.getKeyCode() == KeyEvent.VK_D) {
            lbl[Selecciona].setBorder(BorderFactory.createEmptyBorder());
            nextIndex(1, 9, 1, -8);
            lbl[Selecciona].setBorder(BorderFactory.createLineBorder(Color.black));
            e.consume();

        }
        return false;

    }

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel Rondas;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lbl4;
    private javax.swing.JLabel lbl5;
    private javax.swing.JLabel lbl6;
    private javax.swing.JLabel lbl7;
    private javax.swing.JLabel lbl8;
    private javax.swing.JLabel lbl9;
    private javax.swing.JLabel lblGanaJ1;
    private javax.swing.JLabel lblGanaJ2;
    private javax.swing.JLabel lblJugador;
    private javax.swing.JLabel lblPc;
    private javax.swing.JLabel lblTablero;
    // End of variables declaration//GEN-END:variables

}
