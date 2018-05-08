/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Clases.CCP;
import Clases.Salones;
import javax.swing.JMenuItem;

/**
 *
 * @author Yoselin
 */
public class Salon extends javax.swing.JFrame {

    private CCP ccp;
    public static Dia ventana = null;
    public static Salones sa;

    /**
     * Creates new form Salon
     */
    public Salon(CCP c) {
        this.ccp = c;
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SalonMe = new javax.swing.JButton();
        SalonReunion = new javax.swing.JButton();
        Salon205 = new javax.swing.JButton();
        Auditorio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        SalonMe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/c2.png"))); // NOI18N
        SalonMe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalonMeActionPerformed(evt);
            }
        });

        SalonReunion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/c5.png"))); // NOI18N
        SalonReunion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalonReunionActionPerformed(evt);
            }
        });

        Salon205.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/c3.png"))); // NOI18N
        Salon205.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Salon205ActionPerformed(evt);
            }
        });

        Auditorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/c1.png"))); // NOI18N
        Auditorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AuditorioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(SalonReunion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Auditorio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Salon205, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SalonMe, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Auditorio, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SalonMe, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Salon205, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SalonReunion, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SalonMeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalonMeActionPerformed

        this.ventana = new Dia(ccp);
        this.ventana.setResizable(false);
        dispose();
        sa = ccp.getSalones().get(3);
        ventana.setVisible(true);
        dispose();

    }//GEN-LAST:event_SalonMeActionPerformed

    private void SalonReunionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalonReunionActionPerformed

        this.ventana = new Dia(ccp);
        this.ventana.setResizable(false);
        dispose();
        sa = ccp.getSalones().get(2);
        ventana.setVisible(true);
        dispose();

    }//GEN-LAST:event_SalonReunionActionPerformed

    private void Salon205ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Salon205ActionPerformed

        this.ventana = new Dia(ccp);
        this.ventana.setResizable(false);
        dispose();
        sa = ccp.getSalones().get(0);
        ventana.setVisible(true);
        dispose();
    }//GEN-LAST:event_Salon205ActionPerformed

    private void AuditorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AuditorioActionPerformed

        this.ventana = new Dia(ccp);
        this.ventana.setResizable(false);
        dispose();
        sa = ccp.getSalones().get(1);
        ventana.setVisible(true);
        dispose();
    }//GEN-LAST:event_AuditorioActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Auditorio;
    private javax.swing.JButton Salon205;
    private javax.swing.JButton SalonMe;
    private javax.swing.JButton SalonReunion;
    // End of variables declaration//GEN-END:variables
}