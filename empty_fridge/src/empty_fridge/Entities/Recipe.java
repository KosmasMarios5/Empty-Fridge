
package empty_fridge.Entities;

/**
 *
 * @author kosma
 */
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
    Image[] image; // Πάνω από 1 εικόνα
    int rating;
    String instructions;
    String[] tools;
    
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
    public int getRecipe(int rid){
        return this.id;
    }
    
    public String getInstructions(int rid){
        return instructions;
    }
    
    public Ingredient[] getIngredients(int rid){
        return ingredients;
    }
    
    public String[] getTools(int rid){
        return tools;
    }
    
}