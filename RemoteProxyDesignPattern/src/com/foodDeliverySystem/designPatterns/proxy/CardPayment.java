package com.foodDeliverySystem.designPatterns.proxy;

// payment class that handles all the operations on the cash using a credit/debit card
public class CardPayment implements Cash {

	@Override
	public void add(int amountToAdd) {
		System.out.println("Adding amount to the wallet using card.." + amountToAdd);
	}
		
}
