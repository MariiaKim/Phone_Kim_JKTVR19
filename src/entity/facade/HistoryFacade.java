/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity.facade;

import entity.History;
import entity.Customer;
import factory.ConnectSingleton;
import java.util.List;
import javax.persistence.EntityManager;
/**
 *
 * @author pupil
 */
public class HistoryFacade extends AbstractFacade<History>{
    

    public HistoryFacade() {
        super(History.class);
    }
   
    @Override
    protected EntityManager getEntityManager() {
        ConnectSingleton connect = ConnectSingleton.getInstance();
        return connect.getEntityManager();
    }
  
    public List<History> findAll(boolean reading) {
        try {
            return getEntityManager().createQuery("SELECT h FROM History h WHERE h.returnDate = NULL")
                    .getResultList();
        } catch (Exception e) {
            return null;
        }
    }

    public List<History> findAll(Customer customer) {
        try {
            return getEntityManager().createQuery("SELECT h FROM History h WHERE h.returnDate = NULL AND h.customer=:customer")
                    .setParameter("customer", customer)
                    .getResultList();
        } catch (Exception e) {
            return null;
        }
    }

   

   


}
