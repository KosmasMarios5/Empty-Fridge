/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor. 
 */
package empty_fridge.Entities;

import java.util.ArrayList;

/**
 *
 * @author Alexandros
 */
public class Filter extends Entity {
    ArrayList<String> sortableFilters =  new ArrayList<String>();
    ArrayList<String> filters = new ArrayList<String>();
    
    public ArrayList<String> getFilters(){
        return this.filters;
    }
    public ArrayList<String> getSortableFilters(){
        return this.sortableFilters;
    }
}
