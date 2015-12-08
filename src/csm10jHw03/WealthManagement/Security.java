package WealthManagement;


public abstract class Security extends Asset
{
    protected int quantity;
    protected double price;
    
    public Security(String name, int quantity, double price)
    {
        super(name);
        this. quantity = quantity;
        this.price = price;
    }
}
