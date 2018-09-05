package pers.zeky.chapter_3_lambda.sec_6_method_citation;

import pers.zeky.chapter_1.sec3_stream.Transaction;

public class TransactionWrapper {

	private Transaction value;

	public TransactionWrapper(Transaction value) {
		super();
		this.value = value;
	}

	public Transaction getValue() {
		return value;
	}

	public void setValue(Transaction value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "TransactionWrapper [value=" + value + "]";
	}

}
