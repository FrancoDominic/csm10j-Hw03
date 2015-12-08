package WealthManagement;


import java.util.*;

public class Wealth 
{
    private List<Asset> assetList;
    
    public Wealth ()
    {
        assetList = new ArrayList<>();
    }
    
    public void addAsset(Asset x)
    {
        assetList.add(x);
    }
    
    public double getTotalAssets()
    {
        double totalAssets = 0;
        
        for (int i = 0; i < assetList.size(); i++)
        {
            totalAssets += assetList.get(i).getAssetValue(); 
        }
        
        return totalAssets;
    }
    
    public double getTotalDebts()
    {
        double totalDebts = 0;
        
        for (int i = 0; i < assetList.size(); i++)
        {
            if (assetList.get(i) instanceof Property)
            {
                totalDebts += ((Property)assetList.get(i)).getDebtAmount();
            }
        }
        
        return totalDebts;
    }
    
    public double getNetWorth()
    {
        return (getTotalAssets() - getTotalDebts());
    }
    
    public String getAssetSummary()
    {
        StringBuilder assetSummary = new StringBuilder();
        
        assetSummary.append("Asset Summary: \n");
        for(int i = 0; i < assetList.size(); i++)
        {
            assetSummary.append(assetList.get(i).toString());
            assetSummary.append("\n");
        }
        return assetSummary.toString();
    }
    
    @Override 
    public String toString()
    {
        StringBuilder wealth = new StringBuilder();
        
        wealth.append("Total Net Worth: $");
        wealth.append(String.format("%,.2f", getNetWorth()));
        
        wealth.append("; Assets: $");
        wealth.append(String.format("%,.2f", getTotalAssets()));
        
        wealth.append("; Debts: $");
        wealth.append(String.format("%,.2f", getTotalDebts()));
        
        return wealth.toString();
    }
}
