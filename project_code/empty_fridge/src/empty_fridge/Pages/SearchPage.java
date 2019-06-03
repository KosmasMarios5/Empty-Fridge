/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empty_fridge.Pages;

import Repository.IEntityRepository;
import Repository.Test.TestFilterRepository;
import empty_fridge.Entities.Ingredient;
import empty_fridge.Entities.Recipe;
import empty_fridge.Entities.Filter;
import empty_fridge.Entities.User;
import empty_fridge.Entities.Favorite;
import empty_fridge.Entities.Favorite;
import empty_fridge.Entities.Filter;
import empty_fridge.Entities.Ingredient;
import empty_fridge.Entities.Recipe;
import empty_fridge.Entities.SavedSearch;
import empty_fridge.Entities.Session;
import empty_fridge.Entities.User;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alexandros
 */
public class SearchPage extends Page{
    
    IEntityRepository<Filter> filterRepository;
    IEntityRepository<Ingredient> ingredientRepository;
    IEntityRepository<Recipe> recipeRepository;
    
    public SearchPage(){
        this.filterRepository = new TestFilterRepository();     
    }
    
    public SearchPage(ArrayList<Ingredient> ingredients){
        this();
    }
    
    public void startSearch(ArrayList<Ingredient> ingredients, Filter filters){
        ArrayList<Recipe> recipes = this.recipeRepository.loadMultiple();
        ArrayList<Recipe> recipesToReturn =  new ArrayList<Recipe>();
        
        for(Ingredient ingredient : ingredients ){
            for(Recipe recipe : recipes ){
                if(recipe.getIngredients().contains(ingredient)){
                    recipesToReturn.add(recipe);
                }
            }
        }
        
        if(recipes.isEmpty()){
            //TODO: search web
            //recipes = repcipes from web
        }
        
        
        ArrayList<String> searchAttributes = filters.getFilters();
        
        for(String query : searchAttributes ){
                String[] split = query.split(",");
                String attribute = split[0];
                String value = split[1];
                for(Recipe recipe : recipesToReturn ){
                    try {
                        Field field = recipe.getClass().getDeclaredField(attribute);
                        field.setAccessible(true);
                        
                        if(!field.get(recipe).toString().contains(value)){
                            recipesToReturn.remove(recipe);
                        }
                        
                    } catch (Exception ex) {
                        Logger.getLogger(SearchPage.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        
        recipesToReturn = this.applySorting(recipesToReturn, filters);
        
        this.display(recipesToReturn);
    }
    
    public ArrayList<Recipe> applySorting(ArrayList<Recipe> recipes, Filter filters){
        ArrayList<String> sortByAttributes = filters.getSortableFilters();
        
        for(String sortBy : sortByAttributes ){
                Collections.sort(recipes, new Comparator<Recipe>() {
                    public int compare(Recipe recipe2, Recipe recipe1)
                    {
                        try {
                            Field field = recipe1.getClass().getDeclaredField(sortBy);
                            field.setAccessible(true);
                            
                            return  field.get(recipe1).toString().compareTo(
                                    field.get(recipe2).toString()
                            );
                        
                        } catch (Exception ex) {
                        Logger.getLogger(SearchPage.class.getName()).log(Level.SEVERE, null, ex);
                        return 0;
                        }
                    }
                });
            }
        
        return recipes;
    }

    public void viewFilteringOptions(){
    
    }
   
    
    public void startPreviousSearch(SavedSearch savedSearch){
            if(!this.currentUser.isLoggedIn()){return;}
            
            if(savedSearch == null){
                Session session = this.currentUser.getSessionStorage();
                savedSearch = session.getSavedSession(null);
            }
            this.startSearch(savedSearch.ingredients, savedSearch.filters);
    }
    

}
