/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import javax.sound.sampled.Clip;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.Line;
import controlador.Juego;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import javax.swing.Timer;

/**
 *
 * @author eumartinez
 */
public class Ateroid extends java.awt.Frame {



    
    private Timer timer;
    private int segundosTranscurridos;

    private boolean teclaUP = false, m1 = false, m2 = true, m3 = true, m4 = true, m5 = true, aux = true, iniciar = false;
    private int misiles = 0;

    /**
     * Creates new form Ateroid
     */
    public Ateroid() {
  
        initComponents();

        Graphics g = jPanel1.getGraphics();
        int ancho = jPanel1.getWidth();
        int alto = jPanel1.getHeight();
        juego = new Juego(g, ancho, alto);

        segundosTranscurridos = 0;

        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                segundosTranscurridos++;
                actualizarTiempoTranscurrido();
            }
        });
        timer.start();
        setLocationRelativeTo(null); 
    }



    // Método para actualizar el tiempo transcurrido en el jLabel10
    private void actualizarTiempoTranscurrido() {
        // Calcular las horas, minutos y segundos transcurridos
        int horas = segundosTranscurridos / 3600;
        int minutos = (segundosTranscurridos % 3600) / 60;
        int segundos = segundosTranscurridos % 60;

        // Construir el texto con el tiempo transcurrido
        String tiempoTranscurrido = String.format("Tiempo: %02d:%02d:%02d", horas, minutos, segundos);

        // Actualizar el texto del jLabel10
        jLabel10.setText(tiempoTranscurrido);
    }

    // Declara la variable clip fuera del método
    private Clip clip;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\DBP\\Documents\\NetBeansProjects\\Asteroid\\Imagenes\\ezgif-3-1995b72dd5.png")); // NOI18N

        jLabel17.setIcon(new javax.swing.ImageIcon("C:\\Users\\DBP\\Documents\\NetBeansProjects\\SpaceWar-master\\src\\Img\\Alien.png")); // NOI18N

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/Vida.gif"))); // NOI18N

        setBackground(new java.awt.Color(204, 204, 204));
        setName("Ateroid - Space Battle"); // NOI18N
        setResizable(false);
        setTitle("Ateroid - Space Battle");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 500));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/ezgif.com-effects.gif"))); // NOI18N

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/ezgif.com-effects.gif"))); // NOI18N

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/ezgif.com-effects.gif"))); // NOI18N

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/ezgif.com-effects.gif"))); // NOI18N

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/ezgif.com-effects.gif"))); // NOI18N

        jLabel27.setIcon(new javax.swing.ImageIcon("C:\\Users\\DBP\\Documents\\NetBeansProjects\\SpaceWar-master\\src\\Img\\tierra.fw.png")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(173, 173, 173))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel13)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel26)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(21, 21, 21))
                                    .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addGap(30, 30, 30))))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(22, 22, 22)
                    .addComponent(jLabel25)
                    .addContainerGap(328, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel13)
                .addGap(52, 52, 52)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel26)
                        .addGap(177, 177, 177))))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(34, 34, 34)
                    .addComponent(jLabel25)
                    .addContainerGap(415, Short.MAX_VALUE)))
        );

        jButton1.setText("Jugar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jScrollPane3.setViewportView(jTextArea3);

        jLabel1.setText("Información");

        jLabel2.setText("Tiempo");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jTextArea4.setColumns(20);
        jTextArea4.setRows(5);
        jTextArea4.setText("Espacio - Disparo");
        jScrollPane4.setViewportView(jTextArea4);

        jButton2.setBackground(new java.awt.Color(255, 0, 51));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jCheckBox1.setText("Inserte Moneda");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\DBP\\Documents\\NetBeansProjects\\SpaceWar-master\\src\\Img\\Coin.gif")); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 102, 0));
        jLabel4.setText("SPACE");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("BATTLE");

        jLabel6.setText("Controles");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 204, 0));
        jLabel7.setText("ATEROID");

        jLabel15.setIcon(new javax.swing.ImageIcon("C:\\Users\\DBP\\Documents\\NetBeansProjects\\SpaceWar-master\\src\\Img\\misil3.fw.png")); // NOI18N

        jLabel16.setIcon(new javax.swing.ImageIcon("C:\\Users\\DBP\\Documents\\NetBeansProjects\\SpaceWar-master\\src\\Img\\Asteroide.png")); // NOI18N

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/Nave.gif"))); // NOI18N

        jLabel20.setIcon(new javax.swing.ImageIcon("C:\\Users\\DBP\\Documents\\NetBeansProjects\\SpaceWar-master\\src\\Img\\Asteroide.png")); // NOI18N

        jLabel21.setIcon(new javax.swing.ImageIcon("C:\\Users\\DBP\\Documents\\NetBeansProjects\\SpaceWar-master\\src\\Img\\misil3.fw.png")); // NOI18N

        jLabel22.setIcon(new javax.swing.ImageIcon("C:\\Users\\DBP\\Documents\\NetBeansProjects\\SpaceWar-master\\src\\Img\\misil3.fw.png")); // NOI18N

        jLabel12.setIcon(new javax.swing.ImageIcon("C:\\Users\\DBP\\Documents\\NetBeansProjects\\SpaceWar-master\\src\\Img\\Coin.gif")); // NOI18N

        jLabel23.setIcon(new javax.swing.ImageIcon("C:\\Users\\DBP\\Documents\\NetBeansProjects\\SpaceWar-master\\src\\Img\\Coin.gif")); // NOI18N

        jLabel24.setIcon(new javax.swing.ImageIcon("C:\\Users\\DBP\\Documents\\NetBeansProjects\\SpaceWar-master\\src\\Img\\Coin.gif")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel18)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(87, 87, 87)
                                .addComponent(jLabel16))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jLabel20))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addComponent(jLabel1))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(5, 5, 5)
                                        .addComponent(jLabel2))
                                    .addComponent(jLabel6)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jButton2)
                                            .addGap(8, 8, 8))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addGap(10, 10, 10)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel4)
                                                .addComponent(jCheckBox1)
                                                .addComponent(jButton1))))))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(97, 97, 97)
                                        .addComponent(jLabel24)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel12))
                                    .addComponent(jLabel7)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5)))))
                .addContainerGap(59, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(230, 230, 230)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(363, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(229, 229, 229)
                    .addComponent(jLabel22)
                    .addContainerGap(353, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(598, Short.MAX_VALUE)
                    .addComponent(jLabel23)
                    .addGap(85, 85, 85)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel1)
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel2)
                        .addGap(14, 14, 14)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addGap(2, 2, 2)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jCheckBox1))
                        .addGap(20, 20, 20)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(64, 64, 64))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel24)
                                .addGap(42, 42, 42))))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(617, Short.MAX_VALUE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(33, 33, 33)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(560, Short.MAX_VALUE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(78, 78, 78)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(572, Short.MAX_VALUE)
                    .addComponent(jLabel23)
                    .addGap(84, 84, 84)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Exit the Application
     */
    private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm
        System.exit(0);
    }//GEN-LAST:event_exitForm

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:        

        iniciar = true;

        jPanel1.setFocusable(true);
        requestFocusInWindow();


    }//GEN-LAST:event_jButton1MouseClicked

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        // TODO add your handling code here:

        int teclap = evt.getKeyCode();
        if (teclap == KeyEvent.VK_RIGHT) {
            juego.moverNave(20);

            repaint();

        } else {
            if (teclap == KeyEvent.VK_LEFT) {
                juego.moverNave(-20);

                repaint();
            }
        }
        if (teclap == KeyEvent.VK_SPACE) {

            switch (misiles) {

                case 0:
                    juego.newCoordenadaMisil(0);  //lanza un misil en la posicion 0 asignandole una nueva coordenada 
                    misiles++;
                    break;
                case 1:
                    juego.newCoordenadaMisil(1);  //lanza un misil en la posicion 1 asignandole una nueva coordenada
                    misiles++;
                    break;
                case 2:
                    juego.newCoordenadaMisil(2);  //lanza un misil en la posicion 2
                    misiles++;
                    break;
                    /*
                case 3:
                    juego.newCoordenadaMisil(3);  //lanza un misil en la posicion 3
                    misiles++;
                    break;
                case 4:
                    juego.newCoordenadaMisil(4);  //lanza un misil en la posicion 4
                    misiles++;
                    break;
*/
                default:
                    misiles = 0;

            }

            teclaUP = true;
        }


    }//GEN-LAST:event_formKeyPressed

// Método para reproducir el archivo de audio en bucle
    private void reproducirAudioEnBucle(String filePath) {
        try {
            // Obtener el archivo de audio
            File audioFile = new File(filePath);
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);

            // Obtener el formato de audio
            AudioFormat format = audioStream.getFormat();

            // Crear el DataLine.Info
            DataLine.Info info = new DataLine.Info(Clip.class, format);

            // Obtener el clip de audio
            clip = (Clip) AudioSystem.getLine(info);

            // Abrir el clip de audio y cargar el audioStream en él
            clip.open(audioStream);

            // Reproducir el clip en bucle
            clip.loop(Clip.LOOP_CONTINUOUSLY);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

// Método para detener la reproducción del audio
    private void detenerReproduccion() {
        if (clip != null && clip.isRunning()) {
            clip.stop();
        }
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        // Cerrar la ventana actual
        this.dispose();
        try {
            // Obtener la ruta del archivo de sonido
            String path = "C:\\Users\\DBP\\Documents\\clic.wav";

            // Crear un objeto File para representar el archivo de sonido
            File file = new File(path);

            // Crear un AudioInputStream a partir del archivo de sonido
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(file);

            // Obtener la información del formato de audio del archivo
            AudioFormat format = audioInputStream.getFormat();

            // Crear una línea de datos fuente (SourceDataLine)
            DataLine.Info info = new DataLine.Info(SourceDataLine.class, format);
            SourceDataLine line = (SourceDataLine) AudioSystem.getLine(info);

            // Abrir la línea de datos fuente y establecerla como lista para reproducir sonidos
            line.open(format);
            line.start();

            // Leer los datos del archivo de sonido y escribirlos en la línea de datos fuente
            int bufferSize = (int) format.getSampleRate() * format.getFrameSize();
            byte[] buffer = new byte[bufferSize];
            int bytesRead = 0;
            while ((bytesRead = audioInputStream.read(buffer)) != -1) {
                line.write(buffer, 0, bytesRead);
            }

            // Cerrar la línea de datos fuente y el flujo de entrada de audio
            line.drain();
            line.close();
            audioInputStream.close();
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            // Manejar cualquier excepción que pueda ocurrir
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
            // Obtener la ruta del archivo de sonido
            String path = "C:\\Users\\DBP\\Documents\\clic.wav";

            // Crear un objeto File para representar el archivo de sonido
            File file = new File(path);

            // Crear un AudioInputStream a partir del archivo de sonido
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(file);

            // Obtener la información del formato de audio del archivo
            AudioFormat format = audioInputStream.getFormat();

            // Crear una línea de datos fuente (SourceDataLine)
            DataLine.Info info = new DataLine.Info(SourceDataLine.class, format);
            SourceDataLine line = (SourceDataLine) AudioSystem.getLine(info);

            // Abrir la línea de datos fuente y establecerla como lista para reproducir sonidos
            line.open(format);
            line.start();

            // Leer los datos del archivo de sonido y escribirlos en la línea de datos fuente
            int bufferSize = (int) format.getSampleRate() * format.getFrameSize();
            byte[] buffer = new byte[bufferSize];
            int bytesRead = 0;
            while ((bytesRead = audioInputStream.read(buffer)) != -1) {
                line.write(buffer, 0, bytesRead);
            }

            // Cerrar la línea de datos fuente y el flujo de entrada de audio
            line.drain();
            line.close();
            audioInputStream.close();
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            // Manejar cualquier excepción que pueda ocurrir
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:

        // Verificar si el JCheckBox está marcado
        if (jCheckBox1.isSelected()) {
            // Si está marcado, reproducir el archivo de audio en bucle
            reproducirAudioEnBucle("C:\\Users\\DBP\\Documents\\shop4.wav");
        } else {
            // Si no está marcado, detener la reproducción del audio
            detenerReproduccion();
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    @Override 
    public void update(Graphics g) {
        paint(g);
        super.paint(g);
        int Vidas = juego.getVidas();

        juego.dibujar();
        if (iniciar == true) {
            juego.dibujarAsteroides();
            juego.moverAsteroides();
        }


        if (Vidas < 1) {

            iniciar = false;
            String pierde = "Usted perdio";
            jTextArea4.setText(pierde);

        }

        juego.mostrarMisiles();
        String puntaje = "Puntaje: ";
        String GameVer = "\nGameVer: ";
        jTextArea3.setText(puntaje + juego.getPuntaje() + GameVer + juego.getVidas()+".0");
        jTextArea2.setText("Segundos: " + juego.getTiempo());

        if (teclaUP == true) {
            juego.dispararMisil();
            juego.mostrarMisiles();

        }

        repaint();

    }

 
    
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        int Vidas = juego.getVidas();

        juego.dibujar();
        if (iniciar == true) {
            juego.dibujarAsteroides();
            juego.moverAsteroides();
            //juego.cronometro();
        }
        if (Vidas < 1) {

            iniciar = false;
            String pierde = "Usted perdio";
            jTextArea4.setText(pierde);

        }

        juego.mostrarMisiles();
        String puntaje = "Puntaje: ";
        String GameVer = "\nGameVer: ";
        jTextArea3.setText(puntaje + juego.getPuntaje() + GameVer + juego.getVidas()+".0");
        jTextArea2.setText("Segundos: " + juego.getTiempo());

        //if (juego.getPuntaje()==1000){
        //System.exit(0);
        //}
/*        
        if (juego.getVidas()==0){
            System.exit(0);
        }
         */
        if (teclaUP == true) {
            juego.dispararMisil();

            juego.mostrarMisiles();

        }

        /*
        try {
            Thread.sleep(30);
        } catch (InterruptedException ex) {
            Logger.getLogger(Ateroid.class.getName()).log(Level.SEVERE, null, ex);
        }
         */
        repaint();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ateroid().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    // End of variables declaration//GEN-END:variables
    private Juego juego;


}