/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empty_fridge.Entities;

import java.util.ArrayList;


public class SavedSearch {
    public ArrayList<Ingredient> ingredients = new ArrayList<Ingredient>();
    public Filter filters;
    
    public SavedSearch(ArrayList<Ingredient> ingredients, Filter filters){
        this.ingredients = ingredients;
        this.filters = filters;
    }
    
}
