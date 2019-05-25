/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empty_fridge.Entities;

import java.util.ArrayList;

/**
 *
 * @author kosma
 */
public class Ingredient extends VocabularyTerm {
    int quantity;
    ArrayList<String> categories = new ArrayList<String>();
    
    public ArrayList<String> getCategories(){
        return this.categories;
    }

}
