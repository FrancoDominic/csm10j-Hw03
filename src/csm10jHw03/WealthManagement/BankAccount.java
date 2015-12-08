package WealthManagement;


public class BankAccount extends Asset
{
    private double value;
    
    public BankAccount(String name, double value)
    {
        super(name);
        this.value = value;
    }
    
    @Override
    public double getAssetValue()
    {
        return value;
    }
    
    @Override
    public String toString()
    {
        StringBuilder bankAccount = new StringBuilder();
        
        bankAccount.append("Bank Account Value: $");
        bankAccount.append(String.format("%,.2f,", value));
        
        return bankAccount.toString();
    }
}
