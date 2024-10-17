/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author zalaz
 */
public class VistaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VistaPrincipal
     */
    public VistaPrincipal() {
        initComponents();
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmInscripcion = new javax.swing.JMenu();
        jmiListaInscripcion = new javax.swing.JMenuItem();
        jmiNotas = new javax.swing.JMenuItem();
        jmiInscribir = new javax.swing.JMenuItem();
        jmAlumno = new javax.swing.JMenu();
        jmMateria = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FORMULARIO DE INSCRIPCION");

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1002, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 668, Short.MAX_VALUE)
        );

        jmInscripcion.setText("Inscripcion");

        jmiListaInscripcion.setText("Formulario");
        jmiListaInscripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiListaInscripcionActionPerformed(evt);
            }
        });
        jmInscripcion.add(jmiListaInscripcion);

        jmiNotas.setText("Notas");
        jmiNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiNotasActionPerformed(evt);
            }
        });
        jmInscripcion.add(jmiNotas);

        jmiInscribir.setText("Lista Alumnos por Materia");
        jmiInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiInscribirActionPerformed(evt);
            }
        });
        jmInscripcion.add(jmiInscribir);

        jMenuBar1.add(jmInscripcion);

        jmAlumno.setText("Alumno");
        jmAlumno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmAlumnoMouseClicked(evt);
            }
        });
        jMenuBar1.add(jmAlumno);

        jmMateria.setText("Materia");
        jmMateria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmMateriaMouseClicked(evt);
            }
        });
        jMenuBar1.add(jmMateria);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jmAlumnoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmAlumnoMouseClicked
        escritorio.removeAll();
        escritorio.repaint();
        VistaAlumno a1 = new VistaAlumno();
        a1.setVisible(true);
        escritorio.add(a1);
        escritorio.moveToFront(a1);
    }//GEN-LAST:event_jmAlumnoMouseClicked

    private void jmMateriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmMateriaMouseClicked
        escritorio.removeAll();
        escritorio.repaint();
        VistaMateria a1 = new VistaMateria();
        a1.setVisible(true);
        escritorio.add(a1);
        escritorio.moveToFront(a1);
    }//GEN-LAST:event_jmMateriaMouseClicked

    private void jmiInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiInscribirActionPerformed
         escritorio.removeAll();
        escritorio.repaint();
        VistaListarAlumnosPorMateria a1 = new VistaListarAlumnosPorMateria();
        a1.setVisible(true);
        escritorio.add(a1);
        escritorio.moveToFront(a1);
    }//GEN-LAST:event_jmiInscribirActionPerformed

    private void jmiNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiNotasActionPerformed
         escritorio.removeAll();
        escritorio.repaint();
        VistaCargaNotas a1 = new VistaCargaNotas();
        a1.setVisible(true);
        escritorio.add(a1);
        escritorio.moveToFront(a1);
    }//GEN-LAST:event_jmiNotasActionPerformed

    private void jmiListaInscripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiListaInscripcionActionPerformed
         escritorio.removeAll();
        escritorio.repaint();
        VistaListarInscripciones a1 = new VistaListarInscripciones();
        a1.setVisible(true);
        escritorio.add(a1);
        escritorio.moveToFront(a1);
    }//GEN-LAST:event_jmiListaInscripcionActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jmAlumno;
    private javax.swing.JMenu jmInscripcion;
    private javax.swing.JMenu jmMateria;
    private javax.swing.JMenuItem jmiInscribir;
    private javax.swing.JMenuItem jmiListaInscripcion;
    private javax.swing.JMenuItem jmiNotas;
    // End of variables declaration//GEN-END:variables
}
