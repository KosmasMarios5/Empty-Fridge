/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empty_fridge.Entities;

/**
 *
 * @author Alexandros
 */
public class Filter {
    String[] sortableFilters = {" "};
    String[] filters = {" "};
    
    public Filter(){
        
    }
    public String[] getFilters(){
        
        return this.filters;
    }
    public String[] getSortableFilters(){
        
        return this.sortableFilters;
    }
}
