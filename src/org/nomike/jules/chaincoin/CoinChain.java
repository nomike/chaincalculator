package org.nomike.jules.chaincoin;

import java.util.ArrayList;
import java.util.List;

public class CoinChain extends CoinHandler {

    private CoinType oneCent;
    private CoinType twoCent;
    private CoinType fiveCent;
    private CoinType tenCent;
    private CoinType twentyCent;
    private CoinType fiftyCent;
    private CoinType oneEuro;
    private CoinType twoEuro;
    
    private List <CoinType> coinTypes;
    
    double value; 
    
    public CoinChain() {
        oneCent = new CoinType("One Cent", 0.01);
        twoCent = new CoinType("Two Cent", 0.02);
        fiveCent = new CoinType("Five Cent", 0.05);
        tenCent = new CoinType("Ten Cent", 0.10);
        twentyCent = new CoinType("Twenty Cent", 0.20);
        fiftyCent = new CoinType("Fifty Cent", 0.50);
        oneEuro = new CoinType("One Euro", 1.00);
        twoEuro = new CoinType("Two Euro", 2.00);
        
        coinTypes = new ArrayList<CoinType>();

        coinTypes.add(oneCent);
        coinTypes.add(twoCent);
        coinTypes.add(fiveCent);
        coinTypes.add(tenCent);     
        coinTypes.add(twentyCent);
        coinTypes.add(fiftyCent);     
        coinTypes.add(oneEuro);
        coinTypes.add(twoEuro);      
        
        oneCent.nextCoinType(twoCent);
        twoCent.nextCoinType(fiveCent);
        fiveCent.nextCoinType(tenCent);
        tenCent.nextCoinType(twentyCent);
        twentyCent.nextCoinType(fiftyCent);
        fiftyCent.nextCoinType(oneEuro);
        oneEuro.nextCoinType(twoEuro);
        twoEuro.nextCoinType(this);        
    }
	
    public void addCoin(double value) {
            this.value = value;
			oneCent.checkCoin(value);			
    }
    
    protected double sumTotal() {
    	double sum = 0;
    	for(int i = 0; i < coinTypes.size(); i++) {
    	    sum += coinTypes.get(i).getSum();
    	}
    	return sum;	
    }

    protected void printTotal() {
    	for (int i = 0; i < coinTypes.size(); i++) {
    		System.out.println(coinTypes.get(i).getName() + ":\n"
    							+ coinTypes.get(i).getCount() + " x "
    							+ format.format(coinTypes.get(i).getCoinTypeValue()) + ": "
    							+ format.format(coinTypes.get(i).getSum()));
    	}
		System.out.println("Total Amount:\n" + format.format(sumTotal()) + " €");
    }
    
    public void checkCoin(double value) {
        	System.out.println("Inserted Coin Type: Unknown \n");
    	}
}