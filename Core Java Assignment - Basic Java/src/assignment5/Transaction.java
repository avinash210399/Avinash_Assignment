package assignment5;

public class Transaction {
	int year,value;
	Trader t;
	public Transaction(int year, int value, Trader t) {
		super();
		this.year = year;
		this.value = value;
		this.t = t;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public Trader getT() {
		return t;
	}
	
	@Override
	public String toString() {
		return "Trasaction [year=" + year + ", value=" + value + ", t=" + t + "]";
	}
	public void setT(Trader t) {
		this.t = t;
	}
	


}
