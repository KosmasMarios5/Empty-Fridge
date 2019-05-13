
package empty_fridge.Entities;

import empty_fridge.Entities.CookingTool;
import empty_fridge.Entities.Ingredient;

public class Recipe {
    int id;
    String title;
    Ingredient[] ingredients;
    CookingTool[] cookingTools;
    String[] categories;
    User author;
    String description;
    Image image;
    int rating;
    String instructions;
    
    public Recipe (){
    }
    
    public Recipe(String title){
        this.title = title;
    }
    
    public String getTitle(){
        return this.title;
    }
    
    public void setTitle(String title){
        this.title = title;
    }
}