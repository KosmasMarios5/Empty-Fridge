/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empty_fridge.Entities;

import empty_fridge.Entities.CookingTool;
import java.util.ArrayList;

/**
 *
 * @author Kostis
 */
public class Partner { 
    String partnerName; // Fantazomai oti einai to brand sthn CookingTool 
    int partnerId;
    ArrayList<CookingTool> cookingTools = new ArrayList<CookingTool>();
}
