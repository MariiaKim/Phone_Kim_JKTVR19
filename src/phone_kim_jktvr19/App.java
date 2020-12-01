/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phone_kim_jktvr19;

import entity.User;
import security.SecureManager;
import ui.UserInterface;
/**
 *
 * @author pupil
 */
public class App {
    public static enum storageFile{BOOKS, READERS, USERS, HISTORIES};
    public static User loggedInUser;
    
    public App() {
    }
    
    public void run() {
      
            System.out.println("--- магазин ---");
            SecureManager secureManager = new SecureManager();
            App.loggedInUser = secureManager.checkInLogin();
            UserInterface userInterface = new UserInterface();
            if(App.loggedInUser == null){
                System.out.println("У вас нет прав доступа");
                return;
            }
            if(SecureManager.role.MANAGER.toString().equals(App.loggedInUser.getRole())){
                //публикуем интерфейс менеджера
                userInterface.printManagerUI();
            }else if(SecureManager.role.READER.toString().equals(App.loggedInUser.getRole())){
                //публикуем интерфейс заказчика
                userInterface.printReaderUI();
            }
        
    }

}

