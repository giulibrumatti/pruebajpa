/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.controlcuenta.mavenproject1;
import com.controlcuenta.mavenproject1.logica.Alumno;
import com.controlcuenta.mavenproject1.logica.Carrera;
import com.controlcuenta.mavenproject1.logica.Controladora;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Rombo del Tejar
 */
public class Mavenproject1 {

    public static void main(String[] args) {
        Controladora control = new Controladora();
        //Carrera
        Carrera carre = new Carrera(5, "Tecnicatura en programación");
        control.crearCarrera(carre);
        
       Alumno alu2 = new Alumno(10, "Leo", "Messi", new Date(), carre);
       control.crearAlumno(alu2);
       
       System.out.println("---------------------------");
       System.out.println("---DATOS ALUMNO---");
       
       Alumno alu = control.buscarAlumno(10);
       System.out.println("Alumno: " + alu.getNombre() + " " + alu.getApellido());
       System.out.println("Cursa la carrera de: " + alu.getCarre().getNombre());
        
        /*Alumno alu = control.buscarAlumno(15);
        System.out.println("----BÙSQUEDA INDIVIDUAL----");
        System.out.println("El alumno es: " + alu.toString());
        
        System.out.println("----BÙQUEDA DE TODOS----");
        ArrayList<Alumno> listaAlumnos = control.devolverListaAlumnos();
        for(Alumno al : listaAlumnos){
            System.out.println("El alumno es: " + al.toString());
        }
        
        //control.eliminarAlumno(15);*/
        
        //alu.setApellido("Brumatti");
        //control.editarAlumno(alu);
    }
    

}
