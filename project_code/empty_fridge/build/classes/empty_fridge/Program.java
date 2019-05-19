/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empty_fridge;

import Repository.IEntityRepository;
import Repository.Test.TestRecipeRepository;
import empty_fridge.Entities.Recipe;

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
    }
    
}
