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
public class EcoCement extends CementSuper{
    private static final int timeToDry = 12; // in hours 
    private static final double cost = 50;
    
    public EcoCement(int amount){
        super(cost,timeToDry, amount);        
    }
    public double getEcoDryTime(){
       super.setTotalTimeToDry(timeToDry);
       return super.getTimeToDry();
    }
}
