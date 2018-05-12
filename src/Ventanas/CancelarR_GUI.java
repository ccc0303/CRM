/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Clases.CCP;
import Clases.Cliente;
import Clases.Reservacion;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.LocalTime;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sebas
 */
public class CancelarR_GUI extends javax.swing.JDialog {

    private CCP ccp;

    public CancelarR_GUI(CCP c) {
        this.ccp = c;
        initComponents();
        this.setLocationRelativeTo(null);

        ManejadorBuscar mb = new ManejadorBuscar();
        botonBuscar.addActionListener(mb);
        txt_Identificacion.addActionListener(mb);

        ManejadorCancelar mc = new ManejadorCancelar();
        botonCancelar.addActionListener(mc);

        ManejadorCancelarReservacion mcr = new ManejadorCancelarReservacion();
        botonCancelarReservacion.addActionListener(mcr);

        botonCancelar.setEnabled(false);
        txt_Tabla.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txt_Nombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_Telefono = new javax.swing.JTextField();
        txt_Tipo1 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_Tabla = new javax.swing.JTable();
        botonCancelarReservacion = new javax.swing.JButton();
        botonCancelar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txt_Identificacion = new javax.swing.JTextField();
        botonBuscar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setText("Cancelar Rervaciones");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED), "Informacion Del Solicitante"));

        txt_Nombre.setEditable(false);

        jLabel2.setText("Nombre :");

        jLabel3.setText("Email:");

        jLabel6.setText("Telefono : ");

        txt_Telefono.setEditable(false);

        txt_Tipo1.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_Nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                    .addComponent(txt_Telefono))
                .addGap(50, 50, 50)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(txt_Tipo1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(txt_Tipo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED), "Reservaciones"));

        txt_Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(txt_Tabla);

        botonCancelarReservacion.setForeground(new java.awt.Color(255, 255, 255));
        botonCancelarReservacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/color boton naranja.png"))); // NOI18N
        botonCancelarReservacion.setText("Cancelar Reservacion");
        botonCancelarReservacion.setEnabled(false);
        botonCancelarReservacion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonCancelarReservacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarReservacionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 419, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(botonCancelarReservacion, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonCancelarReservacion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        botonCancelar.setForeground(new java.awt.Color(255, 255, 255));
        botonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/color boton verde.png"))); // NOI18N
        botonCancelar.setText("Limpiar");
        botonCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED), "Datos Reservacion"));

        jLabel4.setText("Identificacion Del Solicitante:");

        botonBuscar.setForeground(new java.awt.Color(255, 255, 255));
        botonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Color Boton Azul.png"))); // NOI18N
        botonBuscar.setText("Buscar");
        botonBuscar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_Identificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(botonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_Identificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/archivo (1).png"))); // NOI18N
        jLabel5.setText("   ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
            .addGroup(layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonCancelarReservacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarReservacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonCancelarReservacionActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBuscar;
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonCancelarReservacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txt_Identificacion;
    private javax.swing.JTextField txt_Nombre;
    private javax.swing.JTable txt_Tabla;
    private javax.swing.JTextField txt_Telefono;
    private javax.swing.JTextField txt_Tipo1;
    // End of variables declaration//GEN-END:variables

    public class ManejadorBuscar implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                Long identificacion = Long.parseLong(txt_Identificacion.getText());
                Cliente soli = ccp.buscarCliente(identificacion);
                txt_Nombre.setText(soli.getNombres());
                txt_Telefono.setText(Long.toString(soli.getTelefono()));
                txt_Tipo1.setText(soli.getEmail());

                ManejadorJtable mtm = new ManejadorJtable();
                txt_Tabla.setModel(mtm);
                txt_Tabla.setEnabled(true);

                if (ccp.ConsulttarReservacionesDisponibles(identificacion).isEmpty()) {
                    botonCancelarReservacion.setEnabled(false);
                } else {
                    botonCancelarReservacion.setEnabled(true);
                }
                txt_Identificacion.setEditable(false);
                botonBuscar.setEnabled(false);
                botonCancelar.setEnabled(true);

            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(null, "Ingrese Un N° de Identifacion Valida");
            } catch (IllegalArgumentException iae) {
                JOptionPane.showMessageDialog(null, iae.getMessage());
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }
    }

    public class ManejadorJtable extends AbstractTableModel {

        Long identificacion = Long.parseLong(txt_Identificacion.getText());

        @Override
        public int getRowCount() {
            return ccp.ConsulttarReservacionesDisponibles(identificacion).size();
        }

        @Override
        public int getColumnCount() {
            return 7;
        }

        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {
            Reservacion dc = ccp.ConsulttarReservacionesDisponibles(identificacion).get(rowIndex);
            Object valor = "";
            switch (columnIndex) {
                case 0:
                    valor = dc.getEvento().getNombre();
                    break;
                case 1:
                    valor = dc.getCliente().getNombres();
                    break;
                case 2:
                    valor = dc.getEvento().getSalon().getNombre();
                    break;
                case 3:
                    valor = dc.getFecha_programada();
                    break;
                case 4:
                    valor = dc.getHora_inicio();
                    break;
                case 5:
                    valor = dc.getHora_fin();
                    break;
                case 6:
                    valor = dc.getEvento().getNum_asistentes();
                    break;

            }
            return valor;
        }

        private Class[] clases = {
            String.class, String.class, String.class, LocalDate.class, LocalTime.class, LocalTime.class, int.class
        };

        @Override
        public Class<?> getColumnClass(int columnIndex) {
            return clases[columnIndex];
        }

        private String[] nombreColumnas = {
            "Evento", "Cliente", "Salon", "Fecha", "Hora Inicio", "Hora Fin", "N° Asistentes"
        };

        public String getColumnName(int columnIndex) {

            return nombreColumnas[columnIndex];

        }

    }
    int fila;
    int s;

    public class ManejadorCancelarReservacion implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            Long identificacion = Long.parseLong(txt_Identificacion.getText());
            fila = txt_Tabla.getSelectedRow();
            s = fila;
            System.out.println("lo seleccionado "+fila+" "+txt_Tabla.getSelectedRow());
            if ((txt_Tabla.getSelectedRow() == -1)) {
                JOptionPane.showMessageDialog(null, "Selecione Una Reservacion");
                botonCancelarReservacion.setEnabled(false);

            } else {

                int msj = JOptionPane.showConfirmDialog(null, "Desea Cancelar La Reservacion", "Selecione Una Opcion", 0);
                if (msj == JOptionPane.YES_OPTION) {
                    Reservacion re = ccp.ConsulttarReservacionesDisponibles(identificacion).get(fila);
                    re.setEstado(false);
                    txt_Tabla.updateUI();
                  
                    
                    
                            
                            
                            
                  
 
                    System.out.println(fila);
                    if (ccp.ConsulttarReservacionesDisponibles(identificacion).isEmpty()) {
                        botonCancelarReservacion.setEnabled(false);
                    }
                }

            }

        }

    }

    public class ManejadorCancelar implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            txt_Identificacion.setText("");
            txt_Nombre.setText("");
            txt_Tabla.setModel((new DefaultTableModel()));
            txt_Tabla.updateUI();
            txt_Telefono.setText("");
            txt_Tipo1.setText("");
            botonCancelarReservacion.setEnabled(false);
            txt_Identificacion.setEditable(true);
            botonBuscar.setEnabled(true);
            botonCancelar.setEnabled(false);
        }

    }
}
