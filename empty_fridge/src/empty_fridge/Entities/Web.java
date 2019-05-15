<<<<<<< HEAD
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empty_fridge.Entities;

import empty_fridge.Entities.Recipe;
/**
 *
 * @author Alexandros
 */
public class Web {
// extends Recipe <--------- ?
   String[] recipes = {"Makaronada" , "Pizza", "KotopouloStoFourno"};
/* I need to return a list of recipes here  
 * Can the method type returned be an array of "Recipe"?
 * Use void?  
 */
    public String[] search(String ingredients){
        int done = 0;
        String[] webRecipes = {" ", " ", " "};
        while(done == 0){
            if (makaronada.getIngredient() == ingredients){
                webRecipes[1] = {"Makaronada"};
                done = 1;
            }else if (pizza.getIngredient() == ingredients){
                webRecipes[2] = {"Pizza"};
                done = 1;
            }else if (kotopoulostofourno.getIngredient() == ingredients){
                webRecipes[3] = {"KotopouloStoFourno"};
                done = 1;
            }else{
                /* error recipe not found */
                done = 1;
            }  
        }
        return webRecipes;
        /* Omoia me tin search ths Recipe. Epistrefei "recipes"
        */
    }
}
=======
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empty_fridge.Entities;

import empty_fridge.Entities.Recipe;
/**
 *
 * @author Alexandros
 */
public class Web {
// extends Recipe <--------- ?
   String[] recipes = {"Makaronada" , "Pizza", "KotopouloStoFourno"};
/* I need to return a list of recipes here  
 * Can the method type returned be an array of "Recipe"?
 * Use void?  
 */
    public String[] search(String ingredients){
        int done = 0;
        String[] webRecipes = {" ", " ", " "};
        while(done == 0){
            if (makaronada.getIngredient() == ingredients){
                webRecipes[1] = {"Makaronada"};
                done = 1;
            }else if (pizza.getIngredient() == ingredients){
                webRecipes[2] = {"Pizza"};
                done = 1;
            }else if (kotopoulostofourno.getIngredient() == ingredients){
                webRecipes[3] = {"KotopouloStoFourno"};
                done = 1;
            }else{
                /* error recipe not found */
                done = 1;
            }  
        }
        return webRecipes;
        /* Omoia me tin search ths Recipe. Epistrefei "recipes"
        */
    }
}
>>>>>>> e867b98f3adc25eaaf3c280aafa81e36f38ad428
