package WealthManagement;


public class Stock extends Security
{
    public Stock(String name, int quantity, double price)
    {
        super(name, quantity, price);
    }
    
    @Override
    public double getAssetValue()
    {
        return (price * quantity);
    }
    
    @Override
    public String toString()
    {
        StringBuilder stock = new StringBuilder();
        
        stock.append(name);
        stock.append("; " + this.getClass().getSimpleName());
        
        stock.append("; Shares Owned: ");
        stock.append(quantity);
        
        stock.append("; Price: $");
        stock.append(String.format("%,.2f", price));
        
        stock.append("; Value: $");
        stock.append(String.format("%,.2f", getAssetValue()));
        
        return stock.toString();
    }
}
