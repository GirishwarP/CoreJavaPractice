package com.VendingMachine;

public class VendingMachineFactory {

	public static VendingMachine createVendingMachine() {
		return new VendingMachineImpl();
	}
}
