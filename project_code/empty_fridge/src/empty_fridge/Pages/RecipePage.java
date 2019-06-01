/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empty_fridge.Pages;

import Repository.IEntityRepository;
import Repository.Test.TestShoppingListRepository;
import Repository.Test.TestUserRepository;
import empty_fridge.Entities.Comment;
import empty_fridge.Entities.Image;
import empty_fridge.Entities.Recipe;
import empty_fridge.Entities.ShoppingList;
import empty_fridge.Entities.User;
import empty_fridge.Menus.ShoppingListOverview;


public class RecipePage extends Page{
    
    protected IEntityRepository<ShoppingList> shoppigListRepository;

    public RecipePage() {
        this.shoppigListRepository = new TestShoppingListRepository();
    }
    
    public RecipePage(Recipe recipe) {
        this();
    }
    
    
    public void addRecipeToShoppingList(Recipe recipe){
        ShoppingListOverview overview = new ShoppingListOverview();
        overview.addToShoppingList(recipe);
        overview.display();
    }
    
    public void selectInstructions(){
    }
    
    public void selectTools(){}
    
    public void selectRate(){}
}
