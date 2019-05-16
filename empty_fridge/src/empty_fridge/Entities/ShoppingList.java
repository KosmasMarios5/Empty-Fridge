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
    Recipe recipe;// sto shopping List 9a periexei kai suntagh h mono ulika
    Ingredient ingredients;
    String checkedIngredients;// ti kanei to sugkekrimeno attribute?
    String shoppingList;//pros9esa kai ena attribute shoppinglist giati den uphrxe sto domain model
    /*
    giati na uparxoun autes oi duo me9odoi enw mporoume na baloume mia setShoppingList opws exw kanei parakatw;
    public void addRecipeToShoppingList(String recipe){
        this.shoppingList = recipe;
    }
    
    public void addIngredient(String ingredients){ 
        
    }
    */
    public void setShoppingList(String shoppingList){
        this.shoppingList=shoppingList;
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
