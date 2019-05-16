/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empty_fridge.Entities;
/*
 * @author Alexandros
 */
public class Session {
    int id;
    int userid;
    Ingredient[] ingredients;
    Filter[] filters;
    Ingredient[] OldIngredients;
    Filter[] OldFilters;
            
    public Session(){
        
    }
    
    public void save(Filter Sfilters){
        /* Save Filters (Allagh Sequence Filters) 
        *  me eisodo filters
        */
        this.filters[0] = Sfilters;
    }
    
    public void save(Ingredient Singredients){
        /* Save Ingredients Allagh Sequence Filters)
        *  me eisodo ingredients
        */
        this.ingredients[0] = Singredients;
    }
    
    public Ingredient[] getSavedSession(String ylika){
        /* Me to user id epistrefei ta apothikeumena ingredients
        *  pou eixe epilexei kai swsei o xrhsths prohgoumenws
        */
        return this.OldIngredients;
    }
    
    public Filter[] getSavedSession(int filtra){
        /* Me to user id epistrefei ta apothikeumena filters
        *  pou eixe epilexei kai swsei o xrhsths prohgoumenws
        */
        return this.OldFilters;
    }
    
    public Ingredient[] getIngredients(){
        return this.ingredients;
    }
    
    public Filter[] getFilters(){
        return this.filters;
    }
}
