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
    String author;
    String item;//giati exoume auto to attributes

    
// prosthesa kai ta parakatw ta opoia pisteuw oti xreiazontai
    String favorite;
    Recipe[] recipe;
    Ingredient[] ingredients;    
    
    public void setFavorite(String favorite){
        this.favorite = favorite;
    }
    
    public String getFavoriteRecipe(){
        return favorite;
    }
   
}
