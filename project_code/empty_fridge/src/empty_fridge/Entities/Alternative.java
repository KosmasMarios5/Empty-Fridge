/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empty_fridge.Entities;

import empty_fridge.Entities.Ingredient;
import java.util.ArrayList;

/**
 *
 * @author Kostis
 */
public class Alternative {
    
    ArrayList<Ingredient> ingredients = new ArrayList<Ingredient>();
    
    public ArrayList<Ingredient> similarIngredients(String word){
        return ingredients; 
    }
    
}
