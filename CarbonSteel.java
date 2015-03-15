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
public class CarbonSteel extends SteelSuper{
    private static final double cost = 30.90;
    public CarbonSteel(int amount){
        super(amount,cost);
        super.setTypes();
    }
}
