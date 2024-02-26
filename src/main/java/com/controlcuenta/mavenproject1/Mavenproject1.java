/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.controlcuenta.mavenproject1;
import com.controlcuenta.mavenproject1.logica.Alumno;
import com.controlcuenta.mavenproject1.logica.Controladora;
import java.util.Date;

/**
 *
 * @author Rombo del Tejar
 */
public class Mavenproject1 {

    public static void main(String[] args) {
        Controladora control = new Controladora();
        
        Alumno alu = new Alumno(15, "Gustavo", "Sordini", new Date());
        control.crearAlumno(alu);
        //control.eliminarAlumno(15);
        
        alu.setApellido("Brumatti");
        control.editarAlumno(alu);
    }
    

}
