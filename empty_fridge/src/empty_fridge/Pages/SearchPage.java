/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empty_fridge.Pages;

import empty_fridge.Entities.Ingredient;
import empty_fridge.Entities.Recipe;
import empty_fridge.Entities.Filter;
import empty_fridge.Entities.User;
import empty_fridge.Entities.Favorite;
import empty_fridge.Entities.Favorite;
import empty_fridge.Entities.Filter;
import empty_fridge.Entities.Ingredient;
import empty_fridge.Entities.Recipe;
import empty_fridge.Entities.User;
/**
 *
 * @author Alexandros
 */
public class SearchPage extends Page{
    
    Ingredient[] ingredients;
    Filter[] filters;
    Recipe[] recipes;
    Favorite favorites;
    
    public void startSearch(){
        /*
        main search function
        * getIngredients();
        * getFilters();
        Apo Session
        if Selected Previous Search Option{
        * isLoggedIn();
        Apo User
        * this.ingredients = getSavedSession("i");
        * this.filters = getSavedSession(2); }
        Apo Session
        * this.recipes[] = search(ingredients[], filters[]);
        Apo Recipe
        */
    }
    public void applySorting(){
        
    }
    /* public void selectIngredients(){
        //Δεν θα έπρεπε να είναι εδώ αυτό. Στην IngredientSelectMenu ισως?
    } */
    public void display(){
        //Θα κάνει display των sorted recipes (search results)
        
    }
    public void viewFilteringOptions(){
    
    }
    
    public void chooseIngredient(){}
    
    public void viewSortingOptions(){}
    
    public void refresh(){}
}
