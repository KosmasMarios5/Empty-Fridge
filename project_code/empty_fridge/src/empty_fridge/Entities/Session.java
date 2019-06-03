/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empty_fridge.Entities;
import empty_fridge.Entities.Ingredient;
import empty_fridge.Entities.Filter;
import java.util.ArrayList;

/*
 * @author Alexandros
 */
public class Session {
    
    User user;
    ArrayList<SavedSearch> savedSearches = new ArrayList<SavedSearch>();
    
    public Session(){
        
    }
    
    public SavedSearch getSavedSession(Integer index){
        if(index != null){
            index = savedSearches.size();
        }
        return savedSearches.get(index);
    }
    
    
    public void save(ArrayList<Ingredient> ingredients, Filter filters){
        this.savedSearches.add(new SavedSearch(ingredients,filters));
    }
    
}
