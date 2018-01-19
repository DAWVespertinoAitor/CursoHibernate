package es.albarregas.dao;

import es.albarregas.beans.Persona;
import es.albarregas.persistencia.HibernateUtil;

import java.util.List;

import org.hibernate.Session;


public class PersonaDAO implements IPersonaDAO {

    @Override
    public void add(Persona persona) {
        Session sesion = null;
        try {
            sesion = HibernateUtil.getSessionFactory().openSession();
            sesion.beginTransaction();
            sesion.save(persona);
            sesion.getTransaction().commit();
        } catch(org.hibernate.JDBCException jdbce){
            if(sesion != null){
                sesion.getTransaction().rollback();
            }
        } finally {
            if(sesion != null){
                sesion.close();
            }
        }
    }

    @Override
    public List<Persona> get() {
        List<Persona> listado = null;
        Session sesion = null;
        try {
            sesion = HibernateUtil.getSessionFactory().openSession();
            sesion.beginTransaction();
            listado = sesion.createQuery(" from Persona").list();
            sesion.getTransaction().commit();
        } catch(org.hibernate.JDBCException jdbce){
            if(sesion != null){
                sesion.getTransaction().rollback();
            }
        } finally {
            if(sesion != null){
                sesion.close();
            }
        }
        return listado;
    }

    @Override
    public void delete(Persona persona) {
        Session sesion = null;
        try {
            sesion = HibernateUtil.getSessionFactory().openSession();
            sesion.beginTransaction();
            sesion.delete(persona);
            sesion.getTransaction().commit();
        } catch(org.hibernate.JDBCException jdbce){
            if(sesion != null){
                sesion.getTransaction().rollback();
            }
        } finally {
            if(sesion != null){
                sesion.close();
            }
        }
    }

    @Override
    public Persona getOne(int pk) {
        Persona persona = new Persona();
        Session sesion = null;
        try {
            sesion = HibernateUtil.getSessionFactory().openSession();
            sesion.beginTransaction();
            persona = (Persona)sesion.get(Persona.class, pk);
            sesion.getTransaction().commit();
        } catch(org.hibernate.JDBCException jdbce){
            if(sesion != null){
                sesion.getTransaction().rollback();
            }
        } finally {
            if(sesion != null){
                sesion.close();
            }
        }
        return persona;
    }

    @Override
    public void update(Persona persona) {
        Session sesion = null;
        try {
            sesion = HibernateUtil.getSessionFactory().openSession();
            sesion.beginTransaction();
            sesion.update(persona);
            sesion.getTransaction().commit();
        } catch(org.hibernate.JDBCException jdbce){
            if(sesion != null){
                sesion.getTransaction().rollback();
            }
        } finally {
            if(sesion != null){
                sesion.close();
            }
        }
    }

}
