/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package empty_fridge.Entities;

import empty_fridge.Entities.Ingredient;
import empty_fridge.Entities.Recipe;
import empty_fridge.Pages.Page;
import empty_fridge.Pages.RecipePage;
import empty_fridge.Pages.SearchPage;
import java.util.ArrayList;

public class ShoppingList extends Entity {
    
    public static int STATUS_ALL_CHECKED = 0;
    public static int STATUS_INGREDIENT_CHECKED = 1;
    public static int STATUS_INGREDIENT_UNCHECKED = 2;   
    
    Recipe recipe;
    User user;
    ArrayList<Ingredient> ingredients = new ArrayList<Ingredient>();
    ArrayList<Ingredient> checkedIngredients = new ArrayList<Ingredient>();
    

    public ShoppingList(int i, String kwstas, String labrakiceidupatrasgr, Role role) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void addRecipe(Recipe recipe){
        this.recipe = recipe;
        for(Ingredient ingredient: recipe.ingredients){
            this.addIngredient(ingredient);
        }
    }
    
    public void addIngredient(Ingredient ingredient){ 
        this.ingredients.add(ingredient);
    }
    
    public int checkIngredient(Ingredient ingredient){
        if(this.ingredients.contains(ingredient)){
            if(!this.checkedIngredients.contains(ingredient)){
                this.ingredients.add(ingredient);
                if(this.allChecked()){
                    Page page;
                    if(this.recipe != null){
                        page = new RecipePage(this.recipe);
                    }else{
                        page = new SearchPage(this.ingredients);
                    }
                    this.deleteAll();
                    page.display();
                    return STATUS_ALL_CHECKED;
                }
                return STATUS_INGREDIENT_CHECKED;
            }
            this.checkedIngredients.remove(ingredient);
            return STATUS_INGREDIENT_UNCHECKED;
        }
        throw new Error("Ingredient doesn't exist in shopping list.");
    }
    
    public boolean allChecked(){
        if(this.checkedIngredients.size() != this.ingredients.size()){
            return false;
        }
        for (Ingredient ingredient : ingredients) {
            if(!this.checkedIngredients.contains(ingredient)){
                return false;
            }
       }
       return true;
    }

    public void deleteAll(){
        ArrayList<Ingredient> ingredients = new ArrayList<Ingredient>();
        ArrayList<Ingredient> checkedIngredients = new ArrayList<Ingredient>();
    }
}
