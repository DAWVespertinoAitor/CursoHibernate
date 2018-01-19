/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.albarregas.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;




/**
 *
 * @author Daw2
 */
@Entity
@Table(name = "libro1an")
public class Libro {
    @Id
    @Column(name="idLibro")
    private int id;
    @Column(name="titulo")
    private String titulo;
    @Column(name="persona")
    @ManyToOne
    @JoinColumn(name="idPersona")
    private Persona persona;

    public Libro() {
    }

    public Libro(int id, String titulo, Persona persona) {
        this.id = id;
        this.titulo = titulo;
        this.persona = persona;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    
    
}
