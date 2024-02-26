/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.controlcuenta.mavenproject1.logica;

import com.controlcuenta.mavenproject1.persistencia.ControladoraPersistencia;

/**
 *
 * @author Rombo del Tejar
 */
public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    public void crearAlumno(Alumno alu){
        controlPersis.crearAlumno(alu);
    }
    
    public void eliminarAlumno(int idAlumno){
        controlPersis.eliminarAlumno(idAlumno);
    }
    
    public void editarAlumno(Alumno alu){
        controlPersis.editarAlumno(alu);
    }
    
    public Alumno buscarAlumno(int id){
        
        
        return controlPersis.buscarAlumno(id);
    }
}
