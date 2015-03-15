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
public class CheapCement extends CementSuper{
    private static final int timeToDry = 24; // in hours 
    private static final double cost = 8.50;
    
    public CheapCement(int amount){
        super(cost,timeToDry, amount);        
    }
    
    public double getCheapDryTime(){
       super.setTotalTimeToDry(timeToDry);
       return super.getTimeToDry();
    }
}
