/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empty_fridge.Entities;

import empty_fridge.Entities.ShoppingList;
import empty_fridge.Entities.Favorite;
import java.util.ArrayList;
/**
 *
 * @author petros
 */


public class User extends Entity {
    
    String username;
    String password;
    String email;
    String userData;
    Role role;
    ShoppingList shoppingList;
    ArrayList<Favorite> favorites = new ArrayList<Favorite>();
    boolean accessNotification;
    int cookLevel;
    
    boolean isActive;
    
    public User(int id, String username,String email, Role role){
        this.id = id;
        this.username = username;
        this.email = email;
        this.role = role;
    }
    
    
    public User(String username,String password, String email){
        this.id = id;
        this.username = username;
        this.email = email;
        this.role = role;
    }
    
    
    public boolean isLoggedIn(){
        //kwdikas elegxou
        return true; 
    }

    public void setUserData(String userData) throws Exception{
        if(this.checkUserData()){
            this.userData = userData;
            this.save();
        }
        throw new Exception("cannot set user data");
    }
    
    
    public String getUserData(){
        return this.userData;
    }
    
    
    public void validateLogin(String username, String password){
    }
    
    public String getUserName(){
        return this.username;
    }
    
       
    public String getEmail(){
        return this.email;
    }
    
    
    public void setRole(Role role){
        this.role = role;
    }
    
    public Role getRole(){
        return role;
    }
    
    public void save(){
        
    }
    
    public void sendVerificationEmail(){
        
    }
    
    public void setNotification(){
        
    }
    
    public void validate(){
        
    }
    
    public boolean checkUserData(){
        return true;
    }
    
    public void checkRole(){
        
    }
    
    public void checkNotification(){
        
    }
    public void saveSession(Ingredient[] ingr, Filter[] filt, User usr, int iduser){
        //Σώζει τις επιλογές της τελευταίας αναζήτησης που έκανε ο χρήστης.
    }
    
    
    public void activateAccount(){
        this.isActive = true;
    }
    
}