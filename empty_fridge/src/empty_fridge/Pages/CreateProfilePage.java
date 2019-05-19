/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empty_fridge.Pages;

import empty_fridge.Entities.User;

/**
 *
 * @author petros
 */
public class CreateProfilePage {
    User[] user;
    public void addUser(User username, User password, User email){
        this.user[1] = username;
        this.user[2] = password;
        this.user[3] = email;
    }
    public void error(){
        
    }
}
