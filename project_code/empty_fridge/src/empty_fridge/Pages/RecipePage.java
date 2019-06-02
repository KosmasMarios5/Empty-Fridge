/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empty_fridge.Pages;

import Repository.IEntityRepository;
import Repository.Test.TestRecipeRepository;
import Repository.Test.TestShoppingListRepository;
import Repository.Test.TestUserRepository;
import empty_fridge.Entities.Comment;
import empty_fridge.Entities.CookingTool;
import empty_fridge.Entities.Image;
import empty_fridge.Entities.Recipe;
import empty_fridge.Entities.ShoppingList;
import empty_fridge.Entities.User;
import empty_fridge.Menus.ShoppingListOverview;
import java.util.ArrayList;


public class RecipePage extends Page{
    
    protected IEntityRepository<ShoppingList> shoppigListRepository;
    protected Recipe recipe;
    
    public RecipePage() {
        this.shoppigListRepository = new TestShoppingListRepository();
    }
    
    public RecipePage(Recipe recipe) {
        this();
        this.recipe = recipe;
    }
    
    
    public void addRecipeToShoppingList(){
        ShoppingListOverview overview = new ShoppingListOverview();
        overview.addToShoppingList(this.recipe);
        overview.display();
    }
    
    public void selectInstructions(){
        String instructions = this.recipe.getInstructions();
        this.display(instructions);
    }
    
    public void selectTools(){
        ArrayList<CookingTool> tools = this.recipe.getTools();
        this.display(tools);
    }
    
    public void selectRate(){
        Integer rating = this.recipe.getRating();
        this.display(rating.toString());
    }


}
