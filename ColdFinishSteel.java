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
public class ColdFinishSteel extends SteelSuper{
    public static final double cost = 15.76;
    public ColdFinishSteel(int amount){
        super(amount, cost);
        super.setTypes();
    }
}
