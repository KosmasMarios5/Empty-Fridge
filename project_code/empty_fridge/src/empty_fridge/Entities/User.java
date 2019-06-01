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

    int cookLevel;
    String notification;
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
    
    
    public boolean validateLogin(String username, String password){
        return username.equals(this.username) && password.equals(this.password);
    }
    
    public String getUserName(){
        return this.username;
    }
    
       
    public String getEmail(){
        return this.email;
    }
    
    
    public void setRole(Role role)throws Exception{
        if(this.checkRole()){
            this.role = role;
            this.save();
        }
        throw new Exception("cannot set role");
    }
    
    public Role getRole(){
        return role;
    }
    
    public void save(){
        
    }
    
    public void sendVerificationEmail(){
        
    }
    
    public String getNotification(){
        return this.notification;
    }
    
    public void setNotification(String notification)throws Exception{
        if(this.checkNotification()){
            this.notification = notification;
            this.save();
        }
        throw new Exception("cannot set notification");
    }
    
    public void validate(){
        
    }
    
    public boolean checkUserData(){
        return true;
    }
    
    public boolean checkRole(){
        return true;
    }
    
    public boolean checkNotification(){
        return true;
    }
    
    public void saveSession(Ingredient[] ingr, Filter[] filt, User usr, int iduser){
        //Σώζει τις επιλογές της τελευταίας αναζήτησης που έκανε ο χρήστης.
    }
    
    
    public void activateAccount(){
        this.isActive = true;
    }
    
    public ShoppingList getShoppingList(){
        return this.shoppingList;
    }
    
    
    public ArrayList<Favorite> getUserFavorites(){
        return this.favorites;
    }
}