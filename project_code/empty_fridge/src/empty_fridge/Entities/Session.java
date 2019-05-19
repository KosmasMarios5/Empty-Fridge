/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empty_fridge.Entities;
import empty_fridge.Entities.Ingredient;
import empty_fridge.Entities.Filter;
import java.util.ArrayList;
/*
 * @author Alexandros
 */
public class Session {
    
    int userid;
    ArrayList<Ingredient> ingredients = new ArrayList<Ingredient>();
    ArrayList<Filter> filters = new ArrayList<Filter>();
    
    ArrayList<Ingredient> oldIngredients = new ArrayList<Ingredient>();
    ArrayList<Filter> oldFilters = new ArrayList<Filter>();
    
    public Session(){
        
    }
    
    public void save(Filter Sfilters){
        /* Save Filters (Allagh Sequence Filters) 
        *  me eisodo filters
        */
        
    }
    
    public void save(Ingredient Singredients){
        /* Save Ingredients Allagh Sequence Filters)
        *  me eisodo ingredients
        */
        
    }
    
    public ArrayList<Ingredient> getSavedSession(String ylika){
        /* Me to user id epistrefei ta apothikeumena ingredients
        *  pou eixe epilexei kai swsei o xrhsths prohgoumenws
        */
        return null;
    }
    
    public ArrayList<Filter> getSavedSession(int filtra){
        /* Me to user id epistrefei ta apothikeumena filters
        *  pou eixe epilexei kai swsei o xrhsths prohgoumenws
        */
        return null;
    }
    
    public ArrayList<Ingredient> getIngredients(){
        return null;
    }
    
    public ArrayList<Filter> getFilters(){
        return null;
    }
}
