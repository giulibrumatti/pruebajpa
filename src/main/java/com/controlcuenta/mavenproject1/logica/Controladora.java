/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.controlcuenta.mavenproject1.logica;

import com.controlcuenta.mavenproject1.persistencia.ControladoraPersistencia;
import java.util.ArrayList;


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
    
    public ArrayList<Alumno> devolverListaAlumnos(){
        return controlPersis.devolerListaAlumnos();
    }
    
    //CARRERA
    
    public void crearCarrera(Carrera carr){
        controlPersis.crearCarrera(carr);
    }
    
    public void eliminarCarrera(int idCarr){
        controlPersis.eliminarCarrera(idCarr);
    }
    
    public void editarCarrera(Carrera carr){
        controlPersis.editarCarrera(carr);
    }
    
    public Carrera buscarCarrera(int id){
        return controlPersis.buscarCarrera(id);
    }
    
    public ArrayList<Carrera> devolverListaCarreras(){
        return controlPersis.devolverListaCarreras();
    }
    
    //MATERIA
    
    public void crearMateria(Materia mat){
        controlPersis.crearMateria(mat);
    }
    
    public void eliminarMateria(int id){
        controlPersis.eliminarMateria(id);
    }
    
    public void editarMateria(Materia mat){
        controlPersis.editarMateria(mat);
    }
       

    public Materia buscarMateria(int id){
        return controlPersis.buscarMateria(id);
    }
    
    public ArrayList<Carrera> devolverListaMaterias(){
        return controlPersis.devolverListaMaterias();
    }
}
