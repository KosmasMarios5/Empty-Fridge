/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empty_fridge.Entities;
/*
 * @author Alexandros
 */
public class Session {
    int id;
    int userid;
    Ingredient ingredients;
    Filter filters;
    
    public Session(){
    }
    public void save(Filter filters){
        /* Save Filters (Allagh Sequence Filters) 
        *  me eisodo filters
        */
    }
    public void save(Ingredient ingredients){
        /* Save Ingredients Allagh Sequence Filters)
        *  me eisodo ingredients
        */
    }
    public void getSavedSession(int id){
        /* Me to user id epistrefei ta apothikeumena ingredients & filters
        *  pou eixe epilexei kai swsei o xrhsths prohgoumenws
        */
    }
}
