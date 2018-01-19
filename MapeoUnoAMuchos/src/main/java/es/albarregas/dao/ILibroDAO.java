package es.albarregas.dao;

import es.albarregas.beans.Libro;
import java.util.List;


public interface ILibroDAO {
    
    public void add(Libro libro);
    public List<Libro> get();
    public Libro getOne(int pk);
    public void update(Libro libro);
    public void delete(Libro libro);
   
    
}