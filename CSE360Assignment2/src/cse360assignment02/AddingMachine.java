package cse360assignment02;

public class AddingMachine {
	private int total;

	private String tostring;

	public AddingMachine() {
		total = 0; // not needed - included for clarity
		tostring = "0";
	}

	public int getTotal() {
		return total;
	}

	public void add(int value) {
		total += value;
		tostring = tostring + " + " + value;
	}

	public void subtract(int value) {
		total -= value;
		tostring = tostring + " - " + value;
	}

	public String toString() {
		return tostring;
	}

	public void clear() {
		tostring = "0";
		total = 0;
	}
}
