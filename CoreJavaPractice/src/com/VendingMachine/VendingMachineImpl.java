package com.VendingMachine;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class VendingMachineImpl implements VendingMachine {

	private Inventory<Coin> cashInventory = new Inventory<Coin>();
	private Inventory<Item> itemInventory = new Inventory<Item>();
	private long totalsales;
	private Item currentItem;
	private long currentBalance;

	public VendingMachineImpl() {
		initialize();
	}

	private void initialize() {
		// initialize machine with 5 coins of each denomination and 5 cans of each Item

		for (Coin coin : Coin.values()) {
			cashInventory.put(coin, 5);
		}

		for (Item item : Item.values()) {
			itemInventory.put(item, 5);
		}
	}

	@Override
	public long SelectItemAndGetPrice(Item item) {
		if (itemInventory.hasItem(item)) {
			currentItem = item;
			return currentItem.getPrice();
		}
		throw new SoldOutException("Sold Out, Please buy another item");
	}

	@Override
	public void insertCoin(Coin coin) {
		currentBalance = currentBalance + coin.getValue();
		cashInventory.add(coin);
	}

	@Override
	public List<Coin> refund() {
		List<Coin> refund = getChange(currentBalance);
		updateCashInventory(refund);
		currentBalance = 0;
		currentItem = null;
		return refund;
	}

	@Override
	public Bucket<Item, List<Coin>> collectItemAndChange() {
		Item item = collectItem();
		totalsales = totalsales + currentItem.getPrice();
		List<Coin> change = collectChange();
		return new Bucket<Item, List<Coin>>(item, change);
	}

	private List<Coin> collectChange() {
		long changeAmount = currentBalance - currentItem.getPrice();
		List<Coin> change = getChange(changeAmount);
		updateCashInventory(change);
		currentBalance = 0;
		currentItem = null;
		return change;
	}

	private void updateCashInventory(List<Coin> change) {
		for (Coin c : change) {
			cashInventory.deduct(c);
		}
	}

	private Item collectItem() throws NotSufficientChangeException, NotFullPaidException {
		if (isFullPaid()) {
			if (hasSufficientChange()) {
				itemInventory.deduct(currentItem);
				return currentItem;
			}
			throw new NotSufficientChangeException("Not Sufficient change in Inventory");
		}

		long remainingBalance = currentItem.getPrice() - currentBalance;
		throw new NotFullPaidException("Price not full paid, remaining : ", remainingBalance);
	}

	private boolean hasSufficientChange() {
		return hasSufficientChangeForAmount(currentBalance - currentItem.getPrice());
	}

	private boolean hasSufficientChangeForAmount(long amount) {
		boolean hasChange = true;
		try {
			getChange(amount);
		} catch (NotSufficientChangeException nsce) {
			return hasChange = false;
		}
		return hasChange;
	}

	private List<Coin> getChange(long amount) {
		List<Coin> changes = Collections.EMPTY_LIST;
		if (amount > 0) {
			changes = new ArrayList<Coin>();
			long balance = amount;
			while (balance > 0) {
				if (balance >= Coin.QUARTER.getValue() && cashInventory.hasItem(Coin.QUARTER)) {
					changes.add(Coin.QUARTER);
					balance = balance - Coin.QUARTER.getValue();
					continue;
				} else if (balance >= Coin.DIME.getValue() && cashInventory.hasItem(Coin.DIME)) {
					changes.add(Coin.DIME);
					balance = balance - Coin.DIME.getValue();
					continue;
				} else if (balance >= Coin.NICKLE.getValue() && cashInventory.hasItem(Coin.NICKLE)) {
					changes.add(Coin.NICKLE);
					balance = balance - Coin.NICKLE.getValue();
					continue;
				} else if (balance >= Coin.PENNY.getValue() && cashInventory.hasItem(Coin.PENNY)) {
					changes.add(Coin.PENNY);
					balance = balance - Coin.PENNY.getValue();
					continue;
				} else {
					throw new NotSufficientChangeException("NotSufficientChange, Please try another product");
				}
			}
		}
		return changes;
	}

	private boolean isFullPaid() {
		if (currentBalance >= currentItem.getPrice()) {
			return true;
		}
		return false;
	}

	@Override
	public void reset() {
		cashInventory.clear();
		itemInventory.clear();
		totalsales = 0;
		currentItem = null;
		currentBalance = 0;
	}

	public void printStats() {
		System.out.println("Total Sales : " + totalsales);
		System.out.println("Current Item Inventory : " + itemInventory);
		System.out.println("Current Cash Inventory : " + cashInventory);
	}

	public long getTotalSales() {
		return totalsales;
	}
}
