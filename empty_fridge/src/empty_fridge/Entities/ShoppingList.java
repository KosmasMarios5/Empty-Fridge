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
    Recipe recipe = new Recipe();
    Ingredient ingredients = new Ingredient();
    boolean checkedIngredients;
    String shoppingList;
    public void addRecipeToShoppingList(Recipe recipe){
        this.recipe.title = shoppingList;        // ειτε μπορουμε να το δηλώσουμε το id       
    }
    
    public void addIngredient(Ingredient ingredients){ 
        this.ingredients.title = shoppingList;      
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
