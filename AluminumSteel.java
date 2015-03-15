package buildinglayout;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author xthom001
 */
public class AluminumSteel extends SteelSuper{
    private static final double  cost =  24.26;
    public AluminumSteel(int amount){
        super(amount,cost);
        super.setTypes();
    }
}
