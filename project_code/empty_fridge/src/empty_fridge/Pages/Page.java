/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empty_fridge.Pages;

import empty_fridge.Entities.User;

/**
 *
 * @author Kostis
 */
public class Page {
    User currentUser;
    
    
    public void display(){
        //display this page
    }
    
    
    public void redirect(String pageName){
        //redirect to pageName
    }
    
    
    
    public void error(String message){
        throw new RuntimeException(message);
    }
}