/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package empty_fridge.Entities;

import empty_fridge.Entities.Ingredient;
import empty_fridge.Entities.Recipe;

/**
 *
 * @author petros
 */
public class ShoppingList {
    Recipe[] recipe;
    Ingredient[] ingredients;
    boolean checkedIngredients;
    String shoppingList;

    public void addRecipeToShoppingList(Recipe[] recipe){
    }
    
    public void addIngredient(Ingredient[] ingredients){ 
        
    }
    
    public boolean allChecked(){
        return true;
    }

    public void deleteAll(){
        
    }
    
    public String getShoppingList(){
        return shoppingList;
    }
}
