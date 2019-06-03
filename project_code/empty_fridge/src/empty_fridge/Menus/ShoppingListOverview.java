/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empty_fridge.Menus;

import Repository.IEntityRepository;
import Repository.Test.TestIngredientRepository;
import Repository.Test.TestShoppingListRepository;
import empty_fridge.Pages.*;
import empty_fridge.Entities.*;
import java.util.ArrayList;

public class ShoppingListOverview extends Menu {
    
    protected IEntityRepository<ShoppingList> shoppigListRepository;
    
    public ShoppingListOverview (){
        this.shoppigListRepository = new TestShoppingListRepository();
    
    }
   
   public void mark(Ingredient ingredient){
       ShoppingList shoppingList = this.currentUser.getShoppingList();
       int response = shoppingList.checkIngredient(ingredient);
       if(response == ShoppingList.STATUS_INGREDIENT_CHECKED || response == ShoppingList.STATUS_INGREDIENT_UNCHECKED){
           this.display();
       }else if(response == ShoppingList.STATUS_ALL_CHECKED){
           this.hide();
       }
   }
   
   public void selectIngredients(){
       IngredientSelectMenu ingredientMenu = new IngredientSelectMenu();
       ingredientMenu.display();
   }
   
   public void addToShoppingList(Recipe recipe){
        ShoppingList shoppingList = this.currentUser.getShoppingList();
        shoppingList.addRecipe(recipe);
        this.shoppigListRepository.update(shoppingList);
        this.display();
    }
    
   
   public void addToShoppingList(Ingredient ingredient){
        ShoppingList shoppingList = this.currentUser.getShoppingList();
        shoppingList.addIngredient(ingredient);
        this.shoppigListRepository.update(shoppingList);
        this.display();
    }
    
}
