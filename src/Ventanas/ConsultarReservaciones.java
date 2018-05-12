/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Clases.CCP;
import Clases.Reservacion;
import Clases.Salones;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import javax.swing.ComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.event.ListDataListener;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Yoselin
 */
public class ConsultarReservaciones extends javax.swing.JFrame {

    private CCP ccp;
    private String fechaCadena;

    /**
     * Creates new form ConsultarReservaciones
     */
    public ConsultarReservaciones(CCP c) {
        this.ccp = c;
        initComponents();
        this.setLocationRelativeTo(null);

        ManejadorComboBox mc = new ManejadorComboBox();
        comboBox.setModel(mc);
        Cancelar.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        diaCalendario = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        comboBox = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        Buscar = new javax.swing.JButton();
        Cancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel1.setText("Consultar Reservaciones");

        jLabel2.setText("Salon:");

        jLabel3.setText("Fecha:");

        comboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        Table.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(Table);

        Buscar.setText("Buscar");
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });

        Cancelar.setText("Limpiar");
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Cancelar)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(99, 99, 99)
                            .addComponent(jLabel1))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(35, 35, 35)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(18, 18, 18)
                                    .addComponent(comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(18, 18, 18)
                                    .addComponent(diaCalendario, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(diaCalendario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Buscar))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Cancelar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed

        Table.setModel((new DefaultTableModel()));
        Table.updateUI();
        selecionado = null;
        comboBox.updateUI();
        diaCalendario.setDate(null);
        diaCalendario.updateUI();
        Buscar.setEnabled(true);
        Cancelar.setEnabled(false);
        diaCalendario.setEnabled(true);
        comboBox.setEnabled(true);
    }//GEN-LAST:event_CancelarActionPerformed

    SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed

        Date da = diaCalendario.getDate();
        if (diaCalendario.getDate() == null || (comboBox.getSelectedItem() == null)) {
            JOptionPane.showMessageDialog(null, "Selecione Un Salon Y Una Fecha");
        } else {
            fechaCadena = sdf.format(da);
            ManejadorJtable mtm = new ManejadorJtable();
            Table.setModel(mtm);
            diaCalendario.setEnabled(false);
            comboBox.setEnabled(false);
            Cancelar.setEnabled(true);
            Buscar.setEnabled(false);
        }

    }//GEN-LAST:event_BuscarActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buscar;
    private javax.swing.JButton Cancelar;
    private javax.swing.JTable Table;
    private javax.swing.JComboBox<String> comboBox;
    private com.toedter.calendar.JDateChooser diaCalendario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private Object selecionado = null;

    public class ManejadorComboBox implements ComboBoxModel {

        @Override
        public void setSelectedItem(Object anItem) {
            selecionado = anItem;
        }

        @Override
        public Object getSelectedItem() {
            return selecionado;
        }

        @Override
        public int getSize() {
            return ccp.getSalones().size();
        }

        @Override
        public Object getElementAt(int index) {
            return ccp.getSalones().get(index);
        }

        @Override
        public void addListDataListener(ListDataListener l) {
        }

        @Override
        public void removeListDataListener(ListDataListener l) {
        }
    }

    public class ManejadorJtable extends AbstractTableModel {

        @Override
        public int getRowCount() {
//            if (ccp.reservacionesHora(fechaCadena, (Salones) comboBox.getSelectedItem()).isEmpty()) {
//                Table.setModel((new DefaultTableModel()));
//            }
            return ccp.reservacionesHora(fechaCadena, (Salones) comboBox.getSelectedItem()).size();
        }

        @Override
        public int getColumnCount() {
            return 7;
        }

        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {
            Reservacion dc = ccp.reservacionesHora(fechaCadena, (Salones) comboBox.getSelectedItem()).get(rowIndex);
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
}
