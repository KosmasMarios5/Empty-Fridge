/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empty_fridge.Pages;

/**
 *
 * @author petros
 */
public class UserEmailPage extends Page{
    
    public void sendConfirmationForm(){
        String message = "Your account was created successfully.";
        this.display();
    }
    
    public void acceptConfirmationForm(){
        this.currentUser.activateAccount();
        this.currentUser.save();
        this.display();
    }

}
