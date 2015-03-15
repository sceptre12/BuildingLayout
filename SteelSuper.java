/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buildinglayout;

import java.util.ArrayList;

/**
 *
 * @author xthom001
 */
public class SteelSuper {
    private int amount;
    private double baseCost;
    //fabodo renamed type to form factor
    private String formFactor;
    
    //unified form factors with their price offsets. when on is set or changed, the other is too
    private ArrayList<String> formFactors;
    private ArrayList<Integer> priceOffsets;;
    
    public SteelSuper(int amount, double cost){
        this.amount = amount;
        this.baseCost = cost;
    }
    public int getAmount() {
        return amount;
    }
    public void setAmount(int amount) {
        this.amount = amount;
    }
    public double getCost() {
        return baseCost;
    }
    public void setCost(double cost) {
        this.baseCost = cost;
    }
    public double getTotalCost(){
        return this.amount * this.baseCost;
    }
    //uses parallel data structures to store form factors and their price 
    //offsets in corresponding indices of their respective arrays
    public void setFormFactors(){
        String[] forms = {"Flat Square","Round Bar", "Square Bar", "Beam"};
        formFactors = new ArrayList(forms.length);
        
        int[] offsets = {-5,-10, 5, 20};
        priceOffsets = new ArrayList(offsets.length);
        
        for(int a = 0; a < forms.length; a++ ){
            formFactors.add(forms[a]);
            priceOffsets.add(offsets[a]);
        }
    }
    public boolean isValidFormFactor(String type){
        for(int a = 0; a < formFactors.size() ; a++){
               if(formFactors.get(a).equalsIgnoreCase(type)){
                   return true;
               }
        }
        return false;
    }
    //formFactor is only set once (when null); can be 'changed' in a different method
    public void setFormFactor(String option){
    	if (formFactor == null && isValidFormFactor(option)){
    		baseCost += priceOffsets.get(formFactors.indexOf(option));
    		formFactor = option;
    	}
    }
    //changes form factor only if the new value is valid and differs from the existing value
    public void changeFormFactor(String option){
    	if (formFactor == null) setFormFactor(option);
    	else if (!option.equalsIgnoreCase(formFactor) && isValidFormFactor(option)){
    		baseCost += priceOffsets.get(formFactors.indexOf(option)) - priceOffsets.get(formFactors.indexOf(formFactor));
    		formFactor = option;
    	}
    }
}
