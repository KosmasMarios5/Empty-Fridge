/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empty_fridge.Entities;

/**
 *
 * @author petros
 */
public class Favorite {
    User author;
    Favorite item;
    Recipe[] recipe;
    Ingredient[] ingredients;    
    
    public void setFavorite(Favorite item){
        this.item = item;
    } 
}
