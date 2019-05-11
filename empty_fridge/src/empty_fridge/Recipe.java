/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empty_fridge;

/**
 *
 * @author petros
 */
public class Recipe extends User {
    //atribute
    int recipeId = 0;
    String[] title = {"spaghetti"}; 
    String[] ingredient = {"spaghetti", "salt", "oil"};
    String[] categories = {"meat", "salad", "vegan"};
    String[] cookingTool;
    
    //methods
    public void search(){
        //dokimastiko einai kai oxi h lysh ths methodou 
        String writeIngredient;
        writeIngredient = "spaghetti";
        for(int i=0; i<3; i++){
            if ( ingredient[i].equals(writeIngredient)){
                recipeId = 1;
            }
            i++;
        }      
    }
    
    public String getRecipe(){
        return title[recipeId];
    }    
    
    //paradeigma xrhshs methods apo mia klash se allh
    public boolean test(){
        return User.isLoggedIn();
}    
}
