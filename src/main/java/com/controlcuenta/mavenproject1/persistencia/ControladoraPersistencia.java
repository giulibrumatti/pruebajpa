/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.controlcuenta.mavenproject1.persistencia;

import com.controlcuenta.mavenproject1.logica.Alumno;
import com.controlcuenta.mavenproject1.logica.Carrera;
import com.controlcuenta.mavenproject1.persistencia.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rombo del Tejar
 */
public class ControladoraPersistencia {
    AlumnoJpaController aluJpaCon = new AlumnoJpaController();
    CarreraJpaController carrJpaCon = new CarreraJpaController();

    public void crearAlumno(Alumno alu) {
        aluJpaCon.create(alu);

    }

    public void eliminarAlumno(int idAlumno){
        try {
            aluJpaCon.destroy(idAlumno);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public void editarAlumno(Alumno alu) {
        try {
            aluJpaCon.edit(alu);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Alumno buscarAlumno(int id) {
        return aluJpaCon.findAlumno(id);
    }

    public ArrayList<Alumno> devolerListaAlumnos() {
        List<Alumno> listaAlu = aluJpaCon.findAlumnoEntities();
        ArrayList<Alumno> listaAlumnos = new ArrayList (listaAlu);
        
        return listaAlumnos;     
    }

    public void crearCarrera(Carrera carr) {
        carrJpaCon.create(carr);
    }

    public void eliminarCarrera(int idCarr) {
        try {
            carrJpaCon.destroy(idCarr);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void editarCarrera(Carrera carr) {
        try {
            carrJpaCon.edit(carr);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Carrera buscarCarrera(int id) {
        return carrJpaCon.findCarrera(id);
    }

    public ArrayList<Carrera> devolverListaCarreras() {
        List<Carrera> listaCarr = carrJpaCon.findCarreraEntities();
        ArrayList<Carrera> listaCarreras = new ArrayList (listaCarr);
        
        return listaCarreras;     
    }
    

    
 
}