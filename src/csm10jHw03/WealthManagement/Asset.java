package WealthManagement;


/**
 *
 * @author francolavares
 */
public abstract class Asset 
{
    public String name;
    
    public Asset(String name)
    {
        this.name = name;
    }
    
    public abstract double getAssetValue();
}
