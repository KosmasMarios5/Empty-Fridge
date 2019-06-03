/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empty_fridge.Menus;

import empty_fridge.Entities.*;
import empty_fridge.Pages.*;
import Repository.IEntityRepository;
import Repository.Test.TestUserRepository;
import java.util.ArrayList;
/**
 *
 * @author Petros
 */

public class MainMenuUI extends Menu{
    protected IEntityRepository<User> UserRepository;
    
    public void selectOption(String option){
        ArrayList<User> user =  this.UserRepository.loadMultiple();
        
        if ( "Profile".equals(option)){
            UserDataPage userDataPage = new UserDataPage(); 
            this.display(user);
            userDataPage.display();
        }else if( "Role".equals(option)){
            RolePage rolePage = new RolePage();
            this.display(user);
            rolePage.display(); 
        }else if( "Notification".equals(option)){
            NotificationPage notificationPage = new NotificationPage();
            this.display(user);
            notificationPage.display();
        }       
    }
    
}
