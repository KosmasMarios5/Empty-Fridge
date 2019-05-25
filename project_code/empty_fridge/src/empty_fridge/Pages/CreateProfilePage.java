/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empty_fridge.Pages;

import Repository.IEntityRepository;
import Repository.Test.TestUserRepository;
import empty_fridge.Entities.User;

/**
 *
 * @author petros
 */
public class CreateProfilePage extends Page {
    
    protected IEntityRepository<User> usersRepository;

    public CreateProfilePage() {
        this.usersRepository = new TestUserRepository();
    }
    
    public void addUser(String username, String password, String email){
        User user = new User(username,password,email);
        
        
        User createdUser = this.usersRepository.create(user);
        
        if(createdUser == null){
            this.error("Something went wrong.");
        }
        
        this.display("UserDataOage");
        
    }
    
}
