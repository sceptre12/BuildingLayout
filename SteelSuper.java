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
    private ArrayList<String> types = new ArrayList<>();
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
    public void setTypes(){
        String[] list = {"Flat Square","Round Bar", "Square Bar", "Beam"};
        for(int a = 0; a < list.length; a++ ){
            this.types.add(list[a]);
        }
    }
    public boolean isValidType(String type){
        for(int a = 0; a < this.types.size() ; a++){
               if(types.get(a).equalsIgnoreCase(type)){
                   return true;
               }
        }
        return false;
    }
    public void setTypeCost(String type){
        if(isValidType(type)){
            if(type.equalsIgnoreCase("Flat Square")){
               this.baseCost += -5;
            }else if(type.equalsIgnoreCase("Round Bar")){
               this.baseCost += -10;
            }else if(type.equalsIgnoreCase("Square Bar")){
               this.baseCost += 5;
            }else if (type.equalsIgnoreCase("Beam")){
               this.baseCost += 20;
            }            
        }
    }
    
}
