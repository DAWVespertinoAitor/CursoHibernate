package es.albarregas.dao;

import es.albarregas.beans.Persona;
import java.util.List;


public interface IPersonaDAO {
    
    public void add(Persona persona);
    public List<Persona> get();
    public Persona getOne(int pk);
    public void update(Persona persona);
    public void delete(Persona persona);
   
    
}