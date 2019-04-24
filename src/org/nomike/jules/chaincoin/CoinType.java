package org.nomike.jules.chaincoin;

public class CoinType extends CoinHandler {
    private String name;
    private int count;
    private double coinTypeValue;
    
    public CoinType(String name, double coinTypeValue) {
    	this.name = name;
        this.coinTypeValue = coinTypeValue;
        this.count = 0;
    }

	protected String getName() {
		return name;
	}
    
    protected double getCoinTypeValue() {
    	return coinTypeValue;
    }

    protected int getCount() {
    	return count;
    }
    
    protected double getSum() {
    	return count * coinTypeValue;
    }
    
    public void checkCoin(double value) {
    	if (value == getCoinTypeValue()) {
    		count++;
    		System.out.println("\nInserted Coin Type: " + getName()
    							+ "\n(Value " + format.format(getCoinTypeValue())
    							+ ", Coin Type Sum: " + format.format(getSum())
    							+ ", Coin Type Total: " + getCount() +")\n");
    	} else {
    		super.checkCoin(value);
    	}
    }
}