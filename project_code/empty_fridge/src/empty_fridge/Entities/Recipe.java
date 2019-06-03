
package empty_fridge.Entities;

import java.util.ArrayList;



public class Recipe extends Entity{
    String title;
    ArrayList<Ingredient> ingredients = new ArrayList<Ingredient>();
    ArrayList<CookingTool> cookingTools = new ArrayList<CookingTool>();
    ArrayList<Image> images = new ArrayList<Image>();
    String[] categories;
    User author;
    String description;
    int rating, totalRatings;
    String instructions;
    
    public Recipe (){
    }
    
    public Recipe(int id, String title){
        this.id = id;
        this.title = title;
    }
    
    public String getTitle(){
        return this.title;
    }
    
    public void setTitle(String title){
        this.title = title;
    }
    public int getRecipe(int rid){
        return this.id;
    }
    
    public String getInstructions(){
        return this.instructions;
    }
    
    public ArrayList<Ingredient> getIngredients(){
        return this.ingredients;
    }
    
    public ArrayList<CookingTool> getTools(){
        return this.cookingTools;
    }
    
    public int getRating(){
        return this.rating;
    }
    
    public int saveRating(int rating){
        
        //todo
    
       return this.getRating();
    }
    
    
}