/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empty_fridge.Entities;

import empty_fridge.Entities.ShoppingList;
import empty_fridge.Entities.Favorite;
/**
 *
 * @author petros
 */
public class User {
    //attribute
    int id;
    String username;
    String password;
    String email;
    String userData;
    String role;
    String history;
    ShoppingList[] shoppingList;
    Favorite[] favorites;
    boolean accessNotification;
    int cookLevel;
    
    
    //methods
    public boolean isLoggedIn(){
        //kwdikas elegxou
        return true; 
    }

    public void setUserData(String userData){
        this.userData = userData;
    }
    
    public void validateLogin(String username, String password){
    }
    
    public String getRole(){
        return role;
    }
    
    public void save(){
        
    }
    
    public void sendVerificationEmail(){
        
    }
    
    public void setNotification(){
        
    }
    
    public void setRole(String role){
        this.role= role;
    }
    
    public void validate(){
        
    }
    
    public void checkUserData(){
        
    }
    
    public void checkRole(){
        
    }
    
    public void checkNotification(){
        
    }
    public void saveSession(Ingredient[] ingr, Filter[] filt, User usr, int iduser){
        //Σώζει τις επιλογές της τελευταίας αναζήτησης που έκανε ο χρήστης.
    }
}