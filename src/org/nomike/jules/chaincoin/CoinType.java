/* A Coin Collector, adding up values of coins, demonstrating use of Chain of Responsibility
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