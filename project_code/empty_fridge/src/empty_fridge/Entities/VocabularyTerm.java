/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empty_fridge.Entities;

/**
 *
 * @author kosma
 */
public class VocabularyTerm extends Entity {
    String title;
    int weight;
    VocabularyTerm parent;
    
    public String getTtile(){
        return this.title;
    }
}
