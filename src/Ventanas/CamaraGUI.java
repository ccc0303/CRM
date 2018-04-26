/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Clases.CCP;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Sebas
 */
public class CamaraGUI extends javax.swing.JFrame {

    private CCP ccp;
    
    public CamaraGUI(CCP c) {
        this.ccp = c;
        initComponents();
        this.setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        desktop = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        opcionRegistrarReservacion = new javax.swing.JMenuItem();
        opcionCancelarReservacion = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        acrualizarCliente = new javax.swing.JMenu();
        Regis = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

        jMenu2.setText("File");
        jMenuBar2.add(jMenu2);

        jMenu3.setText("Edit");
        jMenuBar2.add(jMenu3);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 372, Short.MAX_VALUE)
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 208, Short.MAX_VALUE)
        );

        getContentPane().add(desktop, java.awt.BorderLayout.CENTER);

        jMenu1.setText("Reservaciones");
        jMenu1.setEnabled(true);
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        opcionRegistrarReservacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/contrato (1).png"))); // NOI18N
        opcionRegistrarReservacion.setText("Registrar Reservacion");
        opcionRegistrarReservacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionRegistrarReservacionActionPerformed(evt);
            }
        });
        jMenu1.add(opcionRegistrarReservacion);

        opcionCancelarReservacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/archivo (1).png"))); // NOI18N
        opcionCancelarReservacion.setText("Cancelar Reservacion");
        jMenu1.add(opcionCancelarReservacion);

        jMenuItem2.setText("Consultar Reservaciones");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        acrualizarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1496638168_demographic.png"))); // NOI18N
        acrualizarCliente.setText("Clientes");
        acrualizarCliente.setEnabled(true);

        Regis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/plan-de-estudios (1).png"))); // NOI18N
        Regis.setText("Actualizar Cliente ");
        Regis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisActionPerformed(evt);
            }
        });
        acrualizarCliente.add(Regis);

        jMenuItem1.setText("Consultar Clientes");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        acrualizarCliente.add(jMenuItem1);

        jMenuBar1.add(acrualizarCliente);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private ActualizarCliente ventana2;
    private void RegisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisActionPerformed
        
         if (this.ventana2 == null) {
            this.ventana2 = new ActualizarCliente(ccp);
            this.ventana2.setResizable(false);
        }
        ventana2.setVisible(true);
    }//GEN-LAST:event_RegisActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed
    
    private Salon ventana;
    
    private void opcionRegistrarReservacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionRegistrarReservacionActionPerformed

        if (this.ventana == null) {
            this.ventana = new Salon(ccp);
            this.ventana.setResizable(false);
        }
        ventana.setVisible(true);

    }//GEN-LAST:event_opcionRegistrarReservacionActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Regis;
    private javax.swing.JMenu acrualizarCliente;
    private javax.swing.JPanel desktop;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem opcionCancelarReservacion;
    private javax.swing.JMenuItem opcionRegistrarReservacion;
    // End of variables declaration//GEN-END:variables


//    public class ManejadorCancelarReservaciones implements ActionListener {
//
//        private JDialog ventana;
//
//        public void actionPerformed(ActionEvent e) {
//
//            if (this.ventana == null) {
//                try {
//                    this.ventana = new CancelarR_GUI(camaraGUI, true, co, c02);
//                    this.ventana.setResizable(false);
//                } catch (Exception ex) {
//                    JOptionPane.showMessageDialog(null, ex.getMessage());
//                }
//            }
//            this.ventana.setVisible(true);
//
//        }
//
//    }
//
//    public class ManejadorRegistrarCliente implements ActionListener {
//
//        private JDialog ventana;
//
//        public void actionPerformed(ActionEvent e) {
//
//            if (this.ventana == null) {
//                try {
//                    this.ventana = new registrarCliente(camaraGUI, true, co, c02);
//                    this.ventana.setResizable(false);
//                } catch (Exception ex) {
//                    JOptionPane.showMessageDialog(null, ex.getMessage());
//                }
//            }
//            this.ventana.setVisible(true);
//
//        }
//
//    }
//    public class manejadorcerrarseccion implements ActionListener {
//
//        private JFrame ventana;
//
//        @Override
//        public void actionPerformed(ActionEvent ae) {
//
//            try {
//                //    camaraGUI.setVisible(false);
//                CamaraGUI cm = new CamaraGUI(co, us);
//                cm.setVisible(false);
//            } catch (Exception ex) {
//                JOptionPane.showMessageDialog(null, ex.getMessage());
//            }
//
//        }
//
//    }
}
