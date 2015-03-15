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
public class FastDryCement extends CementSuper{
    private static final int timeToDry = 5; // in hours 
    private static final double cost = 38.50;
    
    public  FastDryCement(int amount){
        super(cost,timeToDry, amount);        
    }
}
