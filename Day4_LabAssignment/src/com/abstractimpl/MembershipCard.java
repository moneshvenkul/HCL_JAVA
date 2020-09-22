package com.abstractimpl;

import com.abstractclasses.Card;

public class MembershipCard extends Card {

	private int rating;

	public MembershipCard(String holderName, String cardNumber, String expiryDate, int rating) {
		super(holderName, cardNumber, expiryDate);
		this.rating = rating;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "MembershipCard [getRating()=" + getRating() + ", getHolderName()=" + getHolderName()
				+ ", getCardNumber()=" + getCardNumber() + ", getExpiryDate()=" + getExpiryDate() + "]";
	}

}
