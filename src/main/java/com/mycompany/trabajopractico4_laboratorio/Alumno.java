
package com.mycompany.trabajopractico4_laboratorio;

import java.util.HashSet;
import java.util.Set;


public class Alumno {

private int nroLegajo;
private String apellido;
private String nombre;
public HashSet<Materia> materias;

    public Alumno() {
    }



    public Alumno(int nroLegajo, String apellido, String nombre) {
        this.nroLegajo = nroLegajo;
        this.apellido = apellido;
        this.nombre = nombre;
        this.materias = new HashSet<>();
    }

    public int getNroLegajo() {
        return nroLegajo;
    }

    public void setNroLegajo(int nroLegajo) {
        this.nroLegajo = nroLegajo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(Set<Materia> materias) {
        this.materias = (HashSet<Materia>) materias;
    }

    

   
    


    /*Funciones*/
    
    public void agregarMateria(Materia materia){
        if (materias.add(materia)){
            System.out.println("Se inscribio correctamente al alumno en la materia: " + materia.getNombre());
        
        } else {
            System.out.println("El alumno ya se encuentra inscripto en la materia: " + materia.getNombre());
        }
    
    }
    
    
    public int cantidadMaterias(Materia m){
    return materias.size();
    }
    
    
    
    


}
