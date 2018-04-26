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
import java.util.Date;
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
                .addComponent(txt_Tipo1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(botonCancelarReservacion, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
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
        botonCancelar.setText("Cancelar");
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

   
//    private int tamaño;
//    public class ManejadorBuscar implements ActionListener {
//
//        
//        @Override
//        public void actionPerformed(ActionEvent e) {
//            try {
//                Long identificacion = Long.parseLong(txt_Identificacion.getText());
//                Cliente soli = cm.buscarc(identificacion);
//                txt_Nombre.setText(soli.getNombre());
//                txt_Telefono.setText(Long.toString(soli.getTelefono()));
//
//                ManejadorTableModel mtm = new ManejadorTableModel();
//                txt_Tabla.setModel(mtm);
//                txt_Tabla.setAutoCreateRowSorter(true);
//
//                botonCancelarReservacion.setEnabled(true);
//
//            } catch (NumberFormatException nfe) {
//                JOptionPane.showMessageDialog(null, "Ingrese Un Codigo Valido");
//            } catch (IllegalArgumentException iae) {
//                JOptionPane.showMessageDialog(null, iae.getMessage());
//            } catch (Exception ex) {
//                    JOptionPane.showMessageDialog(null, ex.getMessage());
//            }
//        }
//    }
//private Object rv;
//private long res;
//    public class ManejadorTableModel extends AbstractTableModel {
//        
//        Long identificacion = Long.parseLong(txt_Identificacion.getText());
//        
//        @Override
//        public int getRowCount() {
//            res = identificacion;
//            try 
//             {
//                if (cm.busscare(identificacion).isEmpty()) {
//                    
//                        txt_Tabla.setModel((new DefaultTableModel()));
//                        JOptionPane.showMessageDialog(null, "No Se Encontraron Reservaciones");
//                    }
//                
//                    
//                
//               
//            } catch (Exception ex) {
//                    JOptionPane.showMessageDialog(null, ex.getMessage());
//            }
//            try {
//                tamaño = cm.busscare(identificacion).size();
//            } catch (Exception ex) {
//                    JOptionPane.showMessageDialog(null, ex.getMessage());
//            }
//            return tamaño;
//        }
//
//        @Override
//        public int getColumnCount() {
//            return 5;
//        }
//
//        @Override
//        public Object getValueAt(int rowIndex, int columnIndex) {
//            try {
//                Reservacion reserva1 = (Reservacion) cm.busscare(identificacion).get(rowIndex);
//                Object valor = "";
//                switch (columnIndex) {
//                    case 0:
//                        valor = reserva1.getEvento().getNombre();
//                        break;
//                    case 1:
//                        valor = reserva1.getSalon().getNombre();
//                        break;
//                    case 2:
//                        valor = reserva1.getFecha_solicitud();
//                        break;
//                    case 3:
//                        valor = reserva1.getHora_inicio().toString();
//                        break;
//                    case 4:
//                        valor = reserva1.getHora_fin().toString();
//                        break;
//                }
//                rv = valor;
//                return valor;
//            } catch (Exception ex) {
//                    JOptionPane.showMessageDialog(null, ex.getMessage());
//            }
//           return rv;   
//        }
//
//        private Class[] clases = {
//            String.class, String.class, Date.class, String.class, String.class
//        };
//
//        @Override
//        public Class<?> getColumnClass(int columnIndex) {
//            return clases[columnIndex];
//        }
//
//        private String[] nombreColumnas = {
//            "Evento", "Salon", "Fecha Solicitud", "Hora Inicio", "Hora Fin"
//        };
//
//        @Override
//        public String getColumnName(int column) {
//            return nombreColumnas[column];
//        }
//     
//    }
//
//    public class ManejadorCancelarReservacion implements ActionListener {
//
//        @Override
//        public void actionPerformed(ActionEvent e) {
//            try {
//                
//                   
//                
//                int fila = txt_Tabla.getSelectedRow();
//                Reservacion re = cm.busscare(res).get(fila);
//                cm.actualizaresevacon(re.getCodigo(), false);
//               
//                
//                txt_Tabla.updateUI();
//
//            } catch (NumberFormatException nfe) {
//                JOptionPane.showMessageDialog(null, "Ingrese Un Valor Numerico Valido");
//            } catch (IllegalArgumentException iae) {
//                JOptionPane.showMessageDialog(null, iae.getMessage());
//            } catch (Exception ex) {
//                    JOptionPane.showMessageDialog(null, ex.getMessage());
//            }
//
//        }
//
//    }
//
//    public class ManejadorCancelar implements ActionListener {
//
//        @Override
//        public void actionPerformed(ActionEvent e) {
//            txt_Identificacion.setText("");
//            txt_Nombre.setText("");
//            txt_Tabla.setModel((new DefaultTableModel()));
//            txt_Tabla.updateUI();
//            txt_Telefono.setText("");
//            txt_Tipo.setText("");
//            botonCancelarReservacion.setEnabled(false);
//        }
//
//    }
}
