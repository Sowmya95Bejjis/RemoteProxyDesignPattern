package com.foodDeliverySystem.designPatterns.proxy;

//payment class that handles with all the operations on the cash using UPI
public class UPIPayment implements Cash {

	@Override
	public void add(int amountToAdd) {
		System.out.println("Adding amount to the wallet using UPI.." + amountToAdd);
		
	}
}
