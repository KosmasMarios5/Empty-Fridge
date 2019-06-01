/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empty_fridge.Pages;

import Repository.IEntityRepository;
import Repository.Test.TestFilterRepository;
import empty_fridge.Entities.Favorite;
import empty_fridge.Entities.Filter;
import empty_fridge.Entities.Recipe;
import java.util.ArrayList;

public class ResultsPage extends Page{
    
    IEntityRepository<Filter> filterRepository;
    
    public ResultsPage(){
       this.filterRepository = new TestFilterRepository(); 
   }
   
    
    public void selectRecipe(Recipe recipe){
        Page page = new RecipePage(recipe);
        page.display();
    }
    
    public void viewSortingOptions(){
        ArrayList<Filter> filters = this.filterRepository.loadMultiple();
        
        for(Filter filter : filters){
            this.display(filter.getFilters());
        }
    }
    
    public void viewFilteringOptions(){
        ArrayList<Filter> filters = this.filterRepository.loadMultiple();
        
        for(Filter filter : filters){
            this.display(filter.getSortableFilters());
        }   
    }
    
    public void viewSavedFavorites(){
        ArrayList<Favorite> favorites = this.currentUser.getUserFavorites();
        this.display(favorites);
    }
    
    
    public void display(ArrayList items){
    }
    
}
