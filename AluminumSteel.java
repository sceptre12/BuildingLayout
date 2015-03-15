package buildinglayout;

/**
 *
 * @author xthom001
 */
public class AluminumSteel extends SteelSuper{
    private static final double  cost =  24.26;
    public AluminumSteel(int amount){
        super(amount,cost);
        setFormFactors(); //no need to specify super.methodName() because method is not overridden
    }
}
