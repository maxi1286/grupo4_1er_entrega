/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import java.util.ArrayList;
import javax.swing.JDesktopPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import modelo.Materia;

import persistencia.materiaData;

/**
 *
 * @author mmaci
 */
public class VistaMostrarMateria extends javax.swing.JInternalFrame {

    materiaData data = new materiaData();
    DefaultTableModel modelo = new DefaultTableModel() {
        public boolean isCellEditable(int fila, int columna) {
            return false;
        }
    };

    public boolean isCellEditable(int fila, int columna) {
        return false;
    }

    /**
     * Creates new form VistaMostrarMateria
     */
    public VistaMostrarMateria() {
        initComponents();
        iniciarTabla();
        llenarTabla();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTMostrarMateria = new javax.swing.JTable();
        jBExaminar = new javax.swing.JButton();
        jbBaja = new javax.swing.JButton();
        jbAlta = new javax.swing.JButton();

        setClosable(true);
        setTitle("Materias");

        jTMostrarMateria.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTMostrarMateria);

        jBExaminar.setBackground(new java.awt.Color(255, 0, 0));
        jBExaminar.setText("Eliminar");
        jBExaminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBExaminarActionPerformed(evt);
            }
        });

        jbBaja.setText("Baja");
        jbBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBajaActionPerformed(evt);
            }
        });

        jbAlta.setBackground(new java.awt.Color(0, 153, 0));
        jbAlta.setText("Alta");
        jbAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAltaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbBaja, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 18, Short.MAX_VALUE)
                        .addComponent(jBExaminar, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbBaja)
                    .addComponent(jbAlta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBExaminar)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBExaminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBExaminarActionPerformed
        int filaSelect = jTMostrarMateria.getSelectedRow();
        int cod = (int) jTMostrarMateria.getValueAt(filaSelect, 0);

        Materia al = data.BuscarMateria(cod);
        data.borrarMateria(al.getIdMateria());
        llenarTabla();
    }//GEN-LAST:event_jBExaminarActionPerformed

    private void jbAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAltaActionPerformed
       int filaSelect = jTMostrarMateria.getSelectedRow();
       int cod = (int) jTMostrarMateria.getValueAt(filaSelect, 0);
        
        Materia al = data.BuscarMateria(cod);
        data.altaLogica(al.getIdMateria());
        llenarTabla();
    }//GEN-LAST:event_jbAltaActionPerformed

    private void jbBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBajaActionPerformed
       int filaSelect = jTMostrarMateria.getSelectedRow();
       int cod = (int) jTMostrarMateria.getValueAt(filaSelect, 0);
        
        Materia al = data.BuscarMateria(cod);
        data.bajaLogica(al.getIdMateria());
        llenarTabla();
    }//GEN-LAST:event_jbBajaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBExaminar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTMostrarMateria;
    private javax.swing.JButton jbAlta;
    private javax.swing.JButton jbBaja;
    // End of variables declaration//GEN-END:variables

    public void iniciarTabla() {

        modelo.addColumn("Id");
        modelo.addColumn("Nombre");
        modelo.addColumn("año");
        modelo.addColumn("Estado");

        jTMostrarMateria.setModel(modelo);
    }

    public void llenarTabla() {

        String es;
        modelo.setRowCount(0);
        for (Materia materia : data.listaMateria()) {
            if (materia.isEstado()) {
                es = "Activo";
            } else {
                es = "Inactivo";
            }
            modelo.addRow(new Object[]{materia.getIdMateria(),materia.getNombre(),materia.getAnio(),es});
            
        }
    }
    
}

                    
        
    
    


