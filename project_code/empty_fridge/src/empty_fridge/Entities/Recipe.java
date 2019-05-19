
package empty_fridge.Entities;

/**
 *
 * @author kosma
 */
import empty_fridge.Entities.CookingTool;
import empty_fridge.Entities.Ingredient;
import java.util.ArrayList;

public class Recipe extends Entity{
    String title;
    ArrayList<Ingredient> ingredients = new ArrayList<Ingredient>();
    ArrayList<CookingTool> cookingTools = new ArrayList<CookingTool>();
    ArrayList<Image> images = new ArrayList<Image>();
    String[] categories;
    User author;
    String description;
    int rating;
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
    
    public String getInstructions(int rid){
        return this.instructions;
    }
    
    public Ingredient[] getIngredients(int rid){
        return null;
    }
    
    public void getTools(int rid){
    }
    
}