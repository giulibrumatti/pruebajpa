/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.controlcuenta.mavenproject1;
import com.controlcuenta.mavenproject1.logica.Alumno;
import com.controlcuenta.mavenproject1.logica.Carrera;
import com.controlcuenta.mavenproject1.logica.Controladora;
import com.controlcuenta.mavenproject1.logica.Materia;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;

/**
 *
 * @author Rombo del Tejar
 */
public class Mavenproject1 {

    public static void main(String[] args) {
        Controladora control = new Controladora();
        //Se crea la lista vacia de materias
        LinkedList<Materia> listaMaterias = new LinkedList();
        
        //Carrera creacion con lista de materias vacias
        Carrera carre = new Carrera(5, "Tecnicatura en programación", listaMaterias);
        control.crearCarrera(carre);
        
        //MATERIA
        Materia mate1 = new Materia(58, "Programacion 1", "Cuatri", carre);
        Materia mate2 = new Materia(59, "Programacion 2", "Cuatri", carre);
        Materia mate3 = new Materia(60, "Programacion Avanzada", "Cuatri", carre);
        
        //Guardado Materias en la BD
        control.crearMateria(mate1);
        control.crearMateria(mate2);
        control.crearMateria(mate3);
        
        //Creamos lista de materias y las agregamos
        
        listaMaterias.add(mate1);
        listaMaterias.add(mate2);
        listaMaterias.add(mate3);
        
        carre.setListaMaterias(listaMaterias);
        control.editarCarrera(carre);

        //Alumno
       Alumno alu2 = new Alumno(10, "Leo", "Messi", new Date(), carre);
       control.crearAlumno(alu2);
       
       /*
       System.out.println("---------------------------");
       System.out.println("---DATOS ALUMNO---");
       
       Alumno alu = control.buscarAlumno(10);
       System.out.println("Alumno: " + alu.getNombre() + " " + alu.getApellido());
       System.out.println("Cursa la carrera de: " + alu.getCarre().getNombre());
        */
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
