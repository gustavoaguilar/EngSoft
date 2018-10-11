/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Persistence.Cliente;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author gustavo
 */
public class ClienteDAO {

    public boolean persist(Cliente cliente) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("EngSoftPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        
        try {
            em.persist(cliente);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            em.close();
            return false;
        } finally {
            em.close();
        }
        return true;
    }
    
//    public List<Cliente> select(String atributo, String tipo){
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("EngSoftPU");
//        EntityManager em = emf.createEntityManager();
//        em.getTransaction().begin();
//        
//        List<Cliente> l = null;
//        
//        try{
//            Query q = em.createNativeQuery("select * from CLIENTE c where "+tipo.toUpperCase()+" = '"+atributo+"';", Cliente.class);
//            l = q.getResultList();
//        }catch(Exception e){
//            em.getTransaction().rollback();
//        }finally{
//            em.close();
//        }
//        return l;
//    }
//    
//    public boolean update(Cliente cliente){
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("EngSoftPU");
//        EntityManager em = emf.createEntityManager();
//        em.getTransaction().begin();
//        
//        try{
//            Object o = em.find(Cliente.class, cliente.getId());
//            
//            Cliente c = (Cliente)o;
//            Cliente o2 = em.merge(c);
//            o2.setNome(cliente.getNome());
//            o2.setCpf(cliente.getCpf());
//            o2.setEndereco(cliente.getEndereco());
//            o2.setTelefone(cliente.getTelefone());
//            o2.setEmail(cliente.getEmail());
//            
//            em.getTransaction().commit();
//        }catch(Exception e){
//            em.getTransaction().rollback();
//            em.close();
//            return false;
//        }finally{
//            em.close();
//        }
//        return true;
//    }
//    
//    public boolean delete(Cliente cliente){
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("EngSoftPU");
//        EntityManager em = emf.createEntityManager();
//        em.getTransaction().begin();
//        
//        try{
//            Object o = em.find(Cliente.class, cliente.getId());
//            em.remove(o);
//            
//            em.getTransaction().commit();
//        }catch(Exception e){
//            em.getTransaction().rollback();
//            em.close();
//            return false;
//        }finally{
//            em.close();
//        }
//        return true;
//    }

    public void persist1(Object object) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("EngSoftPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        try {
            em.persist(object);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }
}
