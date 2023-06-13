package com.foodDeliverySystem.designPatterns.proxy;

// This is the PROXY class that is used to add the money and is exposed to the outside world for faster transactions
public class Wallet implements Cash {
	
	private CardPayment cardPayment;
	private UPIPayment upiPayment;
	private String modeOfPayment;
	
	public Wallet(String modeOfPayment) {
		super();
		this.cardPayment = new CardPayment();
		this.upiPayment = new UPIPayment();
		this.modeOfPayment = modeOfPayment;
	}

	@Override
	public void add(int amountToAdd) {
		if (modeOfPayment.equalsIgnoreCase("CARD_PAYMENT")) {
			System.out.println("Mode of adding money to the wallet is via CARD ..");
			cardPayment.add(amountToAdd);
			
		} else if (modeOfPayment.equalsIgnoreCase("UPI_PAYMENT")) {
			System.out.println("Mode of adding money to the wallet is via UPI ..");
			upiPayment.add(amountToAdd);
			
		} else {
			System.out.println("Mode of adding money to the wallet is not provided or entered wrong..");
		}
	}

}
