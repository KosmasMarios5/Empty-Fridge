/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empty_fridge.Pages;
import empty_fridge.Entities.*;

/**
 *
 * @author petros
 */
public class RolePage extends Page{

    
    public void addUserRole(Role role){
        this.currentUser.setRole(role);
        this.currentUser.save();
    }
}
