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

import java.util.Scanner;

public class Main {
	static CoinChain coinChain = new CoinChain();
	static Scanner scanner = new Scanner(System.in);
    
    public static void main(String args[]) {

    	System.out.println("==Welcome to your Coin Collector==\n"
    			+ " ==Please insert your Coin here==\n\n"
    			+ "                ++\n"
    			+ "                ||\n"
    			+ "                ||\n"
    			+ "                ++\n\n"
    			+ "     ==(type \"esc\" to exit)==");
 
    	while (true) {
    		if(scanner.hasNextDouble()) {
    			double coin = scanner.nextDouble();
    			coinChain.addCoin(coin);
    		} else {
    			String input = scanner.next();
    			if ("esc".equals(input)) {
    				break;
    			} else { 
    				System.out.println("...Not a Coin.\n"
    						+ "Please try it with actual Currency (double value).\n"
    						+ "To exit, type \"esc\" (without the quotation marks :P)\n");
    			}
    		}
    	}
    	
        scanner.close();
    	System.out.println("Thanks for Piggy Banking!\n"
    			+ "This is what you collected today:\n");
    	coinChain.printTotal();
    	}
}