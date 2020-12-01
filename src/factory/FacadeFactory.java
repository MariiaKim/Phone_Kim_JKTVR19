/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

import entity.Phone;
import entity.History;
import entity.Customer;
import entity.User;
import entity.facade.PhoneFacade;
import entity.facade.HistoryFacade;
import entity.facade.CustomerFacade;
import entity.facade.UserFacade;
/**
 *
 * @author pupil
 */
public class FacadeFactory {
    public static PhoneFacade getPhoneFacade(){
        return new PhoneFacade();
    }
    public static UserFacade getUserFacade(){
        return new UserFacade();
    }
    public static CustomerFacade getCustomerFacade(){
        return new CustomerFacade();
    }
    public static HistoryFacade getHistoryFacade(){
        return new HistoryFacade();
    }
}

