package org.nomike.jules.chaincoin;

import java.text.DecimalFormat;

public abstract class CoinHandler {
    DecimalFormat format = new DecimalFormat("####00.00");

    CoinHandler nextCoinType = null;
    
    public void checkCoin(double value) {
    	if (nextCoinType != null ) {
    		nextCoinType.checkCoin(value);
    	}
    }

    public void nextCoinType(CoinHandler nextCoinType) {
        this.nextCoinType = nextCoinType;
    } 
}