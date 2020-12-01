/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools.manager;

import entity.Phone;
import entity.facade.PhoneFacade;
import factory.FacadeFactory;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author pupil
 */
public class PhoneManager {
    private PhoneFacade phoneFacade = FacadeFactory.getPhoneFacade();

    public Phone createPhone() {
        Phone phone = new Phone();
        System.out.println("--- Добавить Phone ---");
        System.out.println("Введите название:");
        Scanner scanner = new Scanner(System.in);
        phone.setTitle(scanner.nextLine());
        System.out.println("Введите model:");
        phone.setMarka(scanner.nextLine());
        int numPublishedYear;
        do{
            System.out.println("Введите год издания:");
            String strPublichedYear = scanner.nextLine();
            try {
                numPublishedYear = Integer.parseInt(strPublichedYear);
                break;
            } catch (Exception e) {
                System.out.println("Вводите цифры!");
            }
        }while(true);
        phone.setPublishedYear(numPublishedYear);
        phoneFacade.create(phone);
        return phone;
    }
    
    public boolean printListBooks() {
        List<Phone> listBooks = phoneFacade.findAll();
        if(listBooks == null || listBooks.size() < 1){
            System.out.println("Книг нет!");
            return false;
        }
        for (Phone b : listPhons) {
            if(b != null){
                System.out.println(b.getId()+". "+b.toString());
            }
        }
        return true;
    }
    
}

