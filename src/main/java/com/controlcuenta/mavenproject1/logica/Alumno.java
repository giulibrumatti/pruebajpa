
package com.controlcuenta.mavenproject1.logica;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Alumno implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    private String nombre;
    private String apellido;
    @Temporal(TemporalType.DATE)
    private Date fechaNac;
    @OneToOne
    private Carrera carre;

    public Date getFechaNac() {
        return fechaNac;
    }

    public Alumno(int id, String nombre, String apellido, Date fechaNac, Carrera carre) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNac = fechaNac;
        this.carre = carre;
    }
    
    public Alumno() {
    }


    @Override
    public String toString() {
        return "Alumno{" + "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", fechaNac=" + fechaNac + ", carre=" + carre + '}';
    }

    public Carrera getCarre() {
        return carre;
    }

    public void setCarre(Carrera carre) {
        this.carre = carre;
    }


    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    
}
