package org.nomike.jules.chaincoin;

import java.util.Scanner;

public class Main {
    
    public static void main(String args[]) {
    	CoinChain coinChain = new CoinChain();
    	Scanner scanner = new Scanner(System.in);
    	
    	System.out.println("==Welcome to your Coin Collector==\n"
    			+ " ==Please insert your Coin here==\n"
    			+ "                ++\n"
    			+ "                ||\n"
    			+ "                ||\n"
    			+ "                ++\n");
 
    	while (true) {
    		if(scanner.hasNextDouble()) {
    			double coin = scanner.nextDouble();
    			coinChain.addCoin(coin);
    	    	coinChain.printTotal();
    		} else {
    			System.out.println("Not a Coin. Please try it with actual Currency (double value)");
    			break;
    		}
    	}
    	scanner.close();
//    	coinChain.printTotal();
    }
}
