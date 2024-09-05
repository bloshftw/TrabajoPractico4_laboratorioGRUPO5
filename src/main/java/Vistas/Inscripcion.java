/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vistas;

import com.mycompany.trabajopractico4_laboratorio.Alumno;
import com.mycompany.trabajopractico4_laboratorio.Materia;
import java.util.HashSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Lucia
 */
public class Inscripcion extends javax.swing.JInternalFrame {

    private HashSet<Alumno> alum;
    private HashSet<Materia> mat;
    
    public Inscripcion(HashSet<Alumno> alum, HashSet<Materia> mat){
        
        this.alum = alum;
        this.mat = mat;
        
        initComponents();
        this.setTitle("Formulario de inscripcion");
        agregarMateria();
        agregarAlumno();
    }

   
    private void agregarAlumno(){
    
        for(Alumno alu: alum){
        
        InscripcionComboBoxAlumno.addItem(alu);
            
        }
    }
    
    private void agregarMateria(){
    
    for(Materia m: mat){
    inscripcion_combobox_materia.addItem(m);
    
    }
    
    
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        inscripcion_jlabel_titulo = new javax.swing.JLabel();
        inscripcion_jlabel_alumno = new javax.swing.JLabel();
        inscripcion_jlabel_materia = new javax.swing.JLabel();
        InscripcionComboBoxAlumno = new javax.swing.JComboBox<>();
        inscripcion_combobox_materia = new javax.swing.JComboBox<>();
        inscripcion_btn_inscribir = new javax.swing.JButton();
        inscripcion_btn_salir = new javax.swing.JButton();

        inscripcion_jlabel_titulo.setText("FORMULARIO DE INSCRIPCION");

        inscripcion_jlabel_alumno.setText("ALUMNO: ");

        inscripcion_jlabel_materia.setText("MATERIA: ");

        InscripcionComboBoxAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InscripcionComboBoxAlumnoActionPerformed(evt);
            }
        });

        inscripcion_btn_inscribir.setText("Inscribir");
        inscripcion_btn_inscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inscripcion_btn_inscribirActionPerformed(evt);
            }
        });

        inscripcion_btn_salir.setText("Salir");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(inscripcion_jlabel_titulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(inscripcion_jlabel_materia)
                            .addComponent(inscripcion_jlabel_alumno))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(InscripcionComboBoxAlumno, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(inscripcion_combobox_materia, 0, 83, Short.MAX_VALUE))))
                .addContainerGap(115, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(inscripcion_btn_inscribir)
                .addGap(56, 56, 56)
                .addComponent(inscripcion_btn_salir)
                .addGap(49, 49, 49))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(inscripcion_jlabel_titulo)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inscripcion_jlabel_alumno)
                    .addComponent(InscripcionComboBoxAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inscripcion_jlabel_materia)
                    .addComponent(inscripcion_combobox_materia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inscripcion_btn_inscribir)
                    .addComponent(inscripcion_btn_salir))
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void InscripcionComboBoxAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InscripcionComboBoxAlumnoActionPerformed
        
       
        
    }//GEN-LAST:event_InscripcionComboBoxAlumnoActionPerformed

    private void inscripcion_btn_inscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inscripcion_btn_inscribirActionPerformed
        
         Alumno alumnoSeleccionado = (Alumno) InscripcionComboBoxAlumno.getSelectedItem();
        Materia materiaSeleccionada = (Materia) inscripcion_combobox_materia.getSelectedItem();
        
        if (alumnoSeleccionado != null && materiaSeleccionada != null){
        
            System.out.println(alumnoSeleccionado.getNroLegajo());
            System.out.println(materiaSeleccionada.getIdMateria());
            
        alumnoSeleccionado.agregarMateria(materiaSeleccionada);
            System.out.println(alumnoSeleccionado.getApellido());
            JOptionPane.showMessageDialog(this, "El alumno: " + alumnoSeleccionado.getNombre() + " " + alumnoSeleccionado.getApellido() + "fue inscripto correctamente.");
        } else {
        
        JOptionPane.showMessageDialog(this, "El alumno no fue inscripto.");
        }
        
    }//GEN-LAST:event_inscripcion_btn_inscribirActionPerformed


    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Alumno> InscripcionComboBoxAlumno;
    private javax.swing.JButton inscripcion_btn_inscribir;
    private javax.swing.JButton inscripcion_btn_salir;
    private javax.swing.JComboBox<Materia> inscripcion_combobox_materia;
    private javax.swing.JLabel inscripcion_jlabel_alumno;
    private javax.swing.JLabel inscripcion_jlabel_materia;
    private javax.swing.JLabel inscripcion_jlabel_titulo;
    // End of variables declaration//GEN-END:variables
}
