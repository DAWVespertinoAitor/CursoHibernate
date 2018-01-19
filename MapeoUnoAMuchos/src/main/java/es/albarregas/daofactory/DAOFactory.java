package es.albarregas.daofactory;

import es.albarregas.dao.IGenericoDAO;
import es.albarregas.dao.IPersonaDAO;
import es.albarregas.dao.ILibroDAO;

public abstract class DAOFactory {

    

    public abstract IPersonaDAO getPersonaDAO();
    public abstract ILibroDAO getLibroDAO();
    public abstract IGenericoDAO getGenericoDAO();

    public static DAOFactory getDAOFactory() {
        DAOFactory daof = null;

        daof = new MySQLDAOFactory();

        return daof;
    }

}
