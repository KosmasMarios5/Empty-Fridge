/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empty_fridge.Pages;

import empty_fridge.Entities.User;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author petros
 */
public class UserDataPage extends Page{
    
    public void addUserData(String userData){
        try {
            this.currentUser.setUserData(userData);
        } catch (Exception ex) {
            this.error(ex.getMessage());
        }
    }
    
    public String getUserData(){
        return this.currentUser.getUserData();
    }
}
