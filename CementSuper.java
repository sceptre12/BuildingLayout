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
    private int timeToDry; // in hours 
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

    public int getTimeToDry() {
        return timeToDry;
    }

    public void setTimeToDry(int timeToDry) {
        this.timeToDry = timeToDry;
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
