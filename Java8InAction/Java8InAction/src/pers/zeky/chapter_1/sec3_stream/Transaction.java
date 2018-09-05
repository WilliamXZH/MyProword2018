package pers.zeky.chapter_1.sec3_stream;

import java.util.Currency;

public class Transaction {

	private Double price;
	private Currency currency;

	public Transaction() {
		super();
	}

	public Transaction(Double price, Currency currency) {
		super();
		this.price = price;
		this.currency = currency;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Currency getCurrency() {
		return currency;
	}

	public void setCurrency(Currency currency) {
		this.currency = currency;
	}

	@Override
	public String toString() {
		return "Transaction [price=" + price + ", currency=" + currency + "]";
	}

}
