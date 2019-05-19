/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repository.Test;

import Repository.IEntityRepository;
import Repository.Test.TestEntityRepositoryBase;
import empty_fridge.Entities.Recipe;
import java.util.ArrayList;

public class TestRecipeRepository extends TestEntityRepositoryBase<Recipe>{

    public TestRecipeRepository(){
        this.entities.add(new Recipe(0,"salad"));
        this.entities.add(new Recipe(1,"steak "));
        this.entities.add(new Recipe(2,"spaghetti "));
        this.entities.add(new Recipe(3,"feta cheese "));
    }

}
