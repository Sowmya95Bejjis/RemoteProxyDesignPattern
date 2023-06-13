package com.foodDeliverySystem.designPatterns;

import com.foodDeliverySystem.designPatterns.proxy.*;

public class RemoteProxyPattern {
	
	 /**
     * This project is used to demonstrate Remote PROXY Design Pattern - one of the structural design pattern available today.
     * PROXY translates to "in place of," "representing," or "on behalf of" and it literally explains 
     * what this pattern is all about. It has classes that represents functionality of other classes. 
     * In PROXY pattern, we create objects having original objects to interface its functionality to outer world and thereby 
     * controlling and managing access to the object that is being protected
     *
     * In our food delivery application, Having a wallet to manage the cash required to place the orders instead of 
     * using UPI or managing credit/debit cards for every order. 
     */
	
	public static void main(String[] args) {
		// creating a cash object and performing payment 1 using card as mode of payment
		Cash payment1 = new Wallet("CARD_PAYMENT");
		payment1.add(100);

		// creating a cash object and performing payment 2 using UPI as mode of payment

		Cash payment2 = new Wallet("UPI_PAYMENT");
		payment2.add(200);
    }

}
