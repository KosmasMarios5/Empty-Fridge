/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empty_fridge.Menus;

import Repository.IEntityRepository;
import Repository.Test.TestIngredientRepository;
import empty_fridge.Pages.*;
import empty_fridge.Entities.*;
import java.util.ArrayList;
/**
 *
 * @author Kostis
 */
public class IngredientSelectMenu extends Menu {
    
    ArrayList<Ingredient> selectedIngredients =  new ArrayList<Ingredient>();
    
    protected IEntityRepository<Ingredient> ingredientRepository;
    
    
    public IngredientSelectMenu (){
        this.ingredientRepository = new TestIngredientRepository();
    }
    
   public void display(){
       ArrayList<Ingredient> ingredients =  this.ingredientRepository.loadMultiple();
       ArrayList<String> categories = new ArrayList<String>();
       
       for (Ingredient ingredient : ingredients) {
           for(String category: ingredient.getCategories())
               if(categories.contains(category)){
                   categories.add(category);
           }
       }
       
       //display categories
   }
   
   public void selectCategory(String categoryName){
       ArrayList<Ingredient> ingredients =  this.ingredientRepository.loadMultiple();
       ArrayList<Ingredient> ingredientsToReturn =  new ArrayList<Ingredient>();
       
       for (Ingredient ingredient : ingredients) {
           ArrayList<String> categories = ingredient.getCategories();
           if(categories.contains(categoryName)){
               ingredientsToReturn.add(ingredient);
           }
       }
       
       //display ingredientsToReturn
   }
  
   
     
   public void selectIngredient(Ingredient ingredient){
       this.selectedIngredients.add(ingredient);
   }
   
   public ArrayList<Ingredient> getSelectedIngredients(){
       return this.selectedIngredients;
   }
   
}
