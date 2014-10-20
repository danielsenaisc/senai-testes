/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author brunoazzi
 */
public class Conexao {
    private static final String PERSISTENCE_UNIT = "TesteDependenciaOraclePU";

    private static final EntityManagerFactory factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT);
    private static final EntityManager em = factory.createEntityManager();

    private static void getTransaction() {
        if (!em.getTransaction().isActive()) {
            em.getTransaction().begin();
        }
    }

    private static void commit() {
        em.getTransaction().commit();
    }

    /**
     * Método que permite a persistencia de Objetos no Banco de Dados
     * @param aThis Objeto a ser persistida
     */
    public static void persist(GenericDao aThis) {
        getTransaction();
        em.persist(aThis);
        commit();
    }

    /**
     * Método que permite a remoção de Entidades do Banco de Dados
     * @param aThis Objeto a ser removida
     */
    protected static void remove(GenericDao aThis) {
        getTransaction();
        em.remove(aThis);
        commit();
    }
    
    public static List<Object> namedQuery(String namedQuery){
        Query query = em.createNamedQuery(namedQuery);
        return query.getResultList();
    }

    public static List<Object> namedQuery(String namedQuery, List<Object> values, String[] parameters) {
        Query query = em.createQuery(namedQuery);

        for (int iterador = 0; iterador < values.size(); iterador++) {
            query.setParameter(parameters[iterador], values.get(iterador));
        }

        return query.getResultList();
    }

    public static List<Object> namedQuery(String namedQuery, Object value, String parameter){
        Query query = em.createQuery(namedQuery);
        query.setParameter(parameter, value);
        return query.getResultList();
    }
    
    public static Object singleResultNamedQuery(String namedQuery, List<Object> values, String[] parameters){
        Query query = em.createQuery(namedQuery);

        for (int iterador = 0; iterador < values.size(); iterador++) {
            query.setParameter(parameters[iterador], values.get(iterador));
        }

        return query.getSingleResult();
    }
    
    public static Object singleResultNamedQuery(String namedQuery, Object value, String parameter) {
        Query query = em.createQuery(namedQuery);
        query.setParameter(parameter, value);
        return query.getSingleResult();
    }
    
    public static List<Object> queryResultList(String query) {
        Query selectAll = em.createQuery(query);
        return selectAll.getResultList();
    }

    public static Object querySingleResult(String query) {
        Query select = em.createQuery(query);
        return select.getSingleResult();
    }
    
    
}
