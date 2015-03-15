package buildinglayout;

/**
 *
 * @author xthom001
 */
public class ColdFinishSteel extends SteelSuper{
    public static final double cost = 15.76;
    public ColdFinishSteel(int amount){
        super(amount, cost);
        setFormFactors(); //no need to specify super.methodName() because method is not overridden
    }
}
