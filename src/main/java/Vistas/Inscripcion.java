package Vistas;

import com.mycompany.trabajopractico4_laboratorio.Alumno;
import com.mycompany.trabajopractico4_laboratorio.Materia;
import java.util.HashSet;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Lucia
 */
public class Inscripcion extends javax.swing.JInternalFrame {

     private HashSet<Alumno> listaAlumnos;
     private HashSet<Materia> listaMaterias;
    
    
    public Inscripcion(HashSet<Alumno> listaAlumnos, HashSet<Materia> listaMaterias) {
        this.listaAlumnos = listaAlumnos;
        this.listaMaterias = listaMaterias;
        
        initComponents();
        this.setTitle("FORMULARIO DE INSCRIPCION DE MATERIAS");
        cargarDatos();
    }
    
   
    
    private void cargarDatos(){
    
    DefaultComboBoxModel<String> modeloMaterias = new DefaultComboBoxModel<>();
        for (Materia materia : listaMaterias) {
            modeloMaterias.addElement(materia.getNombre()); // Asumiendo que `getNombre` retorna el nombre de la materia
        }
        inscripcion_comboBox_materia.setModel(modeloMaterias);
        
        DefaultComboBoxModel<String> modeloAlumnos = new DefaultComboBoxModel<>();
        for (Alumno alumno : listaAlumnos) {
            modeloAlumnos.addElement(alumno.getNombre() + " " + alumno.getApellido()); // Asumiendo que `getNombre` y `getApellido` retornan los datos del alumno
        }
        inscripcion_comboBox_alumno.setModel(modeloAlumnos);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        inscripcion_comboBox_materia = new javax.swing.JComboBox<>();
        inscripcion_comboBox_alumno = new javax.swing.JComboBox<>();
        btn_inscripcion_inscribir = new javax.swing.JButton();
        btn_inscripcion_salir = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setText("FORMULARIO DE INSCRIPCIÓN");

        jLabel2.setText("ELIJA UNA MATERIA:");

        jLabel3.setText("ELIJA UN ALUMNO:");

        inscripcion_comboBox_materia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        inscripcion_comboBox_materia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inscripcion_comboBox_materiaActionPerformed(evt);
            }
        });

        inscripcion_comboBox_alumno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        inscripcion_comboBox_alumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inscripcion_comboBox_alumnoActionPerformed(evt);
            }
        });

        btn_inscripcion_inscribir.setText("Inscribir");
        btn_inscripcion_inscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_inscripcion_inscribirActionPerformed(evt);
            }
        });

        btn_inscripcion_salir.setText("Salir");
        btn_inscripcion_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_inscripcion_salirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(inscripcion_comboBox_materia, 0, 108, Short.MAX_VALUE)
                            .addComponent(inscripcion_comboBox_alumno, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(97, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_inscripcion_inscribir)
                .addGap(45, 45, 45)
                .addComponent(btn_inscripcion_salir)
                .addGap(30, 30, 30))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(inscripcion_comboBox_materia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(inscripcion_comboBox_alumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_inscripcion_inscribir)
                    .addComponent(btn_inscripcion_salir))
                .addContainerGap())
        );

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

    private void inscripcion_comboBox_alumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inscripcion_comboBox_alumnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inscripcion_comboBox_alumnoActionPerformed

    private void inscripcion_comboBox_materiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inscripcion_comboBox_materiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inscripcion_comboBox_materiaActionPerformed

    private void btn_inscripcion_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_inscripcion_salirActionPerformed
    this.dispose();    }//GEN-LAST:event_btn_inscripcion_salirActionPerformed

    
    
    /*CARGAR MATERIAS A ALUMNOS*/
    private void btn_inscripcion_inscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_inscripcion_inscribirActionPerformed
    
    /*OBTENER ALUMNO Y MATERIA SELECCIONADA*/
    
    String nombreAlumno = (String) inscripcion_comboBox_alumno.getSelectedItem();
    String nombreMateria = (String) inscripcion_comboBox_materia.getSelectedItem();
    
    
    /*DEPURAR*/
    System.out.println("Nombre Alumno Seleccionado: " + nombreAlumno);
    System.out.println("Nombre Materia Seleccionada: " + nombreMateria);
    
    
    /*BUSCARLOS EN LOS HASHSET*/
    Alumno alumnoSeleccionado = null;
    
    for (Alumno alumno : listaAlumnos) {
        if ((alumno.getNombre() + " " + alumno.getApellido()).equals(nombreAlumno)) { // Corregido con espacio
            alumnoSeleccionado = alumno;
            break;
        }
    
    }
    
    Materia materiaSeleccionada = null;
    for (Materia materia : listaMaterias) {
        if (materia.getNombre().equals(nombreMateria)) {
            materiaSeleccionada = materia;
            break;
        }
    }
    
        System.out.println("alum" + alumnoSeleccionado);
        System.out.println("mat" + materiaSeleccionada);
    
    
    
    /*ASIGNAR MATERIA A ALUMNOS*/
        System.out.println(alumnoSeleccionado.getNombre() + alumnoSeleccionado.getApellido());
        System.out.println(materiaSeleccionada.getNombre());
        
    if (alumnoSeleccionado != null && materiaSeleccionada != null) {
        System.out.println("Alumno Seleccionado: " + alumnoSeleccionado.getNombre() + " " + alumnoSeleccionado.getApellido());
        System.out.println("Materia Seleccionada: " + materiaSeleccionada.getNombre());
        
        alumnoSeleccionado.agregarMateria(materiaSeleccionada);
        JOptionPane.showMessageDialog(this, "Se ha realizado la inscripción correctamente.");
    } else {
        // Manejo de errores si no se encuentra el alumno o la materia
        if (alumnoSeleccionado == null) {
            System.out.println("No se encontró el alumno.");
        }
        if (materiaSeleccionada == null) {
            System.out.println("No se encontró la materia.");
        }
        JOptionPane.showMessageDialog(this, "Error al encontrar el alumno o la materia.");
    }
} 
    
    
    
    }//GEN-LAST:event_btn_inscripcion_inscribirActionPerformed

    
    
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_inscripcion_inscribir;
    private javax.swing.JButton btn_inscripcion_salir;
    private javax.swing.JComboBox<String> inscripcion_comboBox_alumno;
    private javax.swing.JComboBox<String> inscripcion_comboBox_materia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
