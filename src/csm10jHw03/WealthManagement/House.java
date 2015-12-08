package WealthManagement;


public class House extends Property
{
    public House(String name, double value, double debtAmount)
    {
        super(name, value, debtAmount);
    }
    
    @Override
    public String toString()
    {
        StringBuilder house = new StringBuilder();
        
        house.append(name);
        house.append("; " + this.getClass().getSimpleName());
        
        house.append("; Value: $");
        house.append(String.format("%,.2f", value));
        
        house.append("; Debt: $");
        house.append(String.format("%,.2f", debtAmount));
        
        return house.toString();
    }
   
}
