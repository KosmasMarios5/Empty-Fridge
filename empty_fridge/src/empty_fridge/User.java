/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empty_fridge;

/**
 *
 * @author petros
 */
public class User {
    //attribute
    //tha ta balw se lista pio meta
    int id;
    String[] username = {"nikos", "giannhs", "kwstas"};
    String[] password = {"test1", "test2", "test3"};
    String[] email = {"test1@gmail.com", "test2@gmail.com", "test3@gmail.com"};
    String[] userData = {"something1", "something2", "something3"};
    String[] role;
    boolean accessNotification;
    int[] cookLevel = {1,2,3,4,5};
    
    
    //methods
    public static boolean isLoggedIn(){
        /*kwdikas elegxou. 
        Alex: Thelw na epistrefei to id tou xrhsth pou einai logarismenos.
        Poios einai LoggedIn?? True = (>0) False = 0.
        */
        return true; 
    }

    public void setUserData(String newUserData){
        this.userData[id] = newUserData;
    }
    
    public void validateLogin(String testUsername, String testPassword){
        int i;
        for( i=0; i<10; i++){
            if ( testUsername.equals(username[i]) && testPassword.equals(password[i]) ){
                id = i;
            }
        }
    }
    
    public String getRole(){
        return role[id];
    }
    
    
}