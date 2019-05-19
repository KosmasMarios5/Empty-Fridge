/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empty_fridge;

import Repository.IEntityRepository;
import Repository.Test.TestRecipeRepository;
import Repository.Test.TestUserRepository;
import empty_fridge.Entities.Recipe;
import empty_fridge.Entities.User;
import java.util.ArrayList;

/**
 *
 * @author petros
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IEntityRepository<Recipe> recipesRepository;
        recipesRepository = new TestRecipeRepository();
        
        Recipe recipe1 = recipesRepository.load(0);
        Recipe recipe2 = recipesRepository.load(1);
        
        System.out.println(recipe1.getTitle() + " " + recipe2.getTitle());
        
        IEntityRepository<User> usersRepository = new TestUserRepository();
        
        ArrayList<User> users = usersRepository.loadMultiple();
        
        System.out.println("Users");
        for (User user : users) {
            System.out.println(user.getUserName()+ " " + user.getEmail());
        }
        
    }
        
        
        
    }

