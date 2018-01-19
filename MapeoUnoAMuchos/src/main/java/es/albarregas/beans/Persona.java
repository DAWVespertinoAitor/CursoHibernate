/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.albarregas.beans;

import java.util.ArrayList;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Daw2
 */
@Entity
@Table(name="persona1an")
public class Persona {
    @Id
    @Column(name="id")
    private int id;
    @Column(name="nombre")
    private String nombre;
    @OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name="idPersona")
    private ArrayList<Libro> libros;

    public Persona() {
    }

    public Persona(int id, String nombre, ArrayList<Libro> libros) {
        this.id = id;
        this.nombre = nombre;
        this.libros = libros;
    }

    public ArrayList<Libro> getLibros() {
        return libros;
    }

    public void setLibros(ArrayList<Libro> libros) {
        this.libros = libros;
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
    
}
