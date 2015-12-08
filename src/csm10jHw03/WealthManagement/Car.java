package WealthManagement;


public class Car extends Property
{
    public Car(String name, double value, double debtAmount)
    {
        super(name, value, debtAmount);
    }
    
    @Override
    public String toString()
    {
        StringBuilder car = new StringBuilder();
        
        car.append(name);
        car.append("; " + this.getClass().getSimpleName());
        
        car.append("; Value: $");
        car.append(String.format("%,.2f", value));
        
        car.append("; Debt: $");
        car.append(String.format("%,.2f", debtAmount));
        
        return car.toString();
    }
}
