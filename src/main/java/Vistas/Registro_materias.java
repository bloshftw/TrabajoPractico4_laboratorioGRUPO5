
package Vistas;

import com.mycompany.trabajopractico4_laboratorio.Materia;
import java.util.HashSet;
import javax.swing.JOptionPane;


public class Registro_materias extends javax.swing.JInternalFrame {

    private HashSet<Materia> lista_materias;
    
    public Registro_materias(HashSet <Materia> materia) {
        this.lista_materias = materia;
        initComponents();
        this.setTitle("FORMULARIO DE CREACION DE MATERIAS");
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        materias_input_codigoMateria = new javax.swing.JTextField();
        materias_input_nombreMateria = new javax.swing.JTextField();
        materias_input_anioMateria = new javax.swing.JTextField();
        btn_materias_guardar = new javax.swing.JButton();
        btn_materias_nuevo = new javax.swing.JButton();
        btn_materias_salir = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setText("FORMULARIO DE MATERIAS");

        jLabel2.setText("CODIGO DE MATERIA:");

        jLabel3.setText("NOMBRE DE LA MATERIA:");

        jLabel4.setText("AÑO AL QUE PERTENECE:");

        materias_input_anioMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                materias_input_anioMateriaActionPerformed(evt);
            }
        });

        btn_materias_guardar.setText("Guardar");
        btn_materias_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_materias_guardarActionPerformed(evt);
            }
        });

        btn_materias_nuevo.setText("Nuevo");

        btn_materias_salir.setText("Salir");
        btn_materias_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_materias_salirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(materias_input_anioMateria)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btn_materias_guardar)
                                        .addGap(18, 18, 18)
                                        .addComponent(btn_materias_nuevo)
                                        .addGap(18, 18, 18)
                                        .addComponent(btn_materias_salir)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(materias_input_codigoMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(materias_input_nombreMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(materias_input_codigoMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(materias_input_nombreMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(materias_input_anioMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_materias_guardar)
                    .addComponent(btn_materias_nuevo)
                    .addComponent(btn_materias_salir))
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

    private void btn_materias_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_materias_guardarActionPerformed
        
        Materia mat = new Materia();
        
        mat.setNombre(materias_input_nombreMateria.getText());
        mat.setAnio(Integer.parseInt(materias_input_anioMateria.getText()));
        mat.setIdMateria(Integer.parseInt(materias_input_codigoMateria.getText()));
        
        if (lista_materias.add(mat)){
        JOptionPane.showMessageDialog(this,"La materia. " + mat.getNombre() + " fue creada con exito");
        
        } else {
        JOptionPane.showMessageDialog(this, "La materia ya fue creada.");
        }
        
        mostrarMaterias();
        
        limpiarTexto();
        
        
    }//GEN-LAST:event_btn_materias_guardarActionPerformed

    public void limpiarTexto(){
    materias_input_codigoMateria.setText("");
    materias_input_nombreMateria.setText("");
    materias_input_anioMateria.setText("");
    
    }
    
    
    private void btn_materias_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_materias_salirActionPerformed
     this.dispose();    }//GEN-LAST:event_btn_materias_salirActionPerformed

    private void materias_input_anioMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_materias_input_anioMateriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_materias_input_anioMateriaActionPerformed

    public void mostrarMaterias() {
    // Suponiendo que 'alumno' es el HashSet de tipo Alumno
    for (Materia mat : lista_materias) {
        System.out.println("Nombre materia: " + mat.getNombre() + " Año de la materia: " + mat.getAnio() + " codigo de la materia: " + mat.getIdMateria());
    }
}
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_materias_guardar;
    private javax.swing.JButton btn_materias_nuevo;
    private javax.swing.JButton btn_materias_salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField materias_input_anioMateria;
    private javax.swing.JTextField materias_input_codigoMateria;
    private javax.swing.JTextField materias_input_nombreMateria;
    // End of variables declaration//GEN-END:variables
}
