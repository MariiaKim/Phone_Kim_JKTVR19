/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools.manager;

import entity.Customer;
import entity.facade.CustomerFacade;
import factory.FacadeFactory;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author pupil
 */
public class CustomerManager {
    
    private CustomerFacade customerFacade = FacadeFactory.getCustomerFacade();

    public Customer createReader() {
        Customer customer = new Customer();
        System.out.println("--- Зарегистрировать читателя ---");
        System.out.println("Введите имя:");
        Scanner scanner = new Scanner(System.in);
        customer.setFirstname(scanner.nextLine());
        System.out.println("Введите фамилию:");
        customer.setLastname(scanner.nextLine());
        System.out.println("Введите телефон:");
        customer.setPhone(scanner.nextLine());
        customerFacade.create(customer);
        return customer;
    }

    public void printListReaders() {
        List<Customer> listReaders = customerFacade.findAll();
        if(listReaders == null){
            System.out.println("Нет читателей");
            return;
        }
        for (Customer r : listCustomers) {
            if(r != null){
                System.out.println(r.getId()+". "+r.toString());
            }
        }
    }
    
}
