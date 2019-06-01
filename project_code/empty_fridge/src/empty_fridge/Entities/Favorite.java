/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empty_fridge.Entities;

import java.util.ArrayList;

/**
 *
 * @author petros
 */
public class Favorite extends Entity {
    User author;
    Favorite item;
    ArrayList<Ingredient> ingredients = new ArrayList<Ingredient>();
    ArrayList<Recipe> recipes = new ArrayList<Recipe>();
    
    public Favorite(){
        
    }
    
    public void setFavorite(Favorite item){
        this.item = item;
    } 
}
