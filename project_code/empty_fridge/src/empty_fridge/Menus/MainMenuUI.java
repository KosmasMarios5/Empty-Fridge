/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empty_fridge.Menus;

import empty_fridge.Entities.*;
import empty_fridge.Pages.*;
/**
 *
 * @author Petros
 */
public class MainMenuUI extends Menu{
    
    public void selectOption(String option){

        if ( "User".equals(option)){
            display();//UserPage
        }else if( "Role".equals(option)){
            display();//RolePage
        }else if( "Notification".equals(option)){
            display();//NotificationPage
        }       
    }
    
}
