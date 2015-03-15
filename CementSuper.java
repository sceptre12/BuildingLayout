/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buildinglayout;

/**
 *
 * @author xthom001
 */
public class CementSuper {
    private double cost;   
    private double timeToDry; // in hours 
    private int amount;
    private static final int Sqft = 2;
    
    public CementSuper(double cost, int timeToDry, int amount ) {
        this.cost = cost;
        this.timeToDry = timeToDry;
        this.amount = amount;
        
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setTotalTimeToDry(int time){
        /*
         only 100sqft of any cement can be used at any given time
         returns the time for the entire amount in hours
        */
       double bagAmount = this.amount / 2;
       this.timeToDry = (bagAmount / 100) * time;
        
    }
    public double getTimeToDry(){
        return timeToDry;
    }
    public double timeinDay(){
        return this.timeToDry/ 24;
    }
    
    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
    
    private int HowMuchNeeded(int givenSqFt){
        return givenSqFt / Sqft;
    }
    public double getTotalcost(){
        return HowMuchNeeded(this.amount) * this.cost;
    }
}
