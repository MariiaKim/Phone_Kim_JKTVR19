/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity.facade;

import entity.Phone;
import factory.ConnectSingleton;
import javax.persistence.EntityManager;
/**
 *
 * @author pupil
 */
public class PhoneFacade extends AbstractFacade<Phone>{
    
    public PhoneFacade() {
        super(Phone.class);
    }
   
    @Override
    protected EntityManager getEntityManager() {
        ConnectSingleton connect = ConnectSingleton.getInstance();
        return connect.getEntityManager();
    }
}

