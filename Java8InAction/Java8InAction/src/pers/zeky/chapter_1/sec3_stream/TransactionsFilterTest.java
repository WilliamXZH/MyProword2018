package pers.zeky.chapter_1.sec3_stream;

import java.util.ArrayList;
import java.util.Currency;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TransactionsFilterTest {

	public static Map<Currency, List<Transaction>> filter(List<Transaction> transactions) {

		Map<Currency, List<Transaction>> transactionsByCurrencies = new HashMap<Currency, List<Transaction>>();
		for (Transaction transaction : transactions) {
			if (transaction.getPrice() > 1000) {
				Currency currency = transaction.getCurrency();
				List<Transaction> transactionsForCurrency = transactionsByCurrencies.get(currency);
				if (transactionsForCurrency == null) {
					transactionsForCurrency = new ArrayList<>();
					transactionsByCurrencies.put(currency, transactionsForCurrency);
				}
				transactionsForCurrency.add(transaction);
			}
		}
		return transactionsByCurrencies;
	}

	public static Map<Currency, List<Transaction>> filterWithStream(List<Transaction> transactions) {

		return transactions.stream().filter((Transaction t) -> t.getPrice() > 1000)
				.collect(Collectors.groupingBy(Transaction::getCurrency));

	}

	public static void main(String[] args) {

	}

}
