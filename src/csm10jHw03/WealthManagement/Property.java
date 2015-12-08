package WealthManagement;


public abstract class Property extends Asset
{
    protected double value, debtAmount;
    
    public Property(String name, double value, double debtAmount)
    {
        super(name);
        this.value = value;
        this.debtAmount = debtAmount;
    }
    
    public double getDebtAmount()
    {
        return debtAmount;
    }
    
    @Override
    public double getAssetValue()
    {
        return value;
    }
}
