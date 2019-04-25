/*A Coin Collector, adding up values of coins, demonstrating use of Chain of Responsibility
    Copyright (C) 2019  Amal Alaswad <amal.alaswad@stud.fh-campuswien.ac.at>
    					Julia Djanic <julia.djanic@stud.fh-campuswien.ac.at>
    					Melanie Grotti <melanie.grotti@stud.fh-campuswien.ac.at>
    					Elisabeth Kohlhofer <elisabeth.kohlhofer@stud.fh-campuswien.ac.at>
    					Sandra Stojkov <sandra.stojkov@stud.fh-campuswien.ac.at>

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */
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