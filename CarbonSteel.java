package buildinglayout;

/**
 *
 * @author xthom001
 */
public class CarbonSteel extends SteelSuper{
    private static final double cost = 30.90;
    public CarbonSteel(int amount){
        super(amount,cost);
        setFormFactors(); //no need to specify super.methodName() because method is not overridden
    }
}
