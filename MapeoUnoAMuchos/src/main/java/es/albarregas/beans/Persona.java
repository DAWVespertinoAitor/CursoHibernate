/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.albarregas.beans;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Daw2
 */
@Entity
@Table(name="persona1an")
public class Persona implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private int id;
    @Column(name="nombre")
    private String nombre;
    @OneToMany(fetch = FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinTable(name="personaLibro",
                joinColumns = @JoinColumn(name = "personaId", referencedColumnName = "id"),
                inverseJoinColumns = @JoinColumn(name = "libroId", referencedColumnName = "idLibro")
    )
    private List<Libro> libros;

    public Persona() {
    }

    public Persona(int id, String nombre, List<Libro> libros) {
        this.id = id;
        this.nombre = nombre;
        this.libros = libros;
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public void setLibros(List<Libro> libros) {
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

    @Override
    public String toString() {
        return "Persona{" + "id=" + id + ", nombre=" + nombre + ", libros=" + libros.size() + '}';
    }
    
    
    
}
