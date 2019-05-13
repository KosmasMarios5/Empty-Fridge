/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empty_fridge;

import empty_fridge.Entities.Recipe;

/**
 *
 * @author petros
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Recipe recipe1 = new Recipe("hello");
        
        Recipe recipe2 = new Recipe();
        recipe2.setTitle("world");
        
        System.out.println(recipe1.getTitle() + " " + recipe2.getTitle());
    }
    
}
